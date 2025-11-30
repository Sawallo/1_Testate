import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class utils {
    
    public static void saveScore(Score s, String name) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(s);
        }
    }


}
