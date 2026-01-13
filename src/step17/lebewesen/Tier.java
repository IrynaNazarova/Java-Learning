package step17.lebewesen; // Eigenes Paket für die Klassen
import java.util.ArrayList;

public class Tier  //Superklasse oder Elternklasse oder Basisklasse
{
    public static ArrayList<Tier> tierListe = new ArrayList<>();

    // Alle Tiere haben ein Alter
    private int alter;

    // Getter-Methode für Alter
    public int getAlter()
    {
        return alter;
    }

    // Ich möchte von der Klasse 'Tier' keine Objekte erzeugen, aber der Konstruktor soll trotzdem für die Subklasse
    // aufrufbar sein.
    // Lösung: protected
    // Kindklassen haben einen Zugriff auf protected Member und alle weiteren Klassen im gleichen package
    // ACHTUNG: protected Member wirken im gleichen Package wie public!
    protected Tier (int alter)
    {
        System.out.println("Aufruf des Konstruktors in Tier");
        this.alter = alter;
        tierListe.add(this);
    }

    public void ausgabe()
    {
        System.out.println("Ich bin ein Tier.");
    }
}
