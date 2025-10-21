public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction(int n, int d){
        int a = n; // größter gemeinsamer Teiler
        int b = d;
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        
        this.denominator = d / a;
        this.numerator = n / a;
    }

    public Fraction(int n){
        this(n, 1); // Verkettung zu oberen Konstruktor
    }


        //Methoden

    public Fraction multiply(int factor){
        Fraction f = new Fraction(this.numerator * factor, this.denominator);
        return f;
    }

    public Fraction multiply(Fraction factor){
        Fraction f = new Fraction(this.numerator * factor.numerator, this.denominator * factor.denominator);
        return f;
    }

    public Fraction divide(Fraction divisor){
        Fraction f = new Fraction(this.numerator * divisor.denominator, this.denominator * divisor.numerator); //mit dem Kehrwert mal nehmen
        return f;
    }

    public Fraction multiply(Fraction... factors){
        Fraction f = this;
        for (Fraction i : factors) {
            f = f.multiply(i);
        }
        return f;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

}
