package step5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner zum Auslesen von Nutzereingaben:
        // Ein Scanner ist ein Hilfsobjekt, NICHT die Eingabe selbst.
        // Wir können verschiedene Datentypen abgreifen (.nextLine() -> String, .nextInt() -> int ...)

        // Variable vom Typ 'Scanner'
        // Deklaration eines Scanner-Objekts (einer Instanz)
        // 'new Scanner(System.in)' -> Eine Methode (Konstruktor), der wir den Input Stream übergeben, und aus der ein neuer Scanner entsteht
        Scanner eingabeHelfer = new Scanner(System.in);

        System.out.println("Willkommen Spieler! Bitte geben Sie Ihren Namen ein: ");
        String spielerName = eingabeHelfer.nextLine(); // Blockierende Anweisung (Blocking Expression)
        System.out.println("Alles klar, " + spielerName + ", willkommen im Club!");

        System.out.println("Welche Profession ist die Deine?");
        System.out.printf("1: Magier%n2: Krieger%n3: Todesritter%n4: Heiler%n");
        // .nextInt() versucht die Eingabe (String) in einen int zu konvertieren, was schiefgehen kann und dann zu einer Exception führt.
        // (Diese könnten wir jetzt abfangen, um unerwartete Eingaben zu verarbeiten.)
        String profession = "";
        try {
            int professionsNummer = eingabeHelfer.nextInt(); // Blockierende Anweisung (Blocking Expression)
            switch (professionsNummer) {
                case 1:
                    System.out.println("Willkommen, Meister des Arcanen!");
                    profession = "Magier";
                    break;
                case 2:
                    System.out.println("Hoch das Schwert!");
                    profession = "Krieger";
                    break;
                case 3:
                    System.out.println("Es lebt!");
                    profession = "Todesritter";
                    break;
                case 4:
                    System.out.println("Helden sterben nicht!");
                    profession = "Heiler";
                    break;
                default:
                    System.out.println("Falsche Eingabe: Für diese Zahl gibt es keine Profession!");
                    profession = "nicht definiert";
            }
        } catch (InputMismatchException e) {
            System.out.println("Falsche Eingabe: Das war keine Zahl!");
        }
        System.out.println(profession);

        // Weitere Möglichkeiten zur Konvertierung
        // Helfer Klassen der Datentypen
        eingabeHelfer.nextLine(); // Wir schieben die aktuelle Position des Scanners weiter, um den leeren String ("") zu ignorieren, der übriggeblieben ist, weil .nextInt() den Scanner nicht genauso weiterschiebt wie .nextLine()
        String eineTextEingabe = eingabeHelfer.nextLine(); // ... dadurch ist das hier wieder eine normale, blockierende Eingabe
        int ganzzahl = Integer.parseInt(eineTextEingabe); // "to parse" -> lesen / konvertieren aus der Wrapper-Klasse (Helfer-Klasse)
        double kommazahl = Double.parseDouble(eineTextEingabe);
        System.out.println(ganzzahl);
        System.out.println(kommazahl);
    }


}
