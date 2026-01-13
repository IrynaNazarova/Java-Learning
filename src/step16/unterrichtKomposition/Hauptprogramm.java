package step16.unterrichtKomposition;

public class Hauptprogramm {
    public static void main(String[] args)
    {

        Gebäude schule = new Gebäude("Schulgebäude",1,2,3,4,5);
        schule.ausgabe();

        Gebäude bahnhof = new Gebäude("Bahnhofsgebäude", 1,2);
        bahnhof.ausgabe();

    }
}
