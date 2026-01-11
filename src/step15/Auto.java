package step15;

import java.util.ArrayList;

public class Auto {
    //Attribute
    private int id;
    private String marke;
    // Autos müssen einen Besitzer haben. Damit stehen Person und Auto in Verbindung zueinander.
    // Kennen wir das Auto, können wir den Besitzer abfragen.
    // Diagramm 1 (besitzer)
    private Person besitzer; // 1:n - Beziehung

    // Diagramm 2 (Liste von Fahreren)
    public ArrayList<Person> fahrerListe = new ArrayList<>(); // m:n-Beziehung
    // Jedes Auto hat eine Liste mit Personen, die das Auto fahren dürfen. Damit stehen Person und Auto in Verbindung/Beziehung

    // Konstruktor 1
    // Jedes erzeugte Objekt vom Typ Auto muss eine id und eine marke besitzen
    public Auto(int id, String marke, Person besitzer)
    {
        this.id = id;
        this.marke = marke;
        this.besitzer = besitzer;
    }

    // Konstrutor 2
    // Assoziation: Autos haben Besitzer. Aber es kann auch Autos ohne Besitzer geben.
    // Möchte ich ein Objekt ohne Besitzer erzeugen, rufe ich diesen Konstruktor auf.
    public Auto(int id, String marke)
    {
        this.id = id;
        this.marke = marke;

    }


    //Setter und Getter-Methoden
    public void setBesitzer(Person besitzer)
    {
        this.besitzer = besitzer;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getMarke()
    {
        return marke;
    }

    public void setMarke(String marke)
    {
        this.marke = marke;
    }

    public Person getBesitzer()
    {
        return besitzer;
    }
}
