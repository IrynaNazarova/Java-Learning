package step19;

// Bei der Verwendung von Interfaces spricht man in der Regel nicht von Erben
// sondern von 'Implementieren' oder 'Realisieren'

public class Dokument implements Druckbar
{
    protected String text;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    // Konstruktor
    public Dokument(String text)
    {
        this.text = text;
    }

    // Abstrakte Methode aus dem Interface 'Druckbar'
    // Abstrakte Methoden müsssen in den implementierenden Klassen überschrieben/implementiert werden
    @Override
    public void drucken()
    {
        System.out.println("Dokument wird gedruckt mit dem Text: " + text);
    }

}
