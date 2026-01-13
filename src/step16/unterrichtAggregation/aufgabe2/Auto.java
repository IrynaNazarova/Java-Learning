package step16.unterrichtAggregation.aufgabe2;

public class Auto {
    private String marke;
    private String modell;
    private Motor motor; // Aggregation

    public Auto(String marke, String modell, Motor motor) {
        this.marke = marke;
        this.modell = modell;
        this.motor = motor;
    }

    public void zeigeInfo() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Motor: " + motor.getMotorInfo());
    }
}
