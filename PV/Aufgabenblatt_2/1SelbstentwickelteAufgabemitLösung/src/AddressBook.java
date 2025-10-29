import java.io.*;
import java.util.*;

public class AddressBook implements Serializable {
    private static final long serialVersionUID = 2L;
    private List<Contact> contacts = new ArrayList<>();

    public void add(Contact c) { contacts.add(c); }

    public void save(File f) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                 new FileOutputStream(f))) {
            oos.writeObject(this);
        }
    }

    public static AddressBook load(File f)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                 new FileInputStream(f))) {
            return (AddressBook) ois.readObject();
        }
    }

    public static void main(String[] args) {
        File file = new File("book.ser");
        try {
            AddressBook book = new AddressBook();
            book.add(new Contact("Bernd", "0123", "pass"));
            book.add(new Contact("Berta", "0456", "wort"));

            book.save(file);
            System.out.println("Serialisiert.");

            AddressBook loaded = AddressBook.load(file);
            System.out.println("Deserialisiert:");
            loaded.contacts.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}