import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.List;
import java.util.Set;


public class JCF{

       static void testAdd(Collection<Integer> col){

            long startTimeLL = System.nanoTime();

                        for(Integer i = 0; i<100; i++){
                col.add(i);
            }
            long EndTimeLL = System.nanoTime();
            System.out.println("Die Laufzeit für die Test_Add beträgt " + (EndTimeLL-startTimeLL));
            
        }

        static void testContains(Collection<Integer> col){

             long startTimeLL_Contains = System.nanoTime();
            for(Integer i = 0; i<100; i++){
                col.contains(i);
            }
            long EndTimeLL_Contains = System.nanoTime();
            System.out.println("Die Laufzeit für die testContains beträgt " + (EndTimeLL_Contains-startTimeLL_Contains));


        }

        static void testRemove(Collection<Integer> col){

             long startTimeLL_Contains = System.nanoTime();
           for(Integer i = 0; i<100; i++){
                col.remove(i);
            }
            long EndTimeLL_Contains = System.nanoTime();
            System.out.println("Die Laufzeit für die testRemove beträgt " + (EndTimeLL_Contains-startTimeLL_Contains));


        }

          


         
         
        public static void main(String[] args) {
            List<Integer> LL = new LinkedList<Integer>();
            List<Integer> AL = new ArrayList<Integer>();
            Set<Integer> LHS = new LinkedHashSet<Integer>();

            
            

            testAdd(AL);
            testAdd(LL);
            

           
            

            long startTimeAL = System.nanoTime();
            AL.add(0,2);
            AL.remove(0);
            AL.contains(0);
            long EndTimeAL = System.nanoTime();
            System.out.println("Die Laufzeit für die ArrayList beträgt " + (EndTimeAL-startTimeAL));

            
            
            


        }



}
