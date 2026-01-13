package step16.unterrichtKomposition;



import java.util.ArrayList;

public class Gebäude
{
    // Innere Klasse, privaten Konstruktor: Kann nicht außerhalb des Gebäudes instanziiert werden.
    // Das Gebäude regelt den Zugriff auf die Klasse 'Raum'
    private static class Raum
    {
        private int raumNummer;

        private Raum(int raumnummer)
        {
            raumNummer = raumnummer;
        }

        private int getRaumNummer()
        {
            return raumNummer;
        }
    }

    private String name;
    private int raumnummern;
    private ArrayList<Raum> raumliste = new ArrayList<>();

    //Jedes Gebäude benötigt mindestens einen Raum. Über den Konstruktor können wir Raum-Nummern übergeben und daraus Räume erzeugen.
    public Gebäude (String name, int... raumnummern) //int... steht für variable arguments und erlaubt es uns, für einen Parameter
    {                                               // beliebig viele Argumente zu übergeben
        this.name = name;
        for(int i : raumnummern)
        {
            raumliste.add(new Raum(i)); //Raumobjekt wird erzeugt und in die Raumliste hinzugefügt.
        }
    }

    public void ausgabe()
    {
        System.out.println("Gebäudename: " + name);
        for (Raum r : raumliste)
        {
            System.out.println("Raum: " + r.raumNummer);
        }
    }



}
