
public class Grid <T extends GameObject>{

    private int width;
    private int height;
    private GameObject[][] felder;


    public Grid(int width, int height){
        this.width = width;
        this.height = height;
        this.felder = (GameObject[][]) new GameObject[width][height]; 
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    public GameObject get(int x, int y) {
        return felder[x][y];
    }

    public GameObject getObjekT(int x, int y){
        return felder[x][y];
    }
     

    //Objekt wird aufs feld hinzugefügt 
    public void addObj(T obj){
        
        int x = obj.getX();
        int y = obj.getY();
        felder[x][y] = obj ; 

    }


    //Player wird auf dem Feld bewegt 
    public void move(T obj, int newX, int newY) throws InvalidMoveException {
    
        //Exception
        if (felder[newX][newY] instanceof Wall){
            throw new InvalidMoveException("Hier gehts nicht weiter Kollege");
        }
        
        int oldX = obj.getX();
        int oldY = obj.getY();

        //Altes Feld leeren
        felder[oldX][oldY] = null;

        obj.setX(newX);
        obj.setY(newY);

        felder[newX][newY] = obj;

    }

    //Geister werden bewegt
    public void gmove(T obj, int newX, int newY) throws InvalidMoveException, GameOverException {
        int altX = obj.getX();
        int altY = obj.getY();
        obj.setX(newX);
        obj.setY(newY);

        if (felder[newX][newY] instanceof Player) {
                
                throw new GameOverException("Game Over");
                
                
            }

        else {
            if (felder[newX][newY] instanceof Dot) {
                Dot dot = new Dot(altX, altY);
                felder[altX][altY] = dot;            
            } else {felder[altX][altY] = null;}
        
        }
        felder[newX][newY] = obj;

    }


    //Objekt vom Spielfeld entfernen, z.B. wenn ein Punkt eingesammelt wird
    public void removeP(T obj){
        int x = obj.getX();
        int y = obj.getY();
        felder[x][y] = null;
    }









}

