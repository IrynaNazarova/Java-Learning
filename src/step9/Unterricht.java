package step9;

import java.util.Scanner;

public class Unterricht {
    // Keyword 'class' -> Der Referenz-Typ mit dem Bezeichner "Unterricht" existiert jetzt
    public static void main(String[] args) {
        // Beispiel, welches wir schon kennen
        Scanner scanner = new Scanner(System.in); // Instanziieren von einem Scanner-Objekt, und Zuweisung der Adresse des Objekts in eine Variable (vom Typ Scanner)

        // Unsere eigne Klasse
        EtwasZusätzlichesZumUnterricht variableFürDieInstanz = new EtwasZusätzlichesZumUnterricht(); // Instanziieren von unserem Objekt (Referenz wird in der Variable gespeichert)
        variableFürDieInstanz.nachricht = "Hallo Welt!";
        variableFürDieInstanz.wirTunEtwas();

        // Vorher haben wir das so gemacht
        String nachricht; // Deklarieren
        nachricht = "Hallo Welt!"; // Initialisieren
        System.out.println(nachricht); // Verarbeiten

        // Jetzt in eigenen Objekten verpackt
        EtwasZusätzlichesZumUnterricht a = new EtwasZusätzlichesZumUnterricht(); // Neue Instanz -> neue Adresse -> neue Referenz -> neue Variable
        EtwasZusätzlichesZumUnterricht b = new EtwasZusätzlichesZumUnterricht();
        EtwasZusätzlichesZumUnterricht c = new EtwasZusätzlichesZumUnterricht();

        a.nachricht = "Hallo A";
        b.nachricht = "Hallo B";
        c.nachricht = "Hallo C";

        a.wirTunEtwas();
        b.wirTunEtwas();
        c.wirTunEtwas();

        // Konkretes Beispiel 1
        Haus imWald = new Haus();
        imWald.möbelStückInDerKüche = "Ofen";
        imWald.möbelStückImWohnzimmer = "Schaukelstuhl";

        Haus amStrand = new Haus();
        amStrand.möbelStückInDerKüche = "Minibar";
        amStrand.möbelStückImWohnzimmer = "Fernseher";

        Haus inDerInnenstadt = new Haus();
        inDerInnenstadt.möbelStückInDerKüche = "Microwelle";
        inDerInnenstadt.möbelStückImWohnzimmer = "Schaukelstuhl";

        System.out.println(imWald.listeMöbelStückeAuf());

        // Konkretes Beispiel 2
        /*
         * Aufgabe:
         * Erstellen Sie Objekte von Teilnehmern.
         * Teilnehmer sitzen an einem Platz, haben einen Namen und haben die AP1 und AP2 entweder bestanden,
         * oder noch nicht.
         * Sie können an der AP1 / AP2 teilnehmen und ab dann gilt diese als bestanden.

         * Schreiben Sie eine kline Java Simulation von ein paar Teilnehmern.
         */
        Teilnehmer sitzplatz1 = new Teilnehmer();
        sitzplatz1.name = "Peter Lustig";
        sitzplatz1.anAp2Teilnehmen(); // Testen unserer Validierung: Peter Lustig versucht erst die AP2 zu machen
        sitzplatz1.anAp1Teilnehmen(); // Macht dann AP1
        System.out.println(sitzplatz1.sindNochPrüfungenOffen());
        sitzplatz1.anAp2Teilnehmen(); // Und dann nochmal AP2
        System.out.println(sitzplatz1.sindNochPrüfungenOffen());
        sitzplatz1.anAp2Teilnehmen(); // Haben wir aber schon

        // Zugriffsmodifizierer (Access Modifier)
        // sitzplatz1.istAp1Bestanden = false; // Korrumpieren der Daten: Habe ich aus Versehen gemacht. AP2 ist schon bestanden, AP1 noch nicht. Wird durch den 'private' Zugriffsmodifizierer sichergestellt.
        System.out.println(sitzplatz1.wurdeAp1Bestanden()); // Auslesen von privaten Information über den Getter
    }
}

class EtwasZusätzlichesZumUnterricht { // Darf nicht 'public' sein
    // Member -> Variablen und Methoden

    public String nachricht; // Etwas Speichern -> Zustand vom Objekt (jedes Objekt hat einen eigenen Zustand)

    public void wirTunEtwas() {
        System.out.println(nachricht); // Etwas verarbeiten
    }
}

