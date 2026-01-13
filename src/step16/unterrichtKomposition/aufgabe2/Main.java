package step16.unterrichtKomposition.aufgabe2;


/* Level 1
 * Zwei Klassen:
 * "Abenteurer" mit dem Attribut String "name" und einem Konstruktor, der Name initialisiert.
 * "Gruppe" mit einer nicht-statischen Liste "abenteurerInDerGruppe"
 * Implementieren Sie die Aggregation der beiden Klassen und stellen Sie eine Navigierbarkeit von Gruppe zu Abenteurer her.
 * Im Main erstellen Sie drei Abenteurer und befüllen Sie anschließend eine Gruppe mit allen Abenteurern.
 * Lassen Sie dann in einer Schleife alle Abenteurer der Gruppe ausgeben.
 *
 * Was müsste an dem Programm geändert werden, damit die Aggregation zu einer Komposition wird?
 * Erstellen Sie zu beiden Fällen ein UML Klassendiagramm!
 */

public class Main {
    public static void main(String[] args)
    {
        Gruppe gruppe = new Gruppe();

        // Komposition: Abenteurer existieren nur innerhalb der Gruppe.
        gruppe.addAbenteurer("Bryseis");
        gruppe.addAbenteurer("Vishnal");
        gruppe.addAbenteurer("Zane");


        System.out.println(gruppe.getAbenteurerString());

    }
}
