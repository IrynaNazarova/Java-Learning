package step4;

public class Main {
    public static void main(String[] args) {
        // Teilen durch 0
        try {
            int ganzzahlErgebnis = 1 / 0; // Ist in Java nicht definiert und wirft eine Exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        double fließkommaErgebnis = 1.0 / 0.0;
        System.out.println(fließkommaErgebnis);
        System.out.println(Double.isInfinite(fließkommaErgebnis));

        // Type-Casting
        // (Zieltyp) Ausgangswert
        float spielerLebenspunkte = 5f;
        double lebenspunktePool = spielerLebenspunkte; // implicit cast
        float einKleinererLebensPool = (float) lebenspunktePool; // explicit cast
    }
}
