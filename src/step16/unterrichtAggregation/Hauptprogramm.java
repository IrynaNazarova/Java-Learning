package step16.unterrichtAggregation;

import java.time.temporal.ChronoUnit;

public class Hauptprogramm {
    public static void main(String[] args)
    {
        // Unterschied Assoziation und Aggregation
        // - Aggregation ist eine Teil-von-Beziehung
        //   Einkauf ist abhängig von Person und Produkt (ohne ein Produkt und einer Person kann kein Einkauf stattfinden)
        // - Assoziation unabhängige Beziehung von einer oder mehreren Klassen
        //   (Personen, Haustiere, Autos können unabhängig von einander existieren)

        // Instanziierung von Personen
        Person p1 = new Person(1,"Müller");
        Person p2 = new Person(2, "Buske");

        // Instanziierung von Produkten
        Produkt ware1 = new Produkt(1, 3.99, "Kinderschokolade");
        Produkt ware2 = new Produkt(2, 0.89, "Salat");
        Produkt ware3 = new Produkt(3, 1400, "IPhone");

        // Instanziierung von Einkäufen
        Einkauf e1 = new Einkauf(p1, ware1);
        Einkauf e2 = new Einkauf(p2, ware2);
        Einkauf e3 = new Einkauf(p1, ware3);



        // Ausgabe aller Einkäufe (Einkaufs-Id, Kundenname, Warenbezeichnung, Warenpreis und Zeitstempel des Einkaufs)
        for(Einkauf e : Einkauf.liste)
        {
            System.out.println("Einkaufs-Id: " + e.getId() + "\n\tKunddenname:" + e.getKäufer().getNachname() + "\n\tWarenbezeichnung: " + e.getWare().getBezeichnung());
            System.out.print("\tWarenpreis: " + e.getWare().getPreis() + "\n\tZeitstempel: " + e.getDatum().truncatedTo(ChronoUnit.SECONDS));
            System.out.println("\n---------------------------------------------------");
        }



    }
}
