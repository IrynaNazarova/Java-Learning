package step16.unterrichtKomposition.aufgabe3;
import java.util.*;


public class Kuchen {
    private static class Kuchenstück
    {
        private Kuchenstück(int gewicht)
        {
            this.gewicht = gewicht;
        }

        private int gewicht;

        public int getGewicht()
        {
            return gewicht;
        }

    }

    private static final List<Kuchen> kuchenListe = new ArrayList<Kuchen>();
    private final List<Kuchenstück> kuchenstückListe = new ArrayList<Kuchenstück>();

    public static void zeigeAlleKuchen()
    {
        int i = 0, j;
        for (Kuchen k : kuchenListe)
        {
            i++;
            System.out.println("Kuchen " + i);
            j = 0;
            for (Kuchenstück s : k.kuchenstückListe)
            {
                j++;
                System.out.println("  Stück " + j + ": " + s.getGewicht() + " Gramm");
            }
            System.out.println("  Gesamtgewicht: " + k.gesamtGewicht() + "\n");
        }
    }

    public Kuchen(List<Integer> intListe)
    {
        for (int i : intListe)
        {
            kuchenstückListe.add(new Kuchenstück(i));
        }
        if (intListe.size() > 0)
        {
            kuchenListe.add(this);
        }
        else
        {
            System.out.print("Der Kuchen besitzt 0 Kuchenstücke und wird daher nicht zur Kuchenliste hinzugefügt!\n\n");
        }
    }

    private int gesamtGewicht()
    {
        int summe = 0;
        for (Kuchenstück k : kuchenstückListe)
            summe += k.getGewicht();

        return summe;
    }
}
