public class TestFeld {
    public static void main(String[] args) throws Exception {

        TurtleBot T = new TurtleBot();
        T.bringup();
        T.driveForward(20);
        TurtleBot TB = new TurtleBot();
        TB.bringup();
        TB.driveForward(20);


        Drone D = new Drone();
        D.bringup();
        D.flyForward(10);
        Drone DE = new Drone();
        DE.bringup();
        DE.flyForward(10);

    }
}
