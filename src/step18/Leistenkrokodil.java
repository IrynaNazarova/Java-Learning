package step18;

public class Leistenkrokodil  extends Krokodil {

    //Abstrakte Methoden MÜSSEN überschrieben werden
    @Override
    public void zeigeInfoZumLebensraum()
    {
        System.out.println("Ich lebe in Ostindien, Südostasien und kommme sogar bis nach Nordaustralien.");
    }

    // Konstruktor muss alle erwarteten Werte an die Superklasse weiterreichen
    public Leistenkrokodil(String farbe, int alter)
    {
        // farbe und alter wird an den Superklassenkonstuktor weitergereicht
        super(farbe, alter);
    }

    // Jede Klasse kann natürlich auch eigene Methoden besitzen
    public void imSchlammLiegen()
    {
        System.out.println("Ich liege im Schlamm. Hier mag ich es.");
    }

}
