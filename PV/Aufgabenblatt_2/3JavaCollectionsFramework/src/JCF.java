import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;


public class JCF{

        
         
         
        public static void main(String[] args) {
            List<Integer> LL = new LinkedList<Integer>();
            List<Integer> AL = new ArrayList<Integer>();
            Map<Integer,Integer> LHM = new LinkedHashMap<Integer,Integer>();

            
            long startTimeLL = System.nanoTime();

            for(Integer i = 0; i<100; i++){
                LL.add(i);
            }
            long EndTimeLL = System.nanoTime();
            System.out.println("Die Laufzeit für die LinkedList_Add beträgt " + (EndTimeLL-startTimeLL));
            
            long startTimeLL_Contains = System.nanoTime();
            for(Integer i = 0; i<100; i++){
                LL.contains(i);
            }
            long EndTimeLL_Contains = System.nanoTime();
            System.out.println("Die Laufzeit für die LinkedList_Contains beträgt " + (EndTimeLL_Contains-startTimeLL_Contains));
            
            long startTimeLL_remove = System.nanoTime();
            for(Integer i = 0; i<100; i++){
                LL.remove(i);
            }
            long EndTimeLL_remove = System.nanoTime();
            System.out.println("Die Laufzeit für die LinkedList_Remove beträgt " + (EndTimeLL_remove-startTimeLL_remove));

            long startTimeAL = System.nanoTime();
            AL.add(0,2);
            AL.remove(0);
            AL.contains(0);
            long EndTimeAL = System.nanoTime();
            System.out.println("Die Laufzeit für die ArrayList beträgt " + (EndTimeAL-startTimeAL));

            LHM.put(1, 1);
            
            


        }



}
