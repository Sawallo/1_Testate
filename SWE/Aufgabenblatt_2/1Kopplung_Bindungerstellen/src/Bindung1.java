class Schritt1 {
    void s() {

        new Schritt2().s(); //sequenzieller Aufruf des nächsten Schrittes
    }
}


class Schritt2 {
    void s() {
        System.out.println("Ende");
    }
}


public class Bindung1 {

    public static void main(String[] args) {
        
        Schritt1 weg = new Schritt1();

        weg.s();

    }
}