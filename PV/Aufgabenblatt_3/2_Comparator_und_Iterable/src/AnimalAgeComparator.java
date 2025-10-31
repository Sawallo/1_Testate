import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    public int compare(Animal eins, Animal zwei) {
        return Integer.compare(eins.getAlter(), zwei.getAlter());
    }

}
