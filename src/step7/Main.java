package step7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Wiederholung Deklaration und Initialisierung von Arrays
        String[] filmTitelDieWirNochBefüllenWollen = new String[2];
        String[] filmTitelDieWirDirektKennen = new String[]{"Terminator 1", "Kong-Fu Panda"};
        String[] filmTitelInitialisierungInKurz = {"Terminator 1", "Kong-Fu Panda"}; // Syntax-Erleichterung für die Schreibweise darüber ...

        // Mehrdimensionale Arrays
        String[][] schauspielerDerFilme = {
                {"Die Terminator Puppe", "Arnold"},
                {"Po", "Viper"}
        };
        // Auslesen
        System.out.println(schauspielerDerFilme[1][0]);

        // Die Elemente des äußeren Arrays sind einfach wieder Arrays
        System.out.println(Arrays.toString(schauspielerDerFilme[0]));
        System.out.println(schauspielerDerFilme[1].length);
        System.out.println(schauspielerDerFilme.length);

        // Für Iteration bedeutet das
        schauspielerDerFilme = new String[][]{ // Überschreiben -> new Keyword wieder benutzen
                {"Schauspieler A", "B", "C"}, // Film mit drei Schauspieler:innen
                {}, // Kunstfilm nur mit Props
                {"D-Prommie"} // Interview
        };
        for (int i = 0; i < schauspielerDerFilme.length; i++) {
            for (int j = 0; j < schauspielerDerFilme[i].length; j++) {
                System.out.printf("Indices: i = %s, j = %s%n", i, j);
                System.out.println(schauspielerDerFilme[i][j]);
            }
        }

        // Dreidimensional
        // Beispiel: 1. Dimension -> Filme, 2. Dimension -> Schauspieler:innen, 3. Dimension -> Rollen
        String[][][] rollen = {
                {/*Schauspieler 1*/{"Hauptfigur", "Taube aus Scene 3"}, /*Schauspieler 2*/{"Komparse 5"}, {"Komparse 1", "2", "3", "4"}},
                {}, // Film 2
                {{"Bösewicht"}, {"Held", "Doppelte Persönlichkeit vom Held"}}, // Letztes Komma ist erlaubt
        };
        for (int filmIndex = 0; filmIndex < rollen.length; filmIndex++) {
            for (int schauspielerIndex = 0; schauspielerIndex < rollen[filmIndex].length; schauspielerIndex++) {
                for (int rollenIndex = 0; rollenIndex < rollen[filmIndex][schauspielerIndex].length; rollenIndex++) {
                    System.out.println(rollen[filmIndex][schauspielerIndex][rollenIndex]);
                }
            }
        }

        // Mehrdimensional
        String[][][][][][][] inception;
    }
}
