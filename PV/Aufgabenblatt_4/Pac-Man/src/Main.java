import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {




        
        Grid<GameObject> Feld = new Grid<>(90, 90);
        Player Spieler = new Player(1, 1);
        Wall Wand = new Wall(3,2);
        Feld.addObj(Spieler);
        Feld.addObj(Wand);





        try {
          Feld.move(Spieler,3,2);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        


        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Pac-Man");

        
        GameGUI fenster = new GameGUI();
        window.add(fenster);

        
        window.setSize(900, 900);
        window.setLocationRelativeTo(null); //mitte
        window.setVisible(true);
        window.setVisible(true);



    }


}
