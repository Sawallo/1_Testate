import javax.swing.*;
import java.awt.*;

public class Grid <T extends GameObject>{

    private int width;
    private int height;
    private T[][] felder;

    public Grid(int width, int height){
        this.width = width;
        this.height = height;
        this.felder = new GameObject[width][height]; 
    }


}
