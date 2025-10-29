//Stempelkopplungsbeispiel

class Data { //Objekt

    int x;
    int y;

    Data(int x, int y) { 
        this.x = x; this.y = y; 
    }
}


class Kopplung1 {

    void test(Data beispiel) { //ganzes Objekt übergeben
        System.out.println(beispiel.x); //nutzt aber nur x
    }

    public static void main(String[] args) {

        Kopplung1 kopp = new Kopplung1();
        Data def = new Data(10, 20);
        kopp.test(def);

    }
}
