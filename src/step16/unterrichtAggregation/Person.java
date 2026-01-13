package step16.unterrichtAggregation;

public class Person {
    // Attribute
    private int id;
    private String nachname;

    // Konstruktor
    public Person (int id, String nachname)
    {
        this.id = id;
        this.nachname = nachname;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNachname()
    {
        return nachname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }
}
