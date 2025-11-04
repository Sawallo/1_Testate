//Volume - Ein Volume kann durch zwei n-dimensionale Punkte erzeugt werden, die ein rechtwinkliges Volumen aufspannen, dessen Kanten alle achsenparallel verlaufen.

public class Volume extends Geometry implements Comparable<Volume> {

        protected double[] coordinates;

    public Volume(int dimension) {
        super(dimension);
    }

    public int dimensions() {
        return coordinates.length;
    }

    public abstract double volume();

    public abstract Geometry encapsulate(Geometry other);

    public abstract int compareTo(Geometry other);
    
}