package step19.aufgaben.aufgabe1;

/* Level 2
Erstellen Sie folgende Interfaces:
 * "IFlugfähig" mit einer void Methode "fliegen()".
 * "IFahrbar" mit einer void Methode "fahren()".
 * "ISchwimmfähig" mit einer void Methode "schwimmen()".
 *
 * Erstellen Sie weiterhin fünf Klassen:
 * - abstrakte Klasse "Fahrzeug" mit einer statischen Liste vom Typ "Fahrzeug" und einem parameterlosen Konstruktor, der das aktuelle Objekt der Liste hinzufügt.
 * - "Flugzeug", welche von "Fahrzeug" erbt und die Interfaces "IFlugfähig" und "IFahrbar" implementiert.
 * - "Auto", erbt von "Fahrzeug" und implementiert das Interface "IFahrbar".
 * - "Bagger", erbt von "Fahrzeug" und implementiert "IFahrbar" und "ISchwimmfähig".
 * - "Boot", erbt von "Fahrzeug" und implementiert "ISchwimmfähig".
 * Die implementierten Methoden sollen einen passenden Text auf der Konsole ausgeben.
 *
 * Erstellen Sie in der Main je ein Objekt der nicht-abstrakten Klassen. Über eine Schleife iterieren Sie durch die statische Liste in Fahrzeug, ermitteln, welches Interface die Objekte implementieren und rufen dann für jedes Objekt die verfügbaren Methoden auf.
 * Erstellen Sie ein UML Klassendiagramm.
 */

public class Main {

    public static void main(String[] args)
    {
        new Flugzeug();
        new Auto();
        new Bagger();
        new Boot();

        for (Fahrzeug f : Fahrzeug.fahrzeuge)
        {
            System.out.println(f.getClass().getSimpleName());

            // Mit instanceof prüfen wir, ob f das angegebene Interface implementiert. Wenn ja, können wir casten.
            if (f instanceof IFlugfähig a) // Diese Syntax castet direkt, wenn ein Cast möglich ist, und schreibt das Ergebnis in 'a'
                a.fliegen();
            // In Java 8 müssen wir stattdessen folgendes schreiben:
            if (f instanceof IFahrbar)
                ((IFahrbar)f).fahren();
            if (f instanceof ISchwimmfähig)
                ((ISchwimmfähig)f).schwimmen();
        }
    }
}
