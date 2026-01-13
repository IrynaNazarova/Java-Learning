package step16.unterrichtAggregation.aufgabe3;

public class Arzt {
    private String name;
    private String fachrichtung;
    private int id;

    public Arzt(String name, String fachrichtung, int id) {
        this.name = name;
        this.fachrichtung = fachrichtung;
        this.id = id;
    }

    public void zeigeInfo() {
        System.out.println("Arzt ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Fachrichtung: " + fachrichtung);
    }
}
