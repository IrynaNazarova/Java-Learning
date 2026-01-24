package step19.aufgaben.aufgabe2;

public class Person  implements HatAdresse {

    private String name;
    private Adresse adresse;

    public Person(String name, String straße, int hausnr, String plz, String ort)
    {
        Adressverwaltung.erfasse(this, name, straße, hausnr, plz, ort);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String value)
    {
        name = value;
    }

    @Override
    public Adresse getAdresse()
    {
        return adresse;
    }

    @Override
    public void setAdresse(Adresse value)
    {
        adresse = value;
    }

    public void printEtikett()
    {
        Adressverwaltung.printEtikett(this);
    }
}
