/**
 * @author Mathias Menninghaus (mathias.mennighaus@uos.de)
 */
public abstract class WolframAutomaton {

   protected final byte rule;

   public WolframAutomaton(byte rule) {
      this.rule = rule;
   }
   
   /* 111 110 101 100 011 010 001 000 */

   public abstract boolean[] evolve(boolean[] lastGeneration);


}
