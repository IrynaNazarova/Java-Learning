package step16.unterrichtAggregation.aufgabe3;

import java.util.ArrayList;

public class Krankenhaus {
    private String name;
    private String standort;
    private ArrayList<Arzt> aerzte;

    public Krankenhaus(String name, String standort) {
        this.name = name;
        this.standort = standort;
        this.aerzte = new ArrayList<>();
    }

    public void arztHinzufuegen(Arzt arzt) {
        aerzte.add(arzt);
    }

    public void alleAerzteAnzeigen() {
        System.out.println("Krankenhaus: " + name + " (" + standort + ")");
        System.out.println("Liste der Ärzte:");
        for (Arzt a : aerzte) {
            System.out.println("---------------");
            a.zeigeInfo();
        }
    }
}
