package step15;

public class Assoziation {
    public static void main(String[] args)
    {

        // 1) Auto -> Person (Eine 1:n Beziehung, bei der wir vom Auto auf den Besitzer (Person) schließen können, aber nicht umgekehrt.
        // Lösung: Wir führen ein Attribut 'besitzer' vom Typ Person in der Klasse 'Auto' ein.
        System.out.println("**********************************************************************");
        System.out.println("*** von Auto zu Person navigieren ************************************");
        System.out.println("**********************************************************************");

        //Instanziierung einer Person
        Person p1 = new Person(1, "Müller");
        // Instanziierung eines Auto
        Auto ford = new Auto(2, "Ford",p1 );
        // Das Objekt p1 und das Objekt Ford stehen nun in einer Beziehung (Assoziation)
        System.out.println("Dein Auto hat die Id: " + ford.getId());
        System.out.println("Dieses Auto hat den Besitzer: " + ford.getBesitzer().getNachname());


        // Instanziierung eines neuen Autos mit dem zweiten Konstruktor
        Auto audi = new Auto(1,"Audi");
        // über die Setter-Methode wurde dem Objekt audi noch ein Besitzer zugeteilt
        audi.setBesitzer(new Person(2,"Schmid"));
        System.out.println(audi.getBesitzer().getNachname());

        System.out.println("**********************************************************************");
        System.out.println("*** m:n-Beziehung  ********");
        System.out.println("**********************************************************************");

        //Initialisierung von Autos
        Auto a1 = new Auto(3, "BMW");
        Auto a2 = new Auto(4,"Opel");
        Auto a3 = new Auto(5, "VW");

        //Initialisierung von Personen
        Person p3 = new Person(3, "Strauch");
        Person p4 = new Person(4, "Hübner");
        Person p5 = new Person (5,"Weis");

        // Auto a1 darf von allen drei Personen gefahren werden
        // die drei Personen müssen zur Arraylist hinzugefügt werden
        a1.fahrerListe.add(p3);
        a1.fahrerListe.add(p4);
        a1.fahrerListe.add(p5);

        // p3 darf a1 und a2 fahren
        p3.darfFahrenListe.add(a1);
        p3.darfFahrenListe.add(a2);

        // Ausgabe auf der Konsole
        // Ich möchte vom Auto a1 zu all seinen Fahrern navigieren und auf der Konsole deren Nachnamen ausgeben
        for(Person p : a1.fahrerListe)
        {
            System.out.println("Das Auto a1 darf gefahren werden von: " + p.getNachname());
        }

        // a2.fahrerListe.add(p3);
        for(Person p : a2.fahrerListe)
        {
            System.out.println("Das Auto a2 darf gefahren werden von: " + p.getNachname());
        }


        System.out.println("**********************************************************************");
        System.out.println("*** m:n-Beziehung Haustier:Person  ********");
        System.out.println("**********************************************************************");

        //Instanziierung von Haustieren:
        Haustier h1 = new Haustier(1, "Black Beauty");
        Haustier h2 = new Haustier(2, "Kitty");
        Haustier h3 = new Haustier(3, "Prof. Dr. Dr. Wau Wau");

        Person katzenlady = new Person(5, "Frau Katzenlady");
        Person pferdeboy = new Person(6, "Mr. Stalljunge");
        Person hundemädchen = new Person(7, "Hundefangirl");

        // Personen werden nun zu Haustierbesitzern
        katzenlady.haustierHinzufügen(h2);
        pferdeboy.haustierHinzufügen(h1);
        hundemädchen.haustierHinzufügen(h3);

        katzenlady.haustierHinzufügen(h3);

        // Ausgabe aller Personen mit ihren Haustieren
        System.out.println("Der Katzenlady gehören: ");
        katzenlady.haustierlisteAusgeben();

        System.out.println("Dem Pferdeboy gehört: ");
        pferdeboy.haustierlisteAusgeben();

        System.out.println("Dem Hundemädchen gehört:");
        hundemädchen.haustierlisteAusgeben();


    }

}
