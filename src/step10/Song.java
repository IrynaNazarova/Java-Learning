package step10;

public class Song {
    String titel; // ohne Zugriffsmodifizierer in Java -> package private -> kann im paket gelesen und geschrieben werden
    String interpret; // s.o.
    int erscheinungsjahr; // s.o.

    public Song(String titel, String interpret, int erscheinungsjahr) {
        this.titel = titel;
        this.interpret = interpret;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    // Ein Konstruktor bei dem wir das Erscheinungsjahr vom Album übernehmen (Sentinel-Wert)
    public Song(String titel, String interpret) {
        this.titel = titel;
        this.interpret = interpret;
        this.erscheinungsjahr = -1;
    }

    // Geheimnisprinzip -> Diese Attribute darf man 'public' nur lesen.
    public String getTitel() {
        return titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public int getErscheinungsjahr(Album album) {
        if (erscheinungsjahr == -1) return album.erscheinungsjahr;
        return erscheinungsjahr;
    }
}
