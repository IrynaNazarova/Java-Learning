package step15;

public class Haustier {
    // Attribute
    private int id;
    private String name;

    // Konstrutor
    public Haustier(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // Stter und Getter
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
