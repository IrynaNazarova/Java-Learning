package step19.aufgaben.aufgabe1;

public class Flugzeug extends Fahrzeug implements IFlugfähig, IFahrbar {
    public void fahren() {
        System.out.println("Dieses Fahrzeug kann fahren.");
    }

    public void fliegen() {
        System.out.println("Dieses Fahrzeug kann fliegen, wenn es schnell genug fährt.");

    }
}
