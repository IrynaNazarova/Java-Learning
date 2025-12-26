package step2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Schleifen
        for (int i = 0; i < 10; i++) {
            // here be dragons
        }

        int counter = 0; // Existiert außerhalb vom Schleifen-Kontext
        while (counter < 10) {
            // here be dragons
            counter++;
        }

        do {
            // here be dragons
            counter++;
        } while (counter < 20);

        // Switch
        String monsterTyp = "Goblin Magier";
        switch (monsterTyp) {
            case "Ogre":
                System.out.println("Spieler kriegt 100 physischen Schaden!");
                break;
            case "Goblin Magier":
                System.out.println("Spieler kriegt 50 magischen Schaden!");
                break;
            case "Goblin":
                System.out.println("Spieler kriegt 20 physischen Schaden!");
                break;
            default:
                System.out.println("Diesen Monstertyp gibt es nicht!");
                break;
        }
        // So sieht das als if aus
        if (monsterTyp.equals("Ogre")) {
            System.out.println("Spieler kriegt 100 physischen Schaden!");
        } else if (monsterTyp.equals("Goblin Magier")) {
            System.out.println("Spieler kriegt 50 magischen Schaden!");
        } else if (monsterTyp.equals("Goblin")) {
            System.out.println("Spieler kriegt 20 physischen Schaden!");
        } else {
            System.out.println("Diesen Monstertyp gibt es nicht!");
        }

        // "Fall through" denn ein Goblin Magier ist auch Goblin
        switch (monsterTyp) {
            case "Ogre":
                System.out.println("Spieler kriegt 100 physischen Schaden!");
                break;
            case "Goblin Magier":
                System.out.println("Spieler kriegt 50 magischen Schaden!");
                // kein break
            case "Goblin":
                System.out.println("Spieler kriegt 20 physischen Schaden!");
                break;
            default:
                System.out.println("Diesen Monstertyp gibt es nicht!");
                break;
        }
        // und als if, wir sehen, dass die 20 physischer Schaden jetzt in beiden Fällen steht
        if (monsterTyp.equals("Ogre")) {
            System.out.println("Spieler kriegt 100 physischen Schaden!");
        } else if (monsterTyp.equals("Goblin Magier")) {
            System.out.println("Spieler kriegt 50 magischen Schaden!");
            // kein break

            System.out.println("Spieler kriegt 20 physischen Schaden!");
        } else if (monsterTyp.equals("Goblin")) {
            System.out.println("Spieler kriegt 20 physischen Schaden!");
        } else {
            System.out.println("Diesen Monstertyp gibt es nicht!");
        }

        // Ein Wert, der aus der gesamten Switch-Anweisung zurückgegeben wird
        int schaden = switch (monsterTyp) {
            case "Ogre" -> 100;
            case "Goblin" -> 20;
            case "Goblin Magier" -> 50;
            default -> 0;
        };
        System.out.println(schaden);

        // continue und break
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
            if (i == 7) break;
        }

        int monsterGruppenGröße = 10;
        int monsterSchaden = 20;
        int spielerLebenspunkte = 100;
        for (int i = 1; i <= monsterGruppenGröße; i++) {
            // Spezialfähigkeit: Jedem 3. Monster weichen wir aus.
            if (i%3 == 0) // if i modulo 3 gleich 0
                continue; // ... dann weichen wir aus. Alle nachfolgenden Zeilen werden für diesen Durchgang übersprungen.
            // Beispiel i = 1:
            // 1 / 3 = 0 mit rest 1, daher:
            // 1 % 3 = 1, also:
            // 1 % 3 == 0 -> 1 == 0 -> false

            // Spieler kriegt Schaden
            spielerLebenspunkte -= monsterSchaden;

            // sollte unser Held / unsere Heldin danach fertig sein mit der Welt
            if (spielerLebenspunkte <= 0) {
                // kampf beendet
                System.out.println("Schon bei Monster " + i + " sind Sie gestorben!");
                break;
            }
        }
        System.out.println(spielerLebenspunkte);

        // Strings
        // Sonderstellung: Standard Datentypen aber keine primitiven Datentypen.

        // Vergleichen mit .equals (später mehr dazu, warum == nicht immer funktioniert)
        String a = "Hallo";
        String b = "Hallo";
        if (a.equals(b)) System.out.println("Ja, ist gleich!");
        if (b.equals(a)) System.out.println("Ja, andersrum ist's auch gleich!");

        // Formatierung
        String meinName = "xxxNinjaxxx";
        int spielerLevel = 10;
        double spielerBisherGereisteKm = 1337.435;
        System.out.printf("Hallo mein name ist %s und ich bin schon Level %s%n", meinName, spielerLevel); // %s bedeutet "wird zu String konvertiert"
        System.out.printf("und ich bin schon %s Km gereist!%n", spielerBisherGereisteKm);
        System.out.println("Alter, so genau will das keiner wissen!");
        System.out.printf("Ok, ok: %.1f km...%n", spielerBisherGereisteKm); // Konvertierung zu 'floating point' Darstellung mit 1 Nachkommastelle
        System.out.printf(Locale.US,"Ok, ok: %.1f km...%n", spielerBisherGereisteKm); // Konvertierung, jetzt nach den Vorschriften von Lokalisierung "US"
        System.out.printf(Locale.GERMAN,"Ok, ok: %.1f km...%n", spielerBisherGereisteKm); // Konvertierung, jetzt nach den Vorschriften von Lokalisierung "GERMAN"

        // andere Methoden auf Strings
        String meinNameUndZwarGeschrien = meinName.toUpperCase();
        System.out.println(meinName);
        System.out.println(meinNameUndZwarGeschrien);
    }

}
