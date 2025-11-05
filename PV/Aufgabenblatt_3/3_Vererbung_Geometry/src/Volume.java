//Volume - Ein Volume kann durch zwei n-dimensionale Punkte erzeugt werden, die ein rechtwinkliges Volumen aufspannen, dessen Kanten alle achsenparallel verlaufen.

public class Volume extends Geometry {

    private Point eckeeins;
    private Point eckezwei;

    //Konstruktor
    public Volume(Point eins, Point zwei) {
        
        this.eckeeins = eins;
        this.eckezwei = zwei;
    }

    //Methode
    public double volume(){
        double ges = 1.0;

        for (int i = 0; i < this.eckeeins.getKoords().length; i++) {
            ges = ges * Math.abs(this.eckeeins.getKoords()[i] - this.eckezwei.getKoords()[i]);
        }
        return ges;
    }

    public Geometry encapsulate(Geometry other){
        if ((other.dimensions() != this.dimensions())) {
            return null;
        }

        if (other instanceof Rectangle) {

            Rectangle ueber = (Rectangle) other;
            Rectangle das = new Rectangle(new Point2D(eckeeins.getKoords()[0], eckeeins.getKoords()[1]), new Point2D(eckezwei.getKoords()[0], eckezwei.getKoords()[1]));

            double minx = Math.min(das.getUl().getX(), ueber.getUl().getX());
            double maxx = Math.max(das.getOr().getX(), ueber.getOr().getX());
            double miny = Math.min(das.getUl().getY(), ueber.getUl().getY());
            double maxy = Math.max(das.getOr().getY(), ueber.getOr().getY());

        return new Rectangle(new Point2D(minx, miny), new Point2D(maxx, maxy));
        }

        return new Volume(eckeeins, eckezwei);
    }

    public int compareTo(Geometry other){
        return Double.compare(this.volume(), other.volume());
    }
    
    @Override
    public String toString() {
        return "Rectangle von: "+ eckeeins +" bis "+ eckezwei;
    }
}