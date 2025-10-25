public class TurtleBot extends MobileRobot implements Drivable {

    public void bringup() {
        System.out.println(x+" "+y+" "+z);
    }

    public void driveForward(double distance) {
        System.out.println("TrutleBot fährt voraus");
    }
    
}
