package step15;

import java.util.ArrayList;

public class Person {
    // Attribute
    private int id;
    private String nachname;


    //Diagramm 2 - eine Person darf mehrere Autos fahren, somit brauchen wir eine Liste die mit Autos befüllt werden kann
    public ArrayList<Auto> darfFahrenListe = new ArrayList<>();

    // Diagramm 3
    private ArrayList<Haustier> haustierliste;

    // Konstruktor
    public Person (int id, String nachname)
    {
        this.id = id;
        this.nachname = nachname;
        haustierliste = new ArrayList<>();
    }

    // Um die Haustierliste zu befüllen, da die Liste private ist, brauchen wir eine Methode
    public void haustierHinzufügen(Haustier h)
    {
        haustierliste.add(h);
    }

    //Methode die alle Haustiere dieser Person ausgibt
    public void haustierlisteAusgeben()
    {
        for(Haustier h : haustierliste)
        {
            System.out.println("ID: " + h.getId() + " Name: " + h.getName());
        }
    }

    // Setter und Getter-Methoden
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
