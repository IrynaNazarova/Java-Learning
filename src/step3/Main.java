package step3;

public class Main {
    public static void main(String[] args) {

        double irgendeinSchaden = berechneFeuerballSchaden(1.5, 5);
            System.out.println(irgendeinSchaden);
            System.out.println(berechneFeuerballSchaden(10, 5));
        int goblinRüstung = 3;
        double geblockterSchaden = berechneFeuerballSchaden(3.1415926535, 1000) - goblinRüstung;

        aufnahmeritualVollziehen("xxxNinjaxxx");
        aufnahmeritualVollziehen("Bob");

        werteKampfRundeAus(4);


        // Fehlerfall (Exceptions)
        int zahl = 10;
        int division = 0;
        // division = zahl / 0; // Hier würde das Programm kaputtgehen
            try { // Wir versuchen den folgen Körper auszuführen ...
            division = zahl / 0; // Hier wird die Exception gefangen
            System.out.println("Das hier passiert nicht mehr...");
        }
            catch (Exception meinFehlerBeiderDivision) { // ... wenn dabei etwas schiefläuft, fangen wir den Fehler auf ...
            System.out.println(meinFehlerBeiderDivision.getMessage()); // ... und benutzen ihn.
            System.out.println("Eine Eingabe von 0 ist nicht gestattet, aber weil wir lieb sind, geht das Programm weiter und wir nehmen ein ergebnis von 0 an.");
        }
            finally {
            // das wird auf jeden Fall noch ausgeführt
        }
        // Wieder in main()
            System.out.println("Hier gehts weiter...");


            try {
            aufnahmeritualVollziehenBeiDemAllesExplodierenKann("Bob");
        } catch (Exception unsereMöglicheExplosion) {
            System.out.println(unsereMöglicheExplosion.getMessage());
        }

            try {
            aufnahmeritualVollziehenBeiDemAllesExplodierenKann("xxxNinjaxxx");
        } catch (Exception unsereMöglicheExplosion) {
            System.out.println(unsereMöglicheExplosion.getMessage());
        }

            try {
            aufnahmeritualVollziehenBeiDemAllesExplodierenKannAberIstDannNurEineKleineExplosion("Bob");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // etwas tun und etwas zurückgeben
    // Rückgabetyp double
    public static double berechneFeuerballSchaden(double entfernungZumZiel, int magierIntelligenz) {
        double schaden = magierIntelligenz - entfernungZumZiel;
        if (schaden < 0) schaden = 0;
        return schaden; // Keyword mit Rückgabewert (Typ muss zur Methoden-Signatur passen)
    }

    // nur etwas tun, ohne etwas zurückzugeben
    // void -> kein Rückgabetyp
    public static void aufnahmeritualVollziehen(String neuesGildenmitglied) {
        if (neuesGildenmitglied.length() <= 3) {
            System.out.println("Sorry, " + neuesGildenmitglied + ", dieser Name ist zu kurz...");
            return; // Keyword ohne Rückgabewert (genauso wie break)
        }

        System.out.println("Hallo und willkommen bei den 'Drei lustigen Vier', " + neuesGildenmitglied + " !!! <3<3<3");
    }

    // nur etwas tun, ohne etwas zurückzugeben,
    // dafür kann eine Exception geworfen werden
    // void -> kein Rückgabetyp
    // mit throws keyword -> wir sagen der Außenwelt, dass die Explosion aufgefangen werden muss
    public static void aufnahmeritualVollziehenBeiDemAllesExplodierenKann(String neuesGildenmitglied) throws Exception {
        if (neuesGildenmitglied.length() <= 3) {
            System.out.println("Sorry, " + neuesGildenmitglied + ", dieser Name ist zu kurz...");
            throw new Exception("Alles explodiert"); // Keyword mit Exception Wert ('new Exception("Alles explodiert")' das alles ist der Wert)
        }

        System.out.println("Hallo und willkommen bei den 'Drei lustigen Vier', " + neuesGildenmitglied + " !!! <3<3<3");
    }

    // nur etwas tun, ohne etwas zurückzugeben,
    // dafür kann eine Exception geworfen werden
    // void -> kein Rückgabetyp
    // kein throws keyword -> die Außen KANN die explosion auffangen
    public static void aufnahmeritualVollziehenBeiDemAllesExplodierenKannAberIstDannNurEineKleineExplosion(String neuesGildenmitglied) {
        if (neuesGildenmitglied.length() <= 3) {
            System.out.println("Sorry, " + neuesGildenmitglied + ", dieser Name ist zu kurz...");
            throw new RuntimeException("Alles explodiert (aber nur klein)"); // Keyword mit Exception Wert ('new Exception("Alles explodiert")' das alles ist der Wert)
        }

        System.out.println("Hallo und willkommen bei den 'Drei lustigen Vier', " + neuesGildenmitglied + " !!! <3<3<3");
    }

    // Rekursion: Eine Methode sich selbst aufruft
    public static void werteKampfRundeAus(int anzahlGegner) {
        System.out.println("Bekämpfe einen Gegner...");
        anzahlGegner--;
        if (anzahlGegner > 0) werteKampfRundeAus(anzahlGegner);
        System.out.println("Noch " + anzahlGegner + " Gegner");
    }
}
