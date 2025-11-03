//Rectangle - Ein Rechteck, das mit zwei Objekten vom Typ Point2D erzeugt werden kann. 

public class Rectangle extends Geometry implements Comparable<Geometry>{

    private Point2D ul; //unten links
    private Point2D or; //oben rechts


    public Rectangle(int dimension) {
        super(dimension);
    }

    public Rectangle(Point2D eins, Point2D zwei){
        if (eins.koords[0] < zwei.koords[0]){
            this.ul = eins;
            this.or = zwei;
        }
        this.or = eins;
        this.ul = zwei;
    }

        public int dimensions() {
        return 2;
    }

    public double volume(){
        return 1;
    }

    public Geometry encapsulate(Geometry other){
        return other;
    }

    public int compareTo(Geometry other){
        return 2;
    }

}
