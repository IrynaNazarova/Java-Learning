package step16.unterrichtAggregation.aufgabe1;

public class Adresse {
    private String strasse;
    private String stadt;
    private String plz;

    public Adresse(String strasse, String stadt, String plz) {
        this.strasse = strasse;
        this.stadt = stadt;
        this.plz = plz;
    }

    public String getAdresseInfo() {
        return strasse + ", " + plz + " " + stadt;
    }
}
