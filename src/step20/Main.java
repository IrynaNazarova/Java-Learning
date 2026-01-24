package step20;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random zuf = new Random();
        int anzStaende = zuf.nextInt(Werte.standMin, Werte.standMax + 1);
        int sumStandGlueh = (int)(anzStaende * Werte.anteilGlueh); // 10%
        int sumStandFutter = (int)(anzStaende * Werte.anteilFutter); // 30%
        int sumStandVerkauf = (int)(anzStaende * Werte.anteilVerkauf); // 60%

        for(int index = 0; index < sumStandGlueh; index++){
            new StandGlueh();
        }
        for(int index = 0; index < sumStandFutter; index++){
            new StandFutter();
        }
        for(int index = 0; index < sumStandVerkauf; index++){
            new StandVerkauf();
        }

        for(int index = 0; index < 24; index++) { // 24 Tage geöffnet
            int anzahlBesucher = zuf.nextInt(Werte.besucherMin, Werte.besucherMax + 1);
            int summeBesucherGlueh = (int) (anzahlBesucher *
                    (Werte.besucherGlueh + Werte.besucherGlueVerkauf + Werte.besucherGluehFutterVerkauf)); // 30% + 25% + 15%
            int summeBesucherFutter = (int) (anzahlBesucher *
                    (Werte.besucherFutter + Werte.besucherGluehFutterVerkauf)); // 20% + 15%
            int summeBesucherVerkauf = (int) (anzahlBesucher *
                    (Werte.besucherVerkauf + Werte.besucherGlueVerkauf + Werte.besucherGluehFutterVerkauf)); // 10% + 25% + 15%

            System.out.println("------------- START TAG " + (index + 1) + "-------------");
            Stand.umsatzGenerieren(summeBesucherGlueh, summeBesucherFutter, summeBesucherVerkauf);
            //Stand.ausgabe();
            System.out.println("------------- ENDE TAG " + (index + 1) + "-------------\n");
            System.out.println("Presse ENTER für nächsten Tag...");
            sc.nextLine();
        }
    }
}
