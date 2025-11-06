public class Drone extends MobileRobot implements Flyable {


    @Override
    public void flyForward(double distance) {
     positionX = distance;
     positionZ = distance;
     positionY = distance;       
    }

    @Override
    public String bringup() {
      return "Drone wird gestartet... ";
    }

}
