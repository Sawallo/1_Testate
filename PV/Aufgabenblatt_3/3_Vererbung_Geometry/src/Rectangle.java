//Rectangle - Ein Rechteck, das mit zwei Objekten vom Typ Point2D erzeugt werden kann. 

public class Rectangle extends Geometry{

    private Point2D ul; //unten links
    private Point2D or; //oben rechts

    public Rectangle(Point2D eins, Point2D zwei){
        super(eins.dimensions());
        if (eins.getX() < zwei.getX()){
            this.ul = eins;
            this.or = zwei;
        }
        this.or = eins;
        this.ul = zwei;
    }

    public Point2D getUl() {
        return ul;
    }

    public Point2D getOr() {
        return or;
    }

    public int dimensions() {
        return super.dimensions();
    }

    public double volume(){
        double a = Math.abs(this.ul.getX() - this.or.getX());
        double b = Math.abs(this.ul.getY() - this.or.getY());
        return (a * b);
    }

    public Geometry encapsulate(Geometry other){
        if (other instanceof Point2D) {

            Point2D ueber = (Point2D) other;

            double minx = Math.min(this.ul.getX(), ueber.getX());
            double maxx = Math.max(this.or.getX(), ueber.getX());
            double miny = Math.min(this.ul.getY(), ueber.getY());
            double maxy = Math.max(this.or.getY(), ueber.getY());

        return new Rectangle(new Point2D(minx, miny), new Point2D(maxx, maxy));
        }
        if (other instanceof Rectangle) {

            Rectangle ueber = (Rectangle) other;

            double minx = Math.min(this.ul.getX(), ueber.ul.getX());
            double maxx = Math.max(this.or.getX(), ueber.or.getX());
            double miny = Math.min(this.ul.getY(), ueber.ul.getY());
            double maxy = Math.max(this.or.getY(), ueber.or.getY());

        return new Rectangle(new Point2D(minx, miny), new Point2D(maxx, maxy));
        }
        else return null;
    }

    public int compareTo(Geometry other){
        return Double.compare(this.volume(), other.volume());
    }

}
