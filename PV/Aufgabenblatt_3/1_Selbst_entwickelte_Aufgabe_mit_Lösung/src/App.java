
// Erstelle ein Java-Programm mit Swing, das ein Fenster mit BorderLayout und einem horizontalen und vertikalen Abstand (Hgap, Vgap) von 10 Pixeln anzeigt.
// Füge fünf Buttons in den Bereichen NORTH, SOUTH, EAST, WEST und CENTER hinzu.


import javax.swing.*;
import java.awt.*;



public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("MainFrame");
        frame.setSize(500, 500);


        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        frame.setLayout(layout);

        

        frame.add(new JButton("Oben"), BorderLayout.NORTH);
        frame.add(new JButton("Unten"), BorderLayout.SOUTH);
        frame.add(new JButton("Rechts"), BorderLayout.EAST);
        frame.add(new JButton("Links"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);
        
        frame.setVisible(true);
       
    }
}
