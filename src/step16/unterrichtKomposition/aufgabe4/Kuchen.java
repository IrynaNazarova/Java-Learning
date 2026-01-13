package step16.unterrichtKomposition.aufgabe4;

import java.util.*;

public class Kuchen {
    // Private Klasse mit privatem Konstruktor damit außerhalb des Kuchens keine Variablen und Objekte erstellt werden können.
    private static class Kuchenstück
    {
        private int gewicht;

        private Kuchenstück(int gewicht)
        {
            this.gewicht = gewicht;
        }
    }

    // In dieser Liste werden alle Kuchen abgespeichert.
    private static ArrayList<Kuchen> kuchenListe = new ArrayList<>();

    // In dieser Liste werden alle Stücke eines Kuchens gespeichert.
    private ArrayList<Kuchenstück> kuchenstückListe = new ArrayList<>();

    private int getGesamtGewicht()
    {
        int summe = 0;

        for (Kuchenstück s : kuchenstückListe)
            summe = summe + s.gewicht;

        return summe;
    }

    public static String getAlleKuchen()
    {
        StringBuilder sb = new StringBuilder();

        for (Kuchen k : kuchenListe)
        {
            sb.append(k.toString()).append("\n");
            for (Kuchenstück s : k.kuchenstückListe)
            {
                sb.append(s.toString()).append(":");
                sb.append(s.gewicht).append("\n");
            }
            sb.append(k.getGesamtGewicht()).append("\n");
        }

        return sb.toString();
    }

    /**
     * @param gewichte Eine Liste mit den Gewichten der einzelnen Kuchenstücke.
     * @throws IllegalArgumentException Wenn die Liste mit Gewichten null ist oder eine Länge von 0 hat.
     */
    public Kuchen(ArrayList<Integer> gewichte) throws IllegalArgumentException
    {
        if (gewichte == null || gewichte.size() == 0)
        {
            throw new IllegalArgumentException("Ungültige Gewichtsangabe! 'Gewichte' war null oder leer und es konnten keine Kuchenstücke erzeugt werden!");
        }

        kuchenListe.add(this);
        for (int gewicht : gewichte)
        {
            if (gewicht > 0)
            {
                Kuchenstück stück = new Kuchenstück(gewicht);
                kuchenstückListe.add(stück);
            }
        }
    }
}
