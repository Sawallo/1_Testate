import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Main {
 private static boolean gameOver = false;
    public static void main(String[] args) {
        
        


        
        
        String[] layout = {
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWW",
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
            "WWWWWW.WW.W  GG  W.WW.WWWWWW",
            "WWWWWW....W G  G W....WWWWWW",
            "WWWWWW.WW.W  GG  W.WW.WWWWWW",
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
        Score highscore = utils.loadScore("highscore.dat");
        List<Ghost> ghosts = new ArrayList<>();
        List<Dot> dots = new ArrayList<>();
        
        for (int y = 0; y < 29; y++) {
            for (int x = 0; x < 28; x++) {

                char c = layout[y].charAt(x);
                switch(c) {
                    case 'W':
                        Feld.addObj(new Wall(x, y));
                        break;
                    case '.':
                        Dot dot = new Dot(x, y);
                        Feld.addObj(dot);
                        dots.add(dot);
                        break;
                    case 'P':
                        Feld.addObj(p);
                        break;
                    case 'G':
                        Ghost ghost = new Ghost(x, y);
                        Feld.addObj(ghost);
                        ghosts.add(ghost);
                        break;
                
                }
            }
        }

        
    



        
        
        
        

        //Fenster wird erstellt
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        
        GameGUI fenster = new GameGUI(Feld);
        window.add(fenster);

        
        window.setSize(700, 700);
        window.setLocationRelativeTo(null); //mitte
        window.setVisible(true);


        Timer ghostTimer = new Timer(80, e -> {
            try {
                for (Ghost ghost : ghosts) {
                ghost.randommove(Feld);
                    }
                    fenster.repaint();
                } catch (GameOverException ex) {
                    gameOver = true; 
    
                    JOptionPane.showMessageDialog(window, ex.getMessage(), "Game Over", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            });
            ghostTimer.start();


        


        //Steuerung
        window.requestFocus();
        window.addKeyListener(new KeyAdapter() {
            
           
            public void keyPressed(KeyEvent e){

                 if (gameOver==true) {
                    System.out.println("Gameover");
                    return;
                }
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
                    //Feldabfrage
                    GameObject FeldPrüfung = Feld.get(newX, newY);

                    if (FeldPrüfung instanceof Dot) {
                        p.addScore(10);
                        
                    }else if (FeldPrüfung instanceof Ghost) {
                        gameOver = true;
                        ghostTimer.stop();
                    }
                    
                    if (p.getScore() > highscore.getPunkte()) {
                    utils.saveScore(p.getScoreObj(), "highscore.dat");
                }

                    
                    window.setTitle("Punkte: " + p.getScore()+"| Highscore "+highscore.getPunkte());
                    Feld.move(p,newX,newY);
                    fenster.repaint();
                    
                } catch (Exception fehler) {
                    System.out.println(fehler.getMessage());
                }
        
            }

        });

       
        

    }



}


    
    
        
    
    
   

    


