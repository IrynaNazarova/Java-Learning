package step19.aufgaben.aufgabe3;

import java.util.ArrayList;
import java.util.Random;

public abstract class Stand implements BrandStatik {

    static Random zuf = new Random();
    static ArrayList<Stand> staende = new ArrayList<>();
    int size;
    int miete;
    int umsatz;
    boolean hatBrandschutz;
    boolean hatStatik;
    boolean hatErlaubnis;
    boolean hatLizenz;
    boolean hatInfektion;

    public void brandschutz() {
        hatBrandschutz = true; // MUSS haben
    }

    public void statik() {
        hatStatik = true; // MUSS haben
    }

    protected Stand(){
        if(zuf.nextInt(0,2) == 0){
            size = zuf.nextInt(Werte.minSizeKlein, Werte.maxSizeKlein + 1);
        }else{
            size = zuf.nextInt(Werte.minSizeGross, Werte.maxSizeGross + 1);
        }
        switch (this.getClass().getSimpleName()) {
            case "StandGlueh" -> miete = size * Werte.mieteGlueh;
            case "StandFutter" -> miete = size * Werte.mieteFutter;
            case "StandVerkauf" -> miete = size * Werte.mieteVerkauf;
        }
        staende.add(this);
    }

    static void umsatzGenerieren(int summeBesucherGlueh, int summeBesucherFutter, int summeBesucherVerkauf){
        double qmGesamtGlueh = 0;
        double qmGesamtFutter = 0;
        double qmGesamtVerkauf = 0;
        double faktorGlueh;
        double faktorFutter;
        double faktorVerkauf;
        for(Stand s : staende){
            switch (s.getClass().getSimpleName()) {
                case "StandGlueh" -> qmGesamtGlueh += s.size;
                case "StandFutter" -> qmGesamtFutter += s.size;
                case "StandVerkauf" -> qmGesamtVerkauf += s.size;
            }
        }

        faktorGlueh = 100 / qmGesamtGlueh;
        faktorFutter = 100 / qmGesamtFutter;
        faktorVerkauf = 100 / qmGesamtVerkauf;
        double umsatzGlueh = zuf.nextInt(Werte.gluehGeldMin, Werte.gluehGeldMax) * summeBesucherGlueh;
        double umsatzFutter = zuf.nextInt(Werte.futterGeldMin, Werte.futterGeldMax) * summeBesucherFutter;
        double umsatzVerkauf = zuf.nextInt(Werte.verkaufGeldMin, Werte.verkaufGeldMax) * summeBesucherVerkauf;

        for(Stand s : staende){
            switch (s.getClass().getSimpleName()) {
                case "StandGlueh" -> s.umsatz = (int)(umsatzGlueh * ((s.size * faktorGlueh) / 100));
                case "StandFutter" -> s.umsatz = (int)(umsatzFutter * ((s.size * faktorFutter) / 100));
                case "StandVerkauf" -> s.umsatz = (int)(umsatzVerkauf * ((s.size * faktorVerkauf) / 100));
//                case "StandGlueh" -> s.umsatz = (int)(umsatzGlueh * s.size);
//                case "StandFutter" -> s.umsatz = (int)(umsatzFutter * s.size);
//                case "StandVerkauf" -> s.umsatz = (int)(umsatzVerkauf * s.size);
            }
        }
        ausgabe(summeBesucherGlueh, summeBesucherFutter, summeBesucherVerkauf);
    }
    static void ausgabe(int sumBesG, int sumBesF, int sumBesV){
        System.out.println("Stand\t\t\tGröße\t\tMiete\t\tUmsatz\t\tBesucher");
        for(Stand s : staende){
            System.out.print(String.format("%12s",s.getClass().getSimpleName()));
            System.out.print("\t" + String.format("%3d",s.size) + "\t\t\t" +
                    String.format("%5d",s.miete) + "\t\t" +
                    String.format("%6d",s.umsatz) + "\t\t");

            switch (s.getClass().getSimpleName()) {
                case "StandGlueh" -> System.out.println(sumBesG);
                case "StandFutter" -> System.out.println(sumBesF);
                case "StandVerkauf" -> System.out.println(sumBesV);
            }
        }
    }
}
