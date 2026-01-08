package step11.unterricht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Unterricht {
    public static void main(String[] args) {
        // Fantastische Collections, und wo sie zu finden sind:
        // https://www.slightinsight.com/tech/the-ultimate-guide-to-java-collections/


        ArrayList<Album> meineAlben = new ArrayList<>(); // <> -> Generische Typisierung -> Ist wie ein Parameter, nur dass man einen Typ statt eines Wertes übergibt.
        ArrayList<String> songTitel = new ArrayList<>(); // Oder mit Strings
        // Eine Variante zum Befüllen über die Helferklasse
        Collections.addAll(songTitel, "Alle Jahre wieder", "Peter Lustigs Beste");
        // Im Gegensatz zu Arrays mussten wir keine Größe
        songTitel.add("Alle Jahre schon wieder");
        songTitel.add("Ich liebe dich");
        songTitel.add("Ich liebe dich immer mehr");
        songTitel.add("Ich liebe dich so sehr, dass es schon kein spaß mehr macht");
        System.out.println(songTitel); // Collections können implizit zu Strings konvertiert werden (kein .toString() nötig, wie etwa bei Arrays)

        songTitel.remove(0); // Entfernt an einem Index
        System.out.println(songTitel);
        songTitel.remove("Peter Lustigs Beste"); // Sucht und entfernt ein bestimmtes Objekt
        System.out.println(songTitel);

        // Inhalt auslesen
        boolean istSongEnthalten = songTitel.contains("Alle Jahre schon wieder");
        System.out.println(istSongEnthalten);
        System.out.println(songTitel.get(1)); // Zugriff auf ein Element am Index 1
        System.out.println(songTitel.indexOf("Alle Jahre schon wieder"));

        // Collections arbeiten mit Referenzen
        // (Es sind selbst Referenz-Typen und sie Speichern immer nur Referenzen)
        // ArrayList<int> test; // Fehler, weil int kein Referenz-Typ ist
        // u.a. dafür gibt es die Wrapper-Klassen (ist auch eine Helfer-Klasse)
        ArrayList<Integer> verkaufsZahlenUnsererAlben = new ArrayList<>();
        verkaufsZahlenUnsererAlben.add(10); // Implizite Konvertierung von 'int' zu 'Integer'
        verkaufsZahlenUnsererAlben.add(Integer.valueOf(10)); // Explizite Konvertierung von 'int' zu 'Integer'

        // Set (Menge)
        HashSet<String> eineMengeHübscherTitel = new HashSet<>();
        Collections.addAll(eineMengeHübscherTitel, "Alle Jahre wieder", "Alle Jahre schon wieder");
        System.out.println(eineMengeHübscherTitel);
        boolean einfügenHatGeklappt = eineMengeHübscherTitel.add("Alle Jahre wieder"); // Dieses Objekt ist bereits enthalten, einfügen schlägt fehl
        System.out.println(eineMengeHübscherTitel);
        System.out.println("Einfügen hat geklappt: " + einfügenHatGeklappt);

        // Map (Verzeichnis, Tabelle)
        HashMap<String, Album> albenPerNamen = new HashMap<>(); // Beide Typen: vom Schlüssel und vom Element werden definiert
        albenPerNamen.put("Top Hits 2025", new Album(new Song[]{new Song("Alle Jahre wieder")})); // put statt add: Schlüssel und Element werden abgelegt
        Album dasAlbumHinterDiesemNamen = albenPerNamen.get("Top Hits 2025"); // Zugriff über den Schlüsselwert (statt einem Index)
        System.out.println(dasAlbumHinterDiesemNamen.songs[0].titel);

        // Aus einer Map lassen wir uns ein Set (s.o.) aller Schlüssel geben
        System.out.println(albenPerNamen.keySet());
    }
}
