//Point2D - Ein zweidimensionaler Punkt der mit zwei double-Werten erzeugt werden kann.

public class Point2D extends Geometry {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        super(2);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point2D(){

    }
            

    public double volume(){
        return 0.0;
    }

    public Geometry encapsulate(Geometry other){
        Point2D ueber = (Point2D) other;
        double minx = Math.min(this.x, ueber.x);
        double maxx = Math.max(this.x, ueber.x);
        double miny = Math.min(this.y, ueber.y);
        double maxy = Math.max(this.y, ueber.y);
        return new Rectangle(new Point2D(minx, miny), new Point2D(maxx, maxy));
    }


    public int compareTo(Geometry other){
        return Double.compare(this.volume(), other.volume());
    }
    
    public String toString() {
        return "("+x+"/"+y+")";
    }

}
