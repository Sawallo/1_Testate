import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        


        
                    
        String[] layout = {
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWW",
            "WP...........WW............W",
            "W.WWWW.WWWWW.WW.WWWWW.WWWW.W",
            "W.WWWW.WWWWW.WW.WWWWW.WWWW.W",
            "W.WWWW.WWWWW.WW.WWWWW.WWWW.W",
            "W..........................W",
            "W.WWWW.WW.WWWWWWWW.WW.WWWW.W",
            "W.WWWW.WW.WWWWWWWW.WW.WWWW.W",
            "W......WW....WW....WW......W",
            "WWWWWW.WWWWW.WW.WWWWW.WWWWWW",
            "WWWWWW.WWWWW.WW.WWWWW.WWWWWW",
            "WWWWWW.WW..........WW.WWWWWW",
            "WWWWWW.WW.WWW--WWW.WW.WWWWWW",
            "WWWWWW.WW.W      W.WW.WWWWWW",
            "WWWWWW....W      W....WWWWWW",
            "WWWWWW.WW.W      W.WW.WWWWWW",
            "WWWWWW.WW.WWWWWWWW.WW.WWWWWW",
            "WWWWWW.WW..........WW.WWWWWW",
            "WWWWWW.WW.WWWWWWWW.WW.WWWWWW",
            "WWWWWW.WW.WWWWWWWW.WW.WWWWWW",
            "W............WW............W",
            "W.WWWW.WWWWW.WW.WWWWW.WWWW.W",
            "W.WWWW.WWWWW.WW.WWWWW.WWWW.W",
            "W...WW................WW...W",
            "WWW.WW.WW.WWWWWWWW.WW.WW.WWW",
            "W......WW....WW....WW......W",
            "W.WWWWWWWWWW.WW.WWWWWWWWWW.W",
            "W..........................W",
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWW"
        };
        
        Grid<GameObject> Feld = new Grid<>(28, 29);
        Player p = new Player(1, 1);
        for (int y = 0; y < 29; y++) {
            for (int x = 0; x < 28; x++) {

                char c = layout[y].charAt(x);
                switch(c) {
                    case 'W':
                        Feld.addObj(new Wall(x, y));
                        break;
                    case '.':
                        Feld.addObj(new Dot(x, y));
                        break;
                    case 'P':
                        Feld.addObj(p);
                        break;
                    case 'G':
                        
                
                }

            System.out.println("1");
            
            
            }
        }


    





    
        


        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Pac-Man");

        
        GameGUI fenster = new GameGUI(Feld);
        window.add(fenster);

        
        window.setSize(1200, 1200); 
        window.setLocationRelativeTo(null); //mitte
        window.setVisible(true);

        //steuerung
        window.requestFocus();
        window.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyPressed(KeyEvent e){
                int newX = p.getX();
                int newY = p.getY();
                int key = e.getKeyCode();

                System.out.println(e.getKeyCode());

                if (key == KeyEvent.VK_UP) {
                    newY--;
                } 
                if (key == KeyEvent.VK_DOWN) {
                    newY++;
                } 
                if (key == KeyEvent.VK_LEFT) {
                    newX--;
                } 
                if (key == KeyEvent.VK_RIGHT) {
                    newX++;
                }
        try {
          Feld.move(p,newX,newY);  
          fenster.repaint();
        } catch (Exception fehler) {
            System.out.println(fehler.getMessage());
        }
        

        }

        });


   



    }



}


    
    
        
    
    
   

    


