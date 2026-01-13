package step17;
import step17.lebewesen.*; //lebewesen.* erlaubt einen Zugriff auf alle Klassen im Package lebewesen



public class Hauptprogramm {

    /*
     VERERBUNG:

     Definition:
         Klassen können von anderen Klassen Code übernehmen → der dort implementierte Code muss also nicht erneut geschrieben werden.
         Die erbende Klasse wird Subklasse oder Kind-Klasse genannt, die Klasse, von der geerbt wird, heißt Superklasse oder Eltern-Klasse.
         Man spricht auch von "Ableiten" oder "Erben", die Subklasse ist die "abgeleitete Klasse".

     Mehrfachvererbung:
         C++ und Python beherrschen die Mehrfachvererbung. Das bedeutet, dass eine Klasse von mehreren Superklassen gleichzeitig erben kann.
         Dies ist in Java und C# nicht möglich. Hier kann eine Klasse immer nur eine Superklasse haben.
 */
    public static void main(String[] args)
    {
        System.out.println("Vererbungshierarchie Tier -> Hund -> Dackel");
        //Es darf kein Objekt von Tier erzeugt werden, da Tier einen protected Konstruktor hat
        // Tier t = new Tier(8);

        Hund h1 = new Hund(10,"schwarz");
        System.out.println("Das ist die Fellfarbe von Hund: " + h1.getFellfarbe());
        System.out.println("Das Alter des Hundes ist: " + h1.getAlter()); //Geerbt von Tier
        h1.ausgabe(); //Diese Methode wurde in der Hundklasse überschrieben

        Dackel d = new Dackel(15, "braun");
        System.out.println("Das ist die Fellfarbe von Dackel: " + d.getFellfarbe()); //getFellfarbe liegt in Hund und die Methode wurde geerbt
        System.out.println("Das ist das Alter von Dackel: " + d.getAlter()); //Geerbt von Tier
        d.ausgabe();

        System.out.println();
        System.out.println("POLYMORPHIE");

        // Hund IST EIN Tier.
        // Dadurch kann der Datentyp der Variable vom Typ 'Tier' sein.
        // Wir erstellen ein Objekt vom Typ 'Hund' und speichern diesen in einer Variable vom Typ 'Tier'.

        Tier tier = new Hund(8, "Schwarz");
        System.out.println(tier.getAlter()); // Der Datentyp 'Tier' kennt nur die Member, die in 'Tier' definiert sind.
        // Möchte ich die Member aus 'Hund', muss gecastet werden.
        String fellfarbe = ((Hund) tier).getFellfarbe();
        System.out.println(fellfarbe);

        // Andere Schreibweise fürs Casten:
        fellfarbe = Hund.class.cast(tier).getFellfarbe();
        System.out.println(fellfarbe);

        // Praktisch: Variablen können allgemein wiederverwendet werden, zum Beispiel als Methodenparameter:
        tier = new Dackel(4, "Braun");
        tier.ausgabe(); // Dank Override wird hier immer die korrekte Methode der instanziierten Klasse aufgerufen.

        System.out.println();
        // Polymorphie - Vielgestaltigkeit:
        // Der Hund IST EIN Tier, darum kann es in der tierListe gespeichert werden!
        // Vorteil: Alle diese Objekte passen in eine gemeinsame Liste. So können wir mit einer Schleife über alle Tiere iterieren.
        for (Tier t : Tier.tierListe)
        {
            System.out.println(t.getClass()); // Die Methode getClass() gibt die Klasse zur Laufzeit und die Metadaten des Objektes zurück.
            System.out.println(t.getClass().getSimpleName()); // Ausgabe des Klassenbezeichners.

            // Alle Tiere haben ein Alter:
            System.out.println("Alter: " + t.getAlter());

            // Möchten wir wissen, welcher Typ unser Objekt eigentlich ist, können wir dies mit 'instanceof' prüfen.
            if (t instanceof Hund) // Ist das Objekt eine Instanz von Hund?
            {
                Hund h = (Hund) t; // Tier in Hund casten und in 'h' speichern.
                System.out.println("Fellfarbe: " + h.getFellfarbe());
            }

            // Würden wir nicht mit instanceof prüfen, bekämen wir eventuell eine Exception.
        }

        System.out.println();
        System.out.println("OVERRIDE");

        // Ohne Variablen - die Tiere werden durch den Konstruktor direkt der Liste hinzugefügt.
        new Katze(10);
        new Hauskatze(5);
        new NorwegischeWaldkatze(6);

        System.out.println("Ausgabe aller Tiere der tierListe: ");
        for (Tier t : Tier.tierListe)
        {
            // Alle Tiere verfügen über die ausgabe()-Methode.
            t.ausgabe(); // Es wird immer die passende, überschreibende Methode aufgerufen.
        }

    }
}
