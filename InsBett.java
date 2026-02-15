public class InsBett {

    static class Elter {
        Kind[] kinder;

        Elter(Kind... kinder) {
            this.kinder = kinder;
            System.out.println(kinder.length);
        }

        String abzaehlen(String... reim) {
            String kind = null;
            for (int i = 0; i < reim.length; i++) {
                kind = kinder[i % kinder.length].toString();
                System.out.println(i % kinder.length);
                System.out.println(i +"="+kind);
            }
            return kind;
        }
    }

    static class Kind {
        String name;

        Kind(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Kind ilja = new Kind("Ilja");
        Kind sansa = new Kind("Sansa");
        Elter eve = new Elter(ilja, sansa);
        System.out.println(eve.abzaehlen("Ene", "Mene", "Meck", "Und", "Du", "Bist", "Weg"));
        
    }
}