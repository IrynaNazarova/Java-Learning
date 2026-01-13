package step16.unterrichtKomposition.aufgabe3;

/* Level 2
    Führen Sie bitte die beiden folgenden Klassen ein:

        Klasse Kuchenstück
            Member:
                1 privater Integer gewicht
                1 Konstruktor:
                    Übergabewert: 1 Integer gewicht
                    Funktion: Weist dem Feld den Wert des Parameters zu

        Klasse Kuchen
            Member:
                private statische Liste vom Typen Kuchen
                private Liste aller Kuchenstücke
                private Methode
                    Name: gesamtGewicht
                    Übergabewerte: keine
                    Funktion: Ermittelt das Gesamtgewicht aller Kuchenstücke
                    Rückgabewert: Gesamtgewicht
                öffentliche statische Methode
                    Name: zeigeAlleKuchen
                    Übergabewerte: keine
                    Funktion: Gibt für alle Kuchen der Kuchenliste ...
                              - alle Stücke des Kuchens
                              - das Gewicht jedes seiner Kuchenstücke
                              - und das Gesamtgewicht des Kuchens
                              ... auf der Konsole aus
                Konstruktor:
                    Übergabewert: Integer-Liste
                    Funktion: (x = Anzahl der Elemente der Integer-Liste)
                              FALLS x > 0
                                    Kuchen wird zur Kuchenliste hinzugefügt
                                    Es werden x Kuchenstücke instanziiert
                                    Es werden die x Integerwerte der Reihe nach jedem Kuchenstück als Gewicht zugeordnet
			            Jedes Kuchenstück wird der Kuchenstückliste seines Kuchens hinzugefügt
                              SONST
                                    Der soeben instanziierte Kuchen wird der Kuchen-Liste NICHT zugeordnet
                                    (mit entsprechender Fehlermeldung)

    Im Main
       Zunächst wird ein Kuchen mit 0 Kuchenstücken instanziiert.
       Anschließend werden 3 weitere Kuchen mit jeweils 3, 4 und 5 Kuchenstücken instanziiert.
       Zum Schluss wird die Methode ZeigeAlleKuchen() aufgerufen.
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> gewichtListe;

        // Kuchen mit 0 Stücken:
        gewichtListe = new ArrayList<Integer>();
        new Kuchen(gewichtListe);

        // 3 Stücke für Kuchen 1:
        gewichtListe = new ArrayList<Integer>();
        gewichtListe.add(99);
        gewichtListe.add(100);
        gewichtListe.add(98);
        // Kuchen 1
        new Kuchen(gewichtListe);

        // 4 Stücke für Kuchen 2:
        gewichtListe = new ArrayList<Integer>();
        gewichtListe.add(90);
        gewichtListe.add(91);
        gewichtListe.add(93);
        gewichtListe.add(89);
        // Kuchen 2
        new Kuchen(gewichtListe);

        // 5 Stücke für Kuchen 3:
        gewichtListe = new ArrayList<Integer>();
        gewichtListe.add(81);
        gewichtListe.add(83);
        gewichtListe.add(85);
        gewichtListe.add(79);
        gewichtListe.add(82);
        // Kuchen 3
        new Kuchen(gewichtListe);

        Kuchen.zeigeAlleKuchen();
    }
}
