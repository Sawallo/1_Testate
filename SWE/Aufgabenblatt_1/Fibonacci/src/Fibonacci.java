public class Fibonacci {

    //Variablen für f0 und f1, um die Zwischenwerte abzuspeichern
    private static int f0;
    private static int f1;

    private static void fib(int n){
        f1 = f0;
        f0 = n;
        n = f0+f1;
        System.out.println(f0+f1); //ausgabe der aktuellen Fibonacci Zahl
        if (n<=2){n++;} //sofern n noch zu klein ist, um sich selbst hochzuaddieren, wird mit jedem durchgang automatisch erhöht
        if (n>20000){return;} //Option um das Programm individuell zu stoppen
        fib(n); //Methode ruft sich eigens wieder rekursiv auf, und übergibt aktuelle Fibonacci Zahl 
    
    }


    public static void main(String[] args) throws Exception {

        fib(0);
    
    }
}
