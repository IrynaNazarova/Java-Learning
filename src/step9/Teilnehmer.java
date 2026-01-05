package step9;
/*
 * Aufgabe:
 * Erstellen Sie Objekte von Teilnehmern.
 * Teilnehmer sitzen an einem Platz, haben einen Namen und haben die AP1 und AP2 entweder bestanden,
 * oder noch nicht.
 * Sie können an der AP1 / AP2 teilnehmen und ab dann gilt diese als bestanden.

 * Schreiben Sie eine kline Java Simulation von ein paar Teilnehmern.
 */

public class Teilnehmer {
    // Datensatz aus der Aufgabenstellung. Ich habe mich dafür entschieden, den Sitzplatz nicht im Objekt zu speichern.
    public String name; // 'public' (+ im UML) kann von außen gesetzt und gelesen werden
    private boolean istAp1Bestanden; // 'private' (- im UML) kan NICHT von außen gesetzt oder gelesen werden.
    private boolean istAp2Bestanden = false; // Standardwert von boolean ist false. Wir können aber auch auf Klassenebene initialisieren.

    public void anAp1Teilnehmen() { // Wir bestehen immer, wenn wir teilnehmen
        if (istAp1Bestanden) {
            System.out.println("Sie haben die AP1 bereits bestanden!");
            return; // Early-Out
        }

        // Hauptlogik
        istAp1Bestanden = true;
        System.out.println("Wunderbar! AP1 ist bestanden!");
    }

    public void anAp2Teilnehmen() { // Wir bestehen immer, wenn wir teilnehmen
        if (istAp2Bestanden) {
            System.out.println("Sie haben die AP2 bereits bestanden!");
            return; // Early-Out
        }

        // Hauptlogik
        if (istAp1Bestanden) {
            istAp2Bestanden = true;
            System.out.println("Herzlichen Glückwunsch! Sie sind durch!");
        } else
            System.out.println("Sie müssen erst an der AP1 teilnehmen!");
    }

    // Ein "Getter" -> Wir implementieren eine API, die Lesezugriff (aber keinen Schreibzugriff) auf unsere internen Daten erlaubt.
    public boolean wurdeAp1Bestanden() {
        return istAp1Bestanden;
    }

    public boolean wurdeAp2Bestanden() {
        return istAp2Bestanden;
    }

    /*
    Schreiben Sie einen Getter, der angibt, ob überhaupt noch Prüfungen geschrieben werden müssen.
    */
    public boolean sindNochPrüfungenOffen() {
        if (istAp1Bestanden && istAp2Bestanden) {
            return false;
        }
        else {
            return true;
        }

        // Als boolscher ausdruck
        // return !(istAp1Bestanden && istAp2Bestanden);
        // return !istAp1Bestanden || !istAp2Bestanden;
    }
}
