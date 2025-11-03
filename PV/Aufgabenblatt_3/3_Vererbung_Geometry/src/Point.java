//Point - Repräsentiert einen n-dimensionalen Datenpunkt, der mit einer variablen Parameterliste von double-Werten erzeugt werden kann.

public abstract class Point extends Geometry{

    protected double[] koords;

    public Point(int dimension) {
        super(dimension);
    }

    public Point(double... koordinaten) {
        if (koordinaten.length < 2) {
            System.out.println("Es werden mehr Koordinaten beötigt");
        }
        this.koords = koordinaten;
    }

    public int dimensions() {
        return koords.length;
    }

    public abstract double volume();

    public abstract Geometry encapsulate(Geometry other);

    public abstract int compareTo(Geometry other);


}
