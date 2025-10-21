public class Rechner {
    public static void main(String[] args) {
        
        Fraction eins = new Fraction(5);
        Fraction zwei = new Fraction(2, 8);
        Fraction drei = new Fraction(90);
        Fraction vier = new Fraction(45, 10);

        System.out.println(eins.multiply(5));
        System.out.println(zwei.multiply(eins));
        System.out.println(drei.divide(vier));
        System.out.println(vier.multiply(eins, zwei));


    }
}
 