public abstract class MobileRobot {
double positionX;
double positionY;
double positionZ;

public abstract String bringup();

public static void main(String[] args) {
    
    

    Drone eins = new Drone();
    eins.flyForward(11);
    System.out.println(eins.bringup()+ "Der Roboter befindet sich an der Stelle "+"X:"+eins.positionX+", Y:"+eins.positionY+", Z:"+eins.positionZ);


    Drone zwei = new Drone();
    zwei.flyForward(24);
    System.out.println(zwei.bringup()+ "Der Roboter befindet sich an der Stelle "+"X:"+zwei.positionX+", Y:"+zwei.positionY+", Z:"+zwei.positionZ);
    

    TurtleBot Uno = new TurtleBot();
    Uno.driveForward(4);
    System.out.println(Uno.bringup()+ "Der Roboter befindet sich an der Stelle "+"X:"+Uno.positionX+", Y:"+Uno.positionY+", Z:"+Uno.positionZ);

    TurtleBot Dos = new TurtleBot();
    Dos.driveForward(2);
    System.out.println(Dos.bringup()+ "Der Roboter befindet sich an der Stelle "+"X:"+Dos.positionX+", Y:"+Dos.positionY+", Z:"+Dos.positionZ);


}



}
