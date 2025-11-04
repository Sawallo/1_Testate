//Rectangle - Ein Rechteck, das mit zwei Objekten vom Typ Point2D erzeugt werden kann. 

public class Rectangle extends Geometry{

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
        return super.dimensions();
    }

    public double volume(){
        double a = Math.abs(this.ul.koords[0] - this.or.koords[0]);
        double b = Math.abs(this.ul.koords[1] - this.or.koords[1]);
        return (a * b);
    }

    public Geometry encapsulate(Geometry other){
        if (Geometry.equals(Point2D)) {
            
        }
        
        
        
        return other;
    }

    public int compareTo(Geometry other){
        return 2;
    }

}
