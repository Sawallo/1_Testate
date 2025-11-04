import java.io.IOException;

public class ExceptionHandler {

    public  void handleExceptionsSeparately(){
        try {
           throw new IOException ("");
           
        } catch (IOException e) {
            System.out.println("IOException abgefangen");
            e.printStackTrace();
        } try {
            int zahl = Integer.parseInt("abc");
        }catch (NumberFormatException e2) {
			System.err.println("NumberFormatException abgefangen");
            e2.printStackTrace();
		}try {
          int zahl2 = 10/0;
            
        } catch (ArithmeticException e3) {
            System.out.println("ArithmeticException abgefangen");
            e3.printStackTrace();
        }


    }

     public void handleExceptionsWithMultiCatch(){
      try {
        int zahl2 = 10/0;
        int zahl = Integer.parseInt("abc");
        throw new IOException ("");
        

      } catch (IOException |NumberFormatException|ArithmeticException e4) {
        System.err.println(e4+ " Ausgelöst");
        e4.printStackTrace();
      }
    }

    public static void main(String[] args)  {
        
        ExceptionHandler a = new ExceptionHandler();
        a.handleExceptionsSeparately();
        a.handleExceptionsWithMultiCatch();
       

        
    }
}
