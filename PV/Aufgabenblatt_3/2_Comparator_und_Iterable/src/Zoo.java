import java.util.Arrays;
import java.util.Iterator;

public class Zoo implements Iterable<Animal>{
    
    private Animal [] animals;

    public Zoo(Animal [] liste){
        this.animals = liste;
    }

    public void vergleichealter(Animal [] animals){

        AnimalAgeComparator vergl = new AnimalAgeComparator();
        boolean getauscht;

        do {
            getauscht = false;
            for (int i = 0; i < animals.length - 1; i++) {
                int ausgabe = vergl.compare(animals[i], animals[i+1]);

                if (ausgabe > 0) {
                    Animal hilf = animals[i];
                    animals[i] = animals[i+1];
                    animals[i+1] = hilf;
                    getauscht = true;
                }
            }
        } while (getauscht);
    }

    
    public Iterator<Animal> iterator() {
        return new ZooIterator(animals);
    }

    private class ZooIterator implements Iterator<Animal> {

        private int stelle = 0;
        private Animal [] tiere;

        public ZooIterator(Animal[] liste) {
            this.tiere = liste;
            Arrays.sort(this.tiere);
        }

        public boolean hasNext() {
            return stelle < tiere.length;
        }

        public Animal next() {
            if (!hasNext()) {
                return null;
            }
            return tiere[stelle++];
        }
    }
}
