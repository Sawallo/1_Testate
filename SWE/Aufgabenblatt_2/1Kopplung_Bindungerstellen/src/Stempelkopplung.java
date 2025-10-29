//Stempelkopplungsbeispiel

class Data { //Objekt
    int x, y;
    Data(int x, int y) { 
        this.x = x; this.y = y; 
    }
}


class Stempelkopplung {

    void test(Data beispiel) { //ganzes Objekt übergeben
        System.out.println(beispiel.x); //nutzt aber nur x
    }

    public static void main(String[] args) {
        
        Stempelkopplung abc = new Stempelkopplung();
        Data def = new Data(1, 2);
        abc.test(def);
    }
}