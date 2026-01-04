package step8;

import java.util.Scanner;

public class MusikSchrank {
    public static void main(String[] args) {
        String[][][] musikschrank = {
                { // Album 1 "Peters Beste"
                        {"Alle Jahre Wieder", "1999", "Peter Lustig, Udo Jürgens"},
                        {"Alle Jahre Schonwieder", "2000", "Peter Lustig"},
                        {"Alle mein Bauwagen", "2000", "Peter Lustig"},
                        {"Alle mein Bauwagen (Instrumental)", "2001", "Peter Lustig"},
                },
                { // Album 2 "Udo und Crew"
                        {"Alle Jahre Wieder", "1999", "Peter Lustig, Udo Jürgens"},
                        {"Alle Jahre Schonwieder", "1999", "Udo Jürgens"},
                        {"Langsam fällt mir nix mehr ein", "2000", "Udo Jürgens"},
                },
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe deinen Songtitel ein (ohne Schreibfehler!!!1!11!!)");
        String suchwort = scanner.nextLine();
        int ergebnis = sucheAlbumDurchTitel(suchwort, musikschrank);
        if (ergebnis > -1) System.out.println("Du Findest das Album mit deinen Song im Fach " + (ergebnis + 1));
        else System.out.println("Leider hast du kein Album mit diesem Song im Schrank.");
    }

    public static int sucheAlbumDurchTitel(String suchwort, String[][][] musikschrank) {
        int titelIndex = 0;
        int jahrIndex = 1;
        int interpretenIndex = 2;

        // Finde alle Titel -> For Schleife
        for (int albumIndex = 0; albumIndex < musikschrank.length; albumIndex++) {
            for (int songIndex = 0; songIndex < musikschrank[albumIndex].length; songIndex++) {
                String titel = musikschrank[albumIndex][songIndex][titelIndex];
                if (titel.contains(suchwort)) { // Tipp: mit .toLowerCase() können wir die Suche noch robuster machen
                    return albumIndex;
                }
            }
        }
        return -1; // Nicht 0, da 0 auch "richtiger" Wert sein kann.
    }
}
