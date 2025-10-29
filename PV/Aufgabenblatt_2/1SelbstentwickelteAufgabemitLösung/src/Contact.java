import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name, phone;
    private transient String passwort;  // wird nicht mitgespeichert

    public Contact(String name, String phone, String pw) {
        this.name = name;
        this.phone = phone;
        this.passwort = pw;
    }

    public String toString() {
        return name +" "+ phone +" "+ passwort;  // nach Deserialisierung null
    }
}