package step12.zusatz;

import java.util.ArrayList;
import java.util.Collections;

public class ObjekteZuStrings {

    public static void main(String[] args) {
        ArrayList<Song> meineLieblingslieder = new ArrayList<>();
        Collections.addAll(meineLieblingslieder,
                new Song("Alle Jahre Wieder"),
                new Song("Alle Jahre schon wieder"
                ));

        System.out.println(meineLieblingslieder); // Intern wird .toString aufgerufen
        System.out.println(meineLieblingslieder.get(0).toString()); // einzelner Aufruf am Objekt
    }
}

class Song {
    private String titel;

    public Song(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "Ein schönes Lied mit dem Titel " + titel;
    }
}
