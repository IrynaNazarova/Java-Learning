package step16.unterrichtAggregation.aufgabe3;

public class Main {
    public static void main(String[] args)
    {
        Arzt a1 = new Arzt("Dr. Meyer", "Kardiologie", 1001);
        Arzt a2 = new Arzt("Dr. Schmidt", "Neurologie", 1002);
        Arzt a3 = new Arzt("Dr. Fischer", "Orthopädie", 1003);

        Krankenhaus kh = new Krankenhaus("Städtisches Klinikum", "München");

        kh.arztHinzufuegen(a1);
        kh.arztHinzufuegen(a2);
        kh.arztHinzufuegen(a3);

        kh.alleAerzteAnzeigen();
    }
}
