package step17.lebewesen;  // Eigenes Paket für die Klassen


//Beispiel für Vererbung anhand der Klassen Tier, Hund und Dackel
public class NorwegischeWaldkatze extends Hauskatze
{
    public NorwegischeWaldkatze(int alter)
    {
        super(alter);
    }

    /*
    @Override
    public void ausgabe() // Überschreiben nicht mehr möglich, da die Methode in der Superklasse als 'final' markiert ist.
    {

    }*/
}
