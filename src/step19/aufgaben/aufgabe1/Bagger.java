package step19.aufgaben.aufgabe1;

public class Bagger extends Fahrzeug implements IFahrbar, ISchwimmfähig {

    public void fahren()
    {
        System.out.println("Dieses Fahrzeug kann fast überall fahren.");
    }

    public void schwimmen()
    {
        System.out.println("Manche Arten dieses Fahrzeugs können sogar schwimmen.");
    }
}
