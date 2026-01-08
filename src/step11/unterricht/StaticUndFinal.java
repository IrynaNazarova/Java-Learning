package step11.unterricht;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StaticUndFinal {
    public static void main(String[] args) {
        //topHits2025.formatierungseinstellungen = DateTimeFormatter.ofPattern("HH:mm:ss"); // Java erlaubt das, die IDE warnt us aber, dass wir das Feld an der Klasse setzen sollten.
        Album.formatierungseinstellungen = DateTimeFormatter.ofPattern("dd. MM. yyyy");

        Album topHits2025 = new Album(new Song[]{
                new Song(),
        });
        topHits2025.erscheinungsdatum = LocalDate.now();
        topHits2025.sageMirDasErscheinungsdatum();

        Song[] extraArray = new Song[5];
        // topHits2025.songs = extraArray; // Schreiben blockiert, weil das Attribut 'final' ist.
        System.out.println(Arrays.toString(topHits2025.songs));
    }
}

class Album {
    public static final String firmenName = "Mega-Musik-Macher GmbH"; // 'static final' -> Eine "Konstante", die global und an der Klasse zugänglich ist und sich nie verändert.
    public static DateTimeFormatter formatierungseinstellungen; // 'static' -> Dieses Feld wird an der Klasse und nicht im Objekt gespeichert.
    public final Song[] songs; // 'final' -> Schließt das Feld ab und erlaubt nur, dass es einmal initialisiert wird.
    public LocalDate erscheinungsdatum;

    public Album(Song[] songs) {
        this.songs = songs;
    }

    public void sageMirDasErscheinungsdatum() { // Aus einer nicht-statischen Methode dürfen wir statische Member verwenden, andersherum nicht.
        System.out.println(erscheinungsdatum.format(formatierungseinstellungen));
    }
}

class Song {
    public String titel;
    public int laufzeitSekunden;

    public Song(String titel) {
        this.titel = titel;
    }

    public Song() {
    }
}
