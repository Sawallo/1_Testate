//Stempelkopplungsbeispiel

class Data { //Objekt
<<<<<<< HEAD
    int x, y;
=======

    int x;
    int y;

>>>>>>> 0777ccb16ca222a79896fbeb3a4e8cb387b3f70e
    Data(int x, int y) { 
        this.x = x; this.y = y; 
    }
}


<<<<<<< HEAD
class Stempelkopplung {
=======
class Kopplung1 {
>>>>>>> 0777ccb16ca222a79896fbeb3a4e8cb387b3f70e

    void test(Data beispiel) { //ganzes Objekt übergeben
        System.out.println(beispiel.x); //nutzt aber nur x
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        
        Stempelkopplung abc = new Stempelkopplung();
        Data def = new Data(1, 2);
        abc.test(def);
    }
}
=======

        Kopplung1 kopp = new Kopplung1();
        Data def = new Data(10, 20);
        kopp.test(def);

    }
}
>>>>>>> 0777ccb16ca222a79896fbeb3a4e8cb387b3f70e
