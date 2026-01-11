package step14.vorlesungCode;

public class Enumeration {

    // Aufzählung von Konstanten und wird mit dem Schlüsselwort "enum" realisiert
    // ein enum stellt eine feste, zusammenhängende Menge von Werten dar

    enum Ampelfarbe
    {
        // Konstanten werden groß geschrieben -> Programmierkonvention
        // Konstanten sind unveränderlich und können nicht überschrieben werden
        ROT, GELB, GRÜN;
    }

    static void info(Ampelfarbe farbe)
    {
        switch (farbe)
        {
            case ROT:
                System.out.println(farbe + " = Anhalten");
                break;
            case GELB:
                System.out.println(farbe + " = Achtung");
                break;
            case GRÜN:
                System.out.println(farbe + " = Weiterfahren");
                break;
        }
    }


    public static void main(String[] args)
    {
        System.out.println("*************************************************");
        System.out.println("*** Ampelfarbe **********************************");
        System.out.println("*************************************************");

        // Aus dem Enum können wir eine Variable erzeugen und ihr eine Konstante zuweisen
        // eine Variable vom Typ enum kann nur Werte aus diesem Enum annehmen
        Ampelfarbe a1 = Ampelfarbe.ROT;
        System.out.println(a1); // Ausgabe: ROT
        //Jede Konstante hat einen automatischen numerischen Wert zugewiesen
        System.out.println(a1.ordinal()); // Ausgabe:0

        Ampelfarbe a2 = Ampelfarbe.GELB;
        System.out.println(a2); // Ausgabe: GELB
        System.out.println(a2.ordinal()); // Ausgabe: 1
        System.out.println("\nMethode Info wird ausgegeben:");
        info(a1); //Variable an die Methode übergeben
        info(Ampelfarbe.GRÜN);

        // In einer Foreach-Schleife können wir über die verfügbaren Konstanten iterieren:
        System.out.println("\nAusgabe mit for-each-Schleife");
        for(Ampelfarbe a : Ampelfarbe.values())
        {
            System.out.println(a);
        }

        System.out.println("\n\n*************************************************");
        System.out.println("*** Kleidergröße ********************************");
        System.out.println("*************************************************");

        Kleidergröße xl = Kleidergröße.XL;
        // Ausgabe Konstantenname XL
        System.out.println(xl);
        // Ausgabe nummerischeGröße 42
        System.out.println(xl.getNummerischeGröße());
        // Ausgabe ordinal 4
        System.out.println(xl.ordinal());

        Kleidergröße klein = Kleidergröße.valueOf("XS");
        System.out.println(klein); // Ausgabe Konstantenname
        System.out.println(klein.name()); //Ausgabe auch Konstantenname
        System.out.println(klein.getNummerischeGröße());


        System.out.println("\n\n*************************************************");
        System.out.println("*** Monat ********************************");
        System.out.println("*************************************************");

        Monat a = Monat.APRIL;
        // Ausgabe Ordinal
        System.out.println(a.ordinal());
        // Ausgabe Kontantenname
        System.out.println(a.name());
        // Ausgabe Zahl
        System.out.println(a.getZahl());
        // Ausgabe Quartal
        System.out.println(a.getQuartal());

        System.out.println("Alle Monate in Quartal 3:");
        System.out.println(Monat.getMonateInQuartal(3));


    }
}
