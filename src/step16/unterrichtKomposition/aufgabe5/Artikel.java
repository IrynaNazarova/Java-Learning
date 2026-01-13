package step16.unterrichtKomposition.aufgabe5;

import java.util.*;

public class Artikel {
    /**
     * In dieser Liste werden alle Artikel abgespeichert.
     */
    public static final ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();

    private int id; // privates Feld

    /**
     * Die ID des Artikels
     */
    public int getId() // Dazugehöriger, öffentlicher Getter
    {
        return id;
    }

    private String bezeichnung;

    /**
     * Die Bezeichnung des Artikels
     */
    public String getBezeichnung()
    {
        return bezeichnung;
    }

    private double einkaufspreis;

    /**
     * Der Einkaufspreis des Artikels, muss größer 0 sein.
     */
    public double getEinkaufspreis()
    {
        return einkaufspreis;

    }

    public void setEinkaufspreis(double einkaufspreis)
    {
        if (einkaufspreis > 0) // If-Bedingung im Setter, prüft, ob der übergebene Wert größer 0 ist und weist nur dann einkaufspreis den Wert zu.
            this.einkaufspreis = einkaufspreis;
    }

    private int gewinnsatz;

    /**
     * Der Gewinnsatz des Artikels
     */
    public int getGewinnsatz()
    {
        return gewinnsatz;

    }

    public void setGewinnsatz(int gewinnsatz)
    {
        this.gewinnsatz = gewinnsatz;
    }

    /**
     * Gibt den Verkaufspreis des Artikels zurück. Berechnet aus Einkaufspreis + Gewinnsatz.
     */
    public double getVerkaufspreis()
    {
        return Math.round((einkaufspreis + (einkaufspreis / 100.0 * gewinnsatz)) * 100.0) / 100.0;
    }

    /**
     * Sucht in der ArtikelListe nach dem Artikel mit der übergebenen ID und gibt diesen zurück.
     * @param artikelId Die ID des gesuchten Artikels.
     * @return Den gesuchten Artikel oder null.
     */
    public static Artikel getArtikel(int artikelId)
    {
        for (Artikel artikel : artikelListe)
        {
            if (artikel.id == artikelId)
                return artikel;
        }
        return null;
    }

    /**
     * Gibt einen String mit Informationen über den Artikel zurück.
     * @return Einen string aus Id, Bezeichnung und Verkaufspreis.
     */
    public String getArtikelString()
    {
        return String.format("ID : %d - Bezeichnung: %s - Einzelpreis: %.2f", id, bezeichnung, getVerkaufspreis());
    }

    /**
     * Instanziiert einen Artikel und fügt ihn der ArtikelListe hinzu.
     * @param id ID des Artikels
     * @param bezeichnung Bezeichnung des Artikels
     * @param einkaufspreis Einkaufspreis des Artikels - muss größer 0 sein
     * @param gewinnsatz Gewinnsatz des Artikels
     */
    public Artikel(int id, String bezeichnung, double einkaufspreis, int gewinnsatz)
    {
        this.id = id; // Zuweisung über privates Feld
        this.bezeichnung = bezeichnung;
        setEinkaufspreis(einkaufspreis); // Zuweisung über den Setter, da sich dort eine Überprüfung des Wertes auf größer 0 befindet
        setGewinnsatz(gewinnsatz);

        artikelListe.add(this); // Fügt die aktuelle Instanz / das aktuelle Objekt der Liste hinzu.
    }
}
