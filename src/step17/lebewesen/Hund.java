package step17.lebewesen;

public class Hund extends Tier {
    private String fellfarbe;

    // Konstruktor in Hund
    // Reihenfolge und Bezeichnung der Parameter beliebig, sinnvoll ist aber, die Parameter wie die Attribute zu benennen,
    // den Parameter des Superklassen-Konstruktors zuerst aufzulisten und danach alle zusätzlichen Attribute

    public Hund(int alter, String fellfarbe)
    {
        // Um 'alter' kümmer sich die Superklasse
        super(alter);
        // Bei Vererbung sind wir gezwungen, die Konstruktoren zu verketten. Wird ein Objekt einer Subklasse erzeugt, MUSS
        // immer auch der Konstruktor der Superklasse aufgerufen werden, bei Konstoktoren mit Parametern müssen wir es
        // manuell machen.

        //Der Aufruf des Superklassen-Konstruktors muss der erste Befehl sein
        this.fellfarbe = fellfarbe;
        System.out.println("Aufruf des Konstruktors in Hund");
    }

    // Getter-Fellfarbe
    public String getFellfarbe()
    {
        return fellfarbe;
    }

    // Die @Override-Annotation in Java teilt dem Compiler mit, dass eine Methode der Superklasse überschrieben werden soll.
    // Es nicht zwingend notwendig die Annotation anzugeben, aber empfehelenswert, damit wir selbst Fehler vermeinden und
    // zur Dokumentation des Codes
    // Wir überschreiben eine Methode und damit verändern wir ihr Verhalten.
    @Override
    public void ausgabe()
    {
        super.ausgabe(); // Hiermit rufen wir die Methode in der Mutterklasse auf und somit wird die Funktionalität der Methode aus der Mutterklasse ausgeführt
        // und dann die weiteren Codezeilen innerhalb dieser Methode abgearbeitet
        System.out.println("Ich bin ein Hund. Wau Wau.");
    }


}
