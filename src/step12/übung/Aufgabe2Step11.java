package step12.übung;

    /*
    3 Methoden
        a)
            wie sortieren wir eigentlich? (Collection.sort)
        b)
        c)
    Endlos-Schleife, Abbruchbedingung unklar!
    Schritte:
        eingabe String
        Leerzeichen -> Fehlermeldung
        doppelte Eingabe -> Fehlermeldung
        keine Fehler -> Eingabe aufnehmen
    alle Eingaben ausgeben
    */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aufgabe2Step11 {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bitte gebe ein Wort ein: ");
            String eingabe = scanner.nextLine();
            if (HatLeerzeichen(eingabe)) System.out.println("Fehler: Deine Eingabe hat Leerzeichen!");
            else if (SchonVorhanden(liste, eingabe)) System.out.println("Fehler: Deine Eingabe ist schon vorhanden!");
            else liste.add(eingabe);

            System.out.print("Möchtest Du noch mehr Wörter eingeben? [j/n] ");
            if (scanner.nextLine().equals("n")) break;
        }

        System.out.println("Hier alle Deine Eingaben, aufsteigend sortiert:");
        SchreibeListe(liste);

        /*
        // Test code
        ArrayList<String> l = new ArrayList<>();
        l.add("Test");
        l.add("Oder");
        l.add("So");
        l.add("1");
        l.add("2");
        l.add("11");
        SchreibeListe(l);

        System.out.println(HatLeerzeichen("Wert zum Testen"));
        System.out.println(HatLeerzeichen("WertZuTesten"));

        System.out.println(SchonVorhanden(l, "Wert zum Testen"));
        System.out.println(SchonVorhanden(l, "Oder"));
        */
    }

    public static void SchreibeListe(ArrayList<String> l) {
        Collections.sort(l); // A-Za-z
        for (String element : l) System.out.println(element);
    }

    public static boolean HatLeerzeichen(String s) {
        boolean b = s.contains(" ");
        return b;
    }

    public static boolean SchonVorhanden(ArrayList<String> l, String s) {
        boolean b = l.contains(s);
        return b;
    }
}
