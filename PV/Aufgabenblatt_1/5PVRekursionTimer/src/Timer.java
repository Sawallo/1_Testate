public class Timer {

    public static void zaehleRunter(int n){
        System.out.println(n);
        
        if (n <= 0) {
            return;
        }
        n = n - 1;

        zaehleRunter(n);
    }

    public static void main(String[] args) throws Exception {
        
        zaehleRunter(20);

    }
}
