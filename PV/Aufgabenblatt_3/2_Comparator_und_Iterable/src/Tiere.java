public class Tiere {

    public static void main(String[] args) {
        
        Animal Zebra = new Animal("Zebra", 15);
        Animal Dingo = new Animal("Dingo", 43);
        Animal Giraffe = new Animal("Giraffe", 8);

        Animal [] alle = {Zebra, Dingo, Giraffe};
        Zoo osna = new Zoo(alle);

        System.out.println("Vor jeglicher Sortierung:");
        for (Animal tier : alle) {
            System.out.println(tier.getName() + " " + tier.getAlter());
        }

        osna.vergleichealter(alle);
        System.out.println("\nNach Alter Sortierung:");
        for (Animal tier : alle) {
            System.out.println(tier.getName() + " " + tier.getAlter());
        }

        System.out.println("\nNach Alphabetischer Sortierung:");
        for (Animal tier : osna) {
            System.out.println(tier.getName() + " " + tier.getAlter());
        }
    }
}