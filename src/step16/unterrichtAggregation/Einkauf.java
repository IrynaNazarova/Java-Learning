package step16.unterrichtAggregation;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Einkauf {
    private int id;
    private LocalDateTime datum;
    private Person käufer;
    private Produkt ware;
    public static ArrayList<Einkauf> liste = new ArrayList<>();
    private static int couter = 0;

    public Einkauf(Person käufer, Produkt ware)
    {
        couter++; //Da das Attribut static ist, wird es bei jedem erneuten Aufruf des Konstruktors um eins erhöht
        this.id = couter; //der neue Wert von couter wird nun in id gespeichert
        this.datum = LocalDateTime.now(); // Mit LocalDateTime.now wird der aktuelle Zeitpunkt abgespeichert
        this.käufer = käufer;
        this.ware = ware;
        liste.add(this);
    }

    public int getId()
    {
        return id;
    }


    public LocalDateTime getDatum()
    {
        return datum;
    }

    public Person getKäufer()
    {
        return käufer;
    }

    public void setKäufer(Person käufer)
    {
        this.käufer = käufer;
    }

    public Produkt getWare()
    {
        return ware;
    }

    public void setWare(Produkt ware)
    {
        this.ware = ware;
    }
}
