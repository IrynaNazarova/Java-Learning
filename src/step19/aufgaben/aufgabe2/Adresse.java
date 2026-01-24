package step19.aufgaben.aufgabe2;

public class Adresse {

    private String straße;
    private int hausnummer;
    private String plz;
    private String ort;

    public Adresse(String straße, int hausnummer, String plz, String ort)
    {
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public String toString()
    {
        return straße + " " + hausnummer + "\n" + plz + " " + ort;
    }
}
