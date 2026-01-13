package step16.unterrichtKomposition.aufgabe5;


import java.util.*;

public class Warenkorb {
    // Dadurch, dass WarenkorbItem eine innere Klasse von Warenkorb ist, können Objekte davon nur über die äußere Klasse angelegt werden.
    private static class WarenkorbItem
    {
        private Artikel item;

        /**
         * Der sich im Warenkorb befindende Artikel.
         */
        public Artikel getItem()
        {
            return item;
        }

        private int anzahl;

        /**
         * Die Anzahl, wie oft der Artikel im Warenkorb liegt. Anzahl muss größer 0 sein.
         */
        public int getAnzahl()
        {
            return anzahl;
        }

        public void setAnzahl(int anzahl)
        {
            if (anzahl > 0)
                this.anzahl = anzahl;
        }

        /**
         * Gibt den Gesamtpreis des Artikels zurück. Berechnet durch Verkaufspreis * Anzahl.
         */
        public double getItemPreis()
        {
            return item.getVerkaufspreis() * anzahl;
        }

        /**
         * Gibt einen String mit Informationen über den Artikel im Warenkorb zurück.
         *
         * @return Einen String aus Id, Bezeichnung, Verkaufspreis, Anzahl und Gesamtpreis.
         */
        public String getWarenkorbItemString()
        {
            return String.format(item.getArtikelString() + " - Anzahl: %d - Gesamtpreis: %.2f", anzahl, getItemPreis());
        }

        /**
         * Instanziiert ein neues Warenkorb-Item.
         *
         * @param item   Der Artikel im Warenkorb.
         * @param anzahl Die Anzahl, wie oft sich der Artikel im Warenkorb befindet.
         */
        private WarenkorbItem(Artikel item, int anzahl)
        {
            this.item = item;
            setAnzahl(anzahl);
        }
    }


    /**
     * Eine Liste aller Artikel im Warenkorb.
     */
    private ArrayList<WarenkorbItem> itemListe;

    /**
     * Gibt den Gesamtpreis aller Artikel im Warenkorb zurück.
     */
    public double getGesamtpreis() // Als Property (Eigenschaft)
    {

        double summe = 0;
        for (WarenkorbItem item : itemListe)
        {
            summe += item.getItemPreis();
        }

        return summe;

    }

    /**
     * Fügt einen über die Artikel-ID identifizierten Artikel mit einer gewünschten Anzahl dem Warenkorb hinzu. Befindet sich der Artikel bereits im Warenkorb, wird die Anzahl erhöht.
     * <br/>Gibt true zurück, wenn erfolgreich, sonst false.
     *
     * @param artikelId Die ID des Artikels.
     * @param anzahl    Die gewünschte Anzahl.
     * @return True wenn erfolgreich, sonst False.
     */
    public boolean artikelHinzufügen(int artikelId, int anzahl)
    {
        // Sucht in der ArtikelListe der Klasse Artikel nach dem Objekt mit der passenden artikelID und gibt den Artikel zurück, wenn er gefunden wurde, sonst null.
        Artikel artikel = Artikel.getArtikel(artikelId);
        // Und wenn der Artikel gefunden wurde...
        return artikelHinzufügen(artikel, anzahl); // Aufruf der zweiten 'ArtikelHinzufügen' Methode
    }

    /**
     * Fügt einen Artikel mit einer gewünschten Anzahl dem Warenkorb hinzu. Befindet sich der Artikel bereits im Warenkorb, wird die Anzahl erhöht.
     * <br/>Gibt true zurück, wenn erfolgreich, sonst false.
     *
     * @param artikel Der Artikel.
     * @param anzahl  Die gewünschte Anzahl.
     * @return True wenn erfolgreich, sonst False.
     */
    public boolean artikelHinzufügen(Artikel artikel, int anzahl)
    {
        if (artikel != null)
        {
            // dann prüfen wir, ob der gesuchte Artikel bereits im Warenkorb ist, indem wir uns jedes Item im Warenkorb anschauen...
            for (WarenkorbItem item : itemListe)
            {
                // und wenn ein Item im Warenkorb dem gefundenen Artikel entspricht...
                if (item.getItem() == artikel)
                {
                    // dann erhöhen wir einfach die Anzahl
                    item.setAnzahl(item.getAnzahl() + anzahl);
                    return true;
                }
            }
            // Sonst fügen wir den Artikel neu dem Warenkorb hinzu
            itemListe.add(new WarenkorbItem(artikel, anzahl));
            return true;
        }
        // Wenn wir keinen Artikel mit der artikelId gefunden haben, geben wir false zurück
        return false;
    }

    /**
     * Entfernt einen Artikel aus dem Warenkorb.
     */
    public boolean artikelEntfernen(int artikelId, int anzahl)
    {
        // Sucht in der ArtikelListe der Klasse Artikel nach dem Objekt mit der passenden artikelID und gibt den Artikel zurück, wenn er gefunden wurde, sonst null.
        Artikel artikel = Artikel.getArtikel(artikelId);
        // Und wenn der Artikel gefunden wurde...
        return artikelEntfernen(artikel, anzahl);
    }

    /**
     * Entfernt einen Artikel aus dem Warenkorb.
     */
    public boolean artikelEntfernen(Artikel artikel, int anzahl)
    {
        if (artikel != null)
        {
            for (WarenkorbItem item : itemListe)
            {
                // und wenn ein Item im Warenkorb dem Artikel entspricht...
                if (item.getItem() == artikel)
                {
                    // wenn die verbleibende Anzahl kleiner gleich 0 ist
                    if (item.getAnzahl() - anzahl <= 0)
                    {
                        // dann entfernen wir den Artikel komplett aus dem Warenkorb
                        itemListe.remove(item);
                    }
                    // Sonst verringern wir die Anzahl im Warenkorb um die gewünschte Anzahl
                    else
                    {
                        item.setAnzahl(item.getAnzahl() - anzahl);
                    }

                    return true;
                }
            }

            // Wenn sich der Artikel nicht im Warenkorb befindet...
            return false;
        }

        // Wenn der Artikel nicht gefunden wurde...
        return false;
    }


    /**
     * Gibt einen String mit Informationen zu allen Artikeln im Warenkorb zurück, inklusive der Summe.
     */
    public String getWarenkorbString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Aktueller Warenkorb: \n");

        // Ruft für jedes Item im Warenkorb die GetWarenkorbItemString-Methode auf...
        for (WarenkorbItem item : itemListe)
        {
            // und fügt den Rückgabewert dem String hinzu
            sb.append(item.getWarenkorbItemString()).append("\n");
        }
        sb.append(String.format("Summe: %.2f", getGesamtpreis()));
        return sb.toString();
    }

    /**
     * Erzeugt eine Warenkorb-Instanz und instanziiert die ItemListe.
     */
    public Warenkorb()
    {
        itemListe = new ArrayList<WarenkorbItem>();
    }
}
