//Point2D - Ein zweidimensionaler Punkt der mit zwei double-Werten erzeugt werden kann.

public class Point2D extends Point {

    public Point2D(double x, double y) {
        super(x, y);
    }

    public int dimensions() {
        return koords.length;
    }

    public double volume(){
        return 0;
    }

    public Geometry encapsulate(Geometry other){
        Point2D ueber = (Point2D) other;
        double minx = Math.min(this.koords[0], ueber.koords[0]);
        double maxx = Math.max(this.koords[0], ueber.koords[0]);
        double miny = Math.min(this.koords[1], ueber.koords[1]);
        double maxy = Math.max(this.koords[1], ueber.koords[1]);
        return new Rectangle(new Point2D(minx, miny), new Point2D(maxx, maxy));
    }


    public int compareTo(Geometry other){
        return 1;
    }
    

}
