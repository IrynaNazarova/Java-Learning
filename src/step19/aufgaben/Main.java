package step19.aufgaben;

/* Level 1
 * Zwei Interfaces:
 * "IGitarrenspieler" mit der void Methode "gitarreSpielen"
 * "ISänger" mit der void Methode "singen"
 * Eine Klasse:
 * "Musiker", implementiert IGitarrenspieler und ISänger.
 * Die implementierten Methoden sollen etwas in der Konsole ausgeben.
 * Im Main einen Musiker erzeugen und die implementierten Methoden aufrufen.
 * Erstellen Sie ein UML Klassendiagramm.
 */



public class Main {

    public static void main(String[] args)
    {
        Musiker m = new Musiker();
        m.gitarreSpielen();
        m.singen();

    }


}
