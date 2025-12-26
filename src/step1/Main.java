package step1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, JAVA!");
        System.out.printf("Hier haben wir %s als Wert%n", "Hallo");

        // Variablen
        String meinName = "Irina"; // Deklaration und Initialisierung
        System.out.printf("Hallo mein Name ist %s%n", meinName);
        int jahresZahl; // Deklaration
        jahresZahl = 0; // Initialisierung
        long langeGanzZahl = 3L;
        double fließkomma = 1.5;
        float kleinereFließkommaZahl = 0.5F;
        char character = 'A';
        boolean meineBedingung = true;

        // Strukturelemente
        // Verzweigung
        if (jahresZahl < 10) {
            System.out.println("Fall 1");
        } else {
            System.out.println("Fall 2");
        }

        if (jahresZahl < 0) {
            System.out.println("Negativ");
        } else if (jahresZahl < 10) {
            System.out.println("Kleiner als 10");
        } else {
            System.out.println("Größer oder gleich 10");
        }

        if (false) {
            System.out.println("Passiert nie!");
        }

        // Iteration (Schleifen)
        for (int i = 0; i < 10; i++) System.out.println(i);
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Datenverarbeitung mit Operatoren
        // Arithmetisch + - * /
        int produkt = 1 + 3 * 3;
        System.out.println(produkt);

        // String Konkatenation
        String konkatenation = "Hallo" + " Welt";
        System.out.println(1 + 2 + "Hallo"); // (1 + 2) + "Hallo" -> 3 + "Hallo" -> "3Hallo"
        System.out.println("Hallo" + 1 + 2); // ("Hallo" + 1) + 2 -> "Hallo1" + 2 -> "Hallo12"

        // Vergleich und logische (boolsche) Operatoren
        boolean istWahr = "a" == "a" && 10 == 10; // == (Vergleich) bindet stärker als && (und)
        boolean istAuchWahr = 1 < 3 || 3 <= 3; // < (kleiner) bzw. <= (kleiner-gleich) binden stärker als || (oder)
        if (istWahr) System.out.println("Juhuu!");

        // Operator "Negation"
        boolean istUnwahr = !istWahr;
        boolean istUngleich1 = 5 != 10; // true, denn 5 ist ungleich 10
        boolean genausoWieUngleich1 = !(5 == 10);
        boolean istUngleich2 = 10 != 10; // false, denn 10 ist gleich 10 (10 ist NICHT ungleich 10)

        // Modulo
        int rest = 13 % 4;
        System.out.println(rest);

        // Eigene Methode ist auch "nur" ein Kontext (Scope)
        eigeneMethode("Der Wert für unseren Parameter"); // Der Methodenaufruf von meineMethode mit einem String-Wert als Argument
    }

    public static void eigeneMethode(String unserParameter) { // Implementierung einer Methode "eigeneMethode", die einen String als Parameter erwartet
        System.out.println("Es passiert etwas!, und zwar " + unserParameter); // Verwendung des Parameters in einer Konkatenation
    }

}
