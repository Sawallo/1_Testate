public class Drone extends MobileRobot implements Flyable {

    public void bringup() {
        System.out.println(x+" "+y+" "+z);
    }

    public void flyForward(double distance) {
        System.out.println("Drine fliegt voran");
    }
    
}
