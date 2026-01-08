package step11.unterricht.übung;

import java.util.ArrayList;

public class Übungsaufgabe {
      /*
    Schreiben Sie ein kleines Programm, das Alben und Songs speichert. (Nicht zu kompliziert, also ohne Getter oder Setter usw.)
    Alben speichern Songs in einer Collection und haben eine Methode, mit der wir Songs an ein Album anhängen können.
    z.B. meinAlbum.fügeSongHinzu(new Song("Alle Jahre wieder"));
    */

    public static void main(String[] args) {
        Album meinAlbum = new Album();
        meinAlbum.fügeSongHinzu(new Song("Alle Jahre wieder"));
    }
}

class Album {
    private ArrayList<Song> songs = new ArrayList<>();
    public void fügeSongHinzu(Song song) {
        songs.add(song);
    }
}

class Song {
    public String titel;
    public Song(String titel) {
        this.titel = titel;
    }
}
