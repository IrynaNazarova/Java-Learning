package step6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array Deklaration
        int[] erscheinungsDatenVonFilmen = new int[10]; // eine Variable vom Typ "Array von ints" oder "int-Array", initialisiert mit dem new Keyword, mit der Größe von 10 Elementen
        erscheinungsDatenVonFilmen[0] = 1999;
        erscheinungsDatenVonFilmen[1] = 1990;
        erscheinungsDatenVonFilmen[2] = 2025;
        erscheinungsDatenVonFilmen[3] = 2025;
        // ...
        System.out.println(erscheinungsDatenVonFilmen[0]); // Auslesen
        System.out.println(erscheinungsDatenVonFilmen[9]); // Nicht beschriebene Indices speichern den Standardwert

        // Iteration
        System.out.println("---- iteration ----");
        int[] aufsteigendeZahlen = new int[4];
        // befüllen eines Arrays
        for (int i = 0; i < aufsteigendeZahlen.length; i++) {
            aufsteigendeZahlen[i] = i + 1;
        }
        // Auslesen von jedem Element
        for (int i = 0; i < aufsteigendeZahlen.length; i++) {
            System.out.println(aufsteigendeZahlen[i]);
        }

        // Helfer-Klasse
        String[] filmeInMeinemSchrank = new String[20];
        Arrays.fill(filmeInMeinemSchrank, "leeres Fach"); // Helfer Methode zum Befüllen aller Elemente mit einem Startwert
        for (int i = 0; i < filmeInMeinemSchrank.length; i++) {
            System.out.println(filmeInMeinemSchrank[i]);
        }
        // Array ([]) ist ein Objekt, also Referenz-Typ (Reference Type) und daher ist das Argument der Methode Arrays.fill eine Referenz vom Speicherort (und keine Kopie vom Wert)
        // int ist ein Wert-Typ (Value Type) und daher ist das Argument der Methode integerFill eine Kopie vom Wert (und nicht eine Referenz vom Speicherort)
        int eineTolleZahl = 1;
        integerFill(eineTolleZahl);
        System.out.println(eineTolleZahl);

        // Ausgabe mit Helfern
        System.out.println(Arrays.toString(aufsteigendeZahlen)); // Macht aus der Adresse eine hübsche String-Darstellung

        // For-Each
        // Im Gegensatz zu "for i", arbeiten wir nicht mit dem Index
        // Ein Beispiel wäre das Durchsuchen
        int gefundenerWert = -1;
        for (int wertJedesElements : aufsteigendeZahlen) {
            System.out.println(wertJedesElements);
            if (wertJedesElements == 4) {
                gefundenerWert = wertJedesElements;
                break;
            }
        }
        if (gefundenerWert != -1) System.out.println("Ja wir haben eine 4 im Array gefunden!");


        // Equals
        int[] zeitStempelVomTagesablauf = new int[3];
        zeitStempelVomTagesablauf[0] = 0600;
        zeitStempelVomTagesablauf[1] = 1600;
        zeitStempelVomTagesablauf[2] = 2000;
        int[] zeitStempelVomTatverlauf = new int[3];
        zeitStempelVomTatverlauf[0] = 0600;
        zeitStempelVomTatverlauf[1] = 1600;
        zeitStempelVomTatverlauf[2] = 2000;

        if (Arrays.equals(zeitStempelVomTagesablauf, zeitStempelVomTatverlauf)) // == würde die Adressen vergleichen, nicht die Objekte dahinter
            System.out.println("Ja, Zeiten stimmen überein!");
        else
            System.out.println("Nein, muss jemand anderes gewesen sein!");


        // Strings sind auch nur verkettete Chars
        for (char jedesZeichen : "Hallo Welt!".toCharArray()) {
            System.out.println(jedesZeichen);
        }
        System.out.println("Der char an Index Position 0:");
        System.out.println("Hallo Welt!".charAt(0));
    }

    public static void integerFill(int value) {
        value = 5;
    }
}
