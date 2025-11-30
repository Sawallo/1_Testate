import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GameGUI extends JPanel {

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.RED);
        g.fillOval(50, 50, 10, 10);
    }
}