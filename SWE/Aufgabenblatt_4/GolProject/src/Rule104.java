/**
 * 000 -> 0  #
 * 001 -> 0  #
 * 010 -> 0  # Dies without enough neighbours
 * 011 -> 1  # Needs one neighbour to survive
 * 100 -> 0  #
 * 101 -> 1  # Two neighbours giving birth
 * 110 -> 1  # Needs one neighbour to survive
 * 111 -> 0  # Starved to death.
 *
 * @author Mathias Menninghaus (mathias.mennighaus@uos.de)
 */
public class Rule104 extends WolframAutomaton {

   public static final boolean T = true;
   public static final boolean F = false;

   public Rule104() {
      super((byte) 104);
   }

   @Override
   public boolean[] evolve(boolean[] lastGeneration) {
	   
	   //Just an Example to show testing exceptions.
	   //Needs to be removed for proper implementation

      // Example: Next generation is just the last generation
      // No logic currently
      boolean[] nextGeneration = new boolean[lastGeneration.length];
      for(int i=0; i<lastGeneration.length; i++){
         nextGeneration[i] = lastGeneration[i]; // einfache kopie
         // Rand links
         if(i==0){

         } else if(i==lastGeneration.length-1){ // Rand rechts

         } else { // Mitte
               boolean beideNachbarnLebendig = lastGeneration[i-1] == true && lastGeneration[i+1] == true ;
               if(beideNachbarnLebendig && lastGeneration[i] == true){
                  nextGeneration[i] = false;
                  
               } else {nextGeneration[i] = true;}

               
         }
      }
      
      return nextGeneration;
   }

   public static void main(String[] args) {
      Rule104 bro = new Rule104();

      
      System.out.println(bro.evolve(new boolean[]{true, true, true}));
   }


}
