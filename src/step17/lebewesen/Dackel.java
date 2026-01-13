package step17.lebewesen;

public class Dackel  extends Hund {
    // Dackel ist die Subklasse von Hund und da der Hund die Subklasse von Tier ist, ist auch Dackel eine Subklasse von Tier
    // Mit dem final-keyword geben wir bei Klassen an, dass von dieser Klasse nicht weiter abgeleitet werden kann
    public Dackel(int alter, String fellfarbe)
    {
        super(alter, fellfarbe);
        System.out.println("Aufruf des Konstruktors in Dackel");
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin ein Dackel. Wau Wau");
    }
}
