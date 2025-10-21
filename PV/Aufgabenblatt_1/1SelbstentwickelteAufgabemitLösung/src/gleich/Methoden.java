/*
 * Aufgabe:
 * Zeige anhand eines selbst programmierten Beispiels den Begriff "Pakessichtbarkeit".
 * Nutze hierfür drei Klassen mit zwei in einem Paket und einer in einem anderen.
 * Schreibe in einer der beiden Klassen des selben Pakets nun zwei Methoden.
 * Eine Methode ist public während die andere keine Sichtbarkeitsspezifikationen hat.
 * Greife nun von den zwei anderen Klassen auf diese Methoden zu.
 */

package src.gleich;

public class Methoden {

    public String hund(){
        return "wuff";
    }

    String katze(){
        return "miau";
    }

}

