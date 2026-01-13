package step16.unterrichtAggregation;

public class Produkt {
    private int id;
    private double preis;
    private String bezeichnung;

    public Produkt(int id, double preis, String bezeichnung)
    {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getPreis()
    {
        return preis;
    }

    public void setPreis(double preis)
    {
        this.preis = preis;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }
}
