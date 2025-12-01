
import javax.swing.SwingUtilities;

public class Ghost extends GameObject implements Runnable{

    private volatile boolean running = true;
    private Grid<GameObject> grid;
    private GameGUI fenster;

    public Ghost(int x, int y){
        super(x, y);
    }    

    @Override
    public void update() {
        //todo
    }

    @Override
    public void move() {
    }

    public void setFenster(GameGUI fenster) {
    this.fenster = fenster;
    }

    public void setGrid(Grid<GameObject> grid){
        this.grid = grid;
    }

    public void run() {
        while(running) {
            try {
                if (Main.getGameOver() == true) {
                    running = false;
                }
                randommove(grid);
                SwingUtilities.invokeLater(() -> fenster.repaint());
                Thread.sleep(80);
            } catch (GameOverException | InterruptedException ex) {
                Main.setGameOver(true);
                running = false;
                
            }
        }
    }

    public void stop() {
        running = false;
    }

    public void randommove(Grid<GameObject> grid) throws GameOverException {
        int x = this.getX();
        int y = this.getY();

        
        
        
        int richtung = (int)(Math.random() * 4);
        int newX = x;
        int newY = y;
        if (richtung == 0) newY--; //hoch
        if (richtung == 1) newY++; //runter
        if (richtung == 2) newX--; //links
        if (richtung == 3) newX++; //rechts

        GameObject ziel = grid.get(newX, newY);
        if (!(ziel instanceof Wall) && !(ziel instanceof Ghost)) {
            try {
                grid.gmove(this, newX, newY);
            } catch (GameOverException ex) {
                Main.setGameOver(true);
                throw new RuntimeException(ex);
            } catch (InvalidMoveException ex) {}
        }
        


    }
}