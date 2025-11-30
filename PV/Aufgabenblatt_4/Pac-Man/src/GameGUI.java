import javax.swing.JPanel;
import java.awt.*;


public class GameGUI extends JPanel {

    private Grid<GameObject> grid;
    int kasten = 20; 


    public GameGUI(Grid<GameObject> grid){
        this.grid = grid;
    } 

    
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        
        for (int x = 0; x < grid.getWidth(); x++){
            for (int y = 0; y < grid.getHeight(); y++){

               int a = x * kasten;
               int b = y * kasten;

            
                // Raster
                GameObject obj = grid.get(x, y);
                
                if (obj instanceof Wall){
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(a, b, kasten, kasten);
                }

                if (obj instanceof Player){
                    g.setColor(Color.YELLOW);
                    g.fillOval(a, b, kasten, kasten);                    
                }

                if (obj instanceof Dot){
                    g.setColor(Color.RED);
                    g.fillOval(a+5,b+5, 10, 10);
                }
                
                g.drawLine(x*kasten, 0, x*kasten, grid.getHeight()*kasten);
                g.drawLine(0, y*kasten, grid.getWidth()*kasten, y*kasten);
            }
        } 

        

          
        
        
    }

    

}