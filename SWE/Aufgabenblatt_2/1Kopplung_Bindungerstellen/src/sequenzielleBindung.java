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


<<<<<<< HEAD
public class Bindung1 {
=======
public class sequenzielleBindung {
>>>>>>> 0777ccb16ca222a79896fbeb3a4e8cb387b3f70e

    public static void main(String[] args) {

        Schritt1 weg = new Schritt1();

        weg.s();

    }
}