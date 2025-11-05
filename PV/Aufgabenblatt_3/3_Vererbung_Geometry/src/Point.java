//Point - Repräsentiert einen n-dimensionalen Datenpunkt, der mit einer variablen Parameterliste von double-Werten erzeugt werden kann.

public class Point extends Point2D{

    private double[] koords;

    public Point(double... koordinaten) {
        
        if (koordinaten.length < 2) {
            System.out.println("Es werden mehr Koordinaten beötigt");
        }
        this.koords = koordinaten;
    }

    public double[] getKoords() {
        return koords;
    }


    public Geometry encapsulate(Geometry other){
        if (koords.length == 2) {
            Point2D ueber = new Point2D(koords[0], koords[1]);
            return ueber.encapsulate(other);
        }
        return null;
    }

    public String toString() {
        return "("+koords[0]+"/"+koords[1]+")";
    }
}
