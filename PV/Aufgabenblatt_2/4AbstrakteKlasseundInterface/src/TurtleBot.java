public class TurtleBot extends MobileRobot implements Drivable {

    @Override
    public void driveForward(double distance) {
        positionX = distance;
        positionY = distance;
    }

   
   @Override
    public String bringup() {
      return "Turtle Bot wird gestartet... ";
    }


    

   

}
