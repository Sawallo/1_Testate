public class Animal implements Comparable<Animal> {

    private String name;
    private int alter;

    public Animal (String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }
}
