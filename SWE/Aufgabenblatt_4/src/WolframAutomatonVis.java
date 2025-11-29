/**
 * @author Mathias Menninghaus (mathias.mennighaus@uos.de)
 */
public class WolframAutomatonVis {

   public static void main(String[] args) {
      WolframAutomaton automaton = new Rule104();
      final int size = 80;
      final double seedProbability = 0.5;
      final int cycles = 10;

      boolean[] currentGeneration = new boolean[size];
      for (int i = 0; i < currentGeneration.length; i++) {
         currentGeneration[i] = Math.random() < seedProbability;
      }

      printUniverse(currentGeneration);
      for (int cycle = 0; cycle < cycles; cycle++) {
         currentGeneration = automaton.evolve(currentGeneration);
         printUniverse(currentGeneration);
      }
   }

   private static void printUniverse(boolean[] generation) {
      for (boolean b : generation) {
         if (b) {
            System.out.print('#');
         } else {
            System.out.print('_');
         }
      }
      System.out.println();
   }

}
