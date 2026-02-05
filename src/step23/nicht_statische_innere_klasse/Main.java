package step23.nicht_statische_innere_klasse;

public class Main {
    public static void main(String[] args)
    {
        // // Java kennt vier Arten von inneren Klassen: nicht-statische innere Klassen, statische innere Klassen, lokale innere Klassen und anonyme innere Klassen
        Auto ferrari = new Auto("Ferrari", 30); // Auto hat eine innere Klasse Kofferraum
        ferrari.fahren();
        ferrari.oeffneKofferraum();
    }
}

// Eine strenge Komposition kann man z.B. mit Hilfe einer normalen inneren Klasse umsetzen.
class Auto
{
    private String hersteller;

    // Auto hat einen Kofferraum als Attribut und damit handelt es sich um eine Ganze-Teile
    // Beziehung (Aggregation oder Komposition)
    private Kofferraum kofferraum;

    public Auto(String hersteller)
    {
        this.hersteller = hersteller;
    }

    public Auto(String hersteller, double volumen)
    {
        this.hersteller = hersteller;
        this.kofferraum = new Kofferraum(volumen);

    }

    public void fahren()
    {
        System.out.println("Brumm, brumm");
    }

    public String getHersteller()
    {
        return this.hersteller;
    }

    public void setHersteller(String hersteller)
    {
        this.hersteller = hersteller;
    }

    public void oeffneKofferraum()
    {
        this.kofferraum.oeffnen();
    }


    // Java kennt vier Arten von inneren Klassen: nicht-statische innere Klassen, statische innere Klassen, lokale innere Klassen und anonyme innere Klassen:
    // 1. Beispiel fuer eine nicht-statische innere Klasse.
    // Wenn wir der inneren Klasse private Zugriff geben, dann
    // haben wir sogar eine Komposition erreicht, da nur noch
    // die auessere Ganzeklasse die innere Teileklasse erzeugen kann.
    // Dadurch kann es kein Teil ohne ein Ganzes geben. Niemand kann
    // mehr ein Kofferraumobjekt ohne ein Auto erzeugen.
    private class Kofferraum
    {
        private double volumen;

        private Kofferraum(double volumen)
        {
            this.volumen = volumen;
        }

        public double getVolumen()
        {
            return this.volumen;
        }

        public void setVolumen(double volumen)
        {
            this.volumen = volumen;
        }

        public void oeffnen()
        {
            System.out.println("Der Kofferraum ist jetzt offen.");
        }
    }
}
