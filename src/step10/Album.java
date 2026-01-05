package step10;

public class Album {
    String name; // ohne Zugriffsmodifizierer in Java -> package private -> kann im paket gelesen und geschrieben werden
    int erscheinungsjahr; // s.o.
    private Song[] songs; // 'private' -> kann nur in der Klassen-Implementierung gelesen und geschrieben werden (z.B. in unseren Konstruktoren)

    // Konstruktor: Eine Methode mit demselben Namen wie der, der Klasse.
    // Achtung: Kein Rückgabetyp wird in Java definiert.
    // Diese Methode wird aufgerufen, wenn das Objekt erstellt wird.
    public Album(Song[] songs) { // Wir definieren, dass bei der Instanziierung von einem Album Songs übergeben werden müssen.
        this.name = "--Album noch in bearbeitung--";
        this.songs = songs;
        // 'this' -> Das Objekt vom Typ dieser Klasse, hier in diesem Moment (kann in allen Methoden/Konstruktoren in einer Klasse benutzt werden).
        // 'this' ist vor allem dann nützlich, wenn die Parameter-Bezeichner dieselben Namen haben.
    }

    // Wir können mehrere Konstruktoren erstellen, diese müssen sich nur in der Signatur unterscheiden (d.h. Parameter-Liste muss anders sein)
    public Album(String name, int erscheinungsjahr, Song[] songs) {
        this.name = name;
        this.erscheinungsjahr = erscheinungsjahr;
        this.songs = songs;
    }

    // Der Standard-Konstruktor ist der, der keine Parameter hat. Dieser existiert, SOLANGE KEIN anderer Konstruktor definiert wurde.
    // (Danach müssten wir ihn erneut selbst definieren, wenn wir ihn haben wollen.)
    /*
    public Album() {
    }
    */

    // Getter für das Geheimnisprinzip -> 'public' darf man nur lesen
    public String getName() {
        return name;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    // Wir fertigen eine "Kopie der Titel" an und geben sie der Öffentlichkeit frei.
    public String[] getAlleTitel() {
        String[] titel = new String[songs.length];
        for (int i = 0; i < songs.length; i++) {
            titel[i] = songs[i].titel;
        }
        return titel;
    }

    // Andere mögliche, öffentliche API
    public Song getSongAt(int position) {
        return songs[position];
    }
}
