public class Geometriker {
    public static void main(String[] args) {
        
        System.out.println("Point: ");
        Point p1 = new Point(10, 20);
        Point p2 = new Point(15, 30);
        System.out.println("compareTo: "+p1.compareTo(p2));

        System.out.println("\nPoint2D: ");
        Point2D pd1 = new Point2D(16, 20);
        Point2D pd2 = new Point2D(25, 29);
        System.out.println("compareTo: "+pd1.compareTo(pd2));
        System.out.println("encapsulate: "+pd1.encapsulate(pd2));
        System.out.println("dimensions: "+pd1.dimensions());

        System.out.println("\nRectangle: ");
        Rectangle r1 = new Rectangle(new Point2D(15, 23), new Point2D(34, 18));
        Rectangle r2 = new Rectangle(new Point2D(60, 10), new Point2D(21, 24));
        System.out.println("compareTo: "+r1.compareTo(r2));
        System.out.println("compareTo: "+r2.compareTo(r1));
        System.out.println("encapsulate r + r: "+r1.encapsulate(r2));
        System.out.println("encapsulate r + p: "+r1.encapsulate(pd1));
        System.out.println("dimensions: "+r1.dimensions());
        System.out.println("volume: "+r1.volume());
        System.out.println("volume: "+r1.encapsulate(r2).volume());

        System.out.println("\nVolume: ");
        //Volume v1 = new Volume(new Point(15, 23, 42), new Point(34, 18, 40));
        //Volume v2 = new Volume(new Point(60, 10, 15), new Point(21, 24, 30));
        Volume v1 = new Volume(new Point( 23, 42), new Point( 18, 40));
        Volume v2 = new Volume(new Point( 10, 20), new Point( 24, 30));
        System.out.println("compareTo: "+v1.compareTo(v2));
        System.out.println("compareTo: "+v2.compareTo(v1));
        System.out.println("encapsulate v + v: "+v1.encapsulate(v2));
        System.out.println("encapsulate v + p: "+v1.encapsulate(pd1));
        System.out.println("volume: "+v2.volume());

        //a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
    }
}
