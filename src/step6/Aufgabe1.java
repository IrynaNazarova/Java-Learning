package step6;

/*
Divide and Conquer:
1. Elemente isolieren
2. Erste Idee der Reihenfolge (Abhängigkeiten der Elemente)
3. Jedes Element einzeln bearbeiten
(3.1) Wenn immer noch zu kompliziert: Weitere unter Elemente bilden (Siehe 1.)
4. Elemente zusammensetzen
*/

public class Aufgabe1 {

    public static void main(String[] args) {
        //Array "Album", 5
        String[] Album = new String[5];

        //5 Song Titel
        Album[0] = "Hotel California";
        Album[1] = "Ich lieb dich";
        Album[2] = "Ich lieb dich immer mehr";
        Album[3] = "Ich lieb dich so sehr, dass es echt kein Spaß mehr macht";
        Album[4] = "Das beste kommt zum Schluss";

        //For-Schleife alle ausgeben
        for (int i = 0; i < Album.length; i++) {
            System.out.println(Album[i]);
        }
    }

    /*
    Pseudo-Code:
    Album = String Array

    Album an 0 = "Song Titel 1"
    ...
    Album an 4 = "Song Titel 5"

    für jedes Element in "Album" -> gib aus
    */
}
