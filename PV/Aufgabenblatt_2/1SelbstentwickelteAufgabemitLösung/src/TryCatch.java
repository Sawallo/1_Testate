/*
Schreibe ein Java-Programm, das:

den Benutzer nach einer ganzen Zahl fragt
versucht, die Eingabe als int einzulesen
bei ungültiger Eingabe eine Fehlermeldung ausgibt
(z. B. „Fehler: Bitte gib eine Zahl ein!“)

Nach einer gültigen Eingabe soll die eingegebene Zahl angezeigt werden.
 */


import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Gib eine Zahl ein: ");
            int zahl = sc.nextInt();
            System.out.println("Du hast die Zahl " + zahl + " eingegeben!");
        } catch (Exception e) {
            System.out.println("Das war keine gültige Zahl!");
        }
    }
}