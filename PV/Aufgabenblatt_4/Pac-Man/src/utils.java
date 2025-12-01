import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class utils {
    
    
    public static void saveScore(Score s, String name) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(s);
        }
    }

    public static Score loadScore(String name) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name))) {
        return (Score) ois.readObject();
    } catch (Exception e) {
        
        return new Score();
    }
}

}
