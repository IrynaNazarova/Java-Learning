package step19.aufgaben.aufgabe1;

public class Auto extends Fahrzeug implements IFahrbar{
    public void fahren()
    {
        System.out.println("Dieses Fahrzeug kann nur auf Straßen fahren.");
    }

}
