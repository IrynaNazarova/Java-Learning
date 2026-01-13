package step16.unterrichtAggregation.aufgabe2;

public class Motor {
    private String typ;
    private int leistung; // in PS

    public Motor(String typ, int leistung) {
        this.typ = typ;
        this.leistung = leistung;
    }

    public String getMotorInfo() {
        return typ + " mit " + leistung + " PS";
    }
}
