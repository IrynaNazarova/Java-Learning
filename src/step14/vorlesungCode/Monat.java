package step14.vorlesungCode;

import java.util.ArrayList;

public enum Monat {

    JANUAR(1,1),
    FEBRUAR(2,1),
    MÄRZ(3,1),
    APRIL(4,2),
    MAI(5,2),
    JUNI(6,2),
    JULI(7,3),
    AUGUST(8,3),
    SEPTEMBER(9,3),
    OKTOBER(10,4),
    NOVEMBER(11,4),
    DEZEMBER(12,4);

    // Zwei Variablen, um zu jeder Konstante zwei Werte speichern zu können
    // Jede Konstante erhält eine Kopie dieser Felder
    private final int zahl;
    private final int quartal;


    //KONSTRUTOR
    // Die Parameter des Konstruktors müssen nicht wie die Felder heißen
    private Monat(int z, int q)
    {
        zahl = z;
        quartal = q;
    }

    public int getZahl()
    {
        return zahl;
    }

    public int getQuartal()
    {
        return quartal;
    }

    // Erzeugt eine ArrayList mit allen Monaten passend zum übergebenen Quartal
    // diese erzeugte ArrayList soll dann zurückgegeben werden

    public static ArrayList<Monat> getMonateInQuartal(int q)
    {
        ArrayList<Monat> monateInQuartal = new ArrayList<>();
        //Enums sind Datentypen und diese Datentypen können auch für Listen und Arrays verwendet werden

        for(Monat m : Monat.values())
        {
            if(m.quartal == q)
            {
                monateInQuartal.add(m);
            }
        }

        return monateInQuartal;
    }
}
