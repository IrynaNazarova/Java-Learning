package step19.aufgaben.aufgabe1;

import java.util.ArrayList;
import java.util.List;

abstract class Fahrzeug {

    public static List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();

    protected Fahrzeug()
    {
        fahrzeuge.add(this);
    }
}
