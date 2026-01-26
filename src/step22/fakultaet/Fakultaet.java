package step22.fakultaet;

public class Fakultaet {

     /*
Die Fakultät ist ein mathematischer Begriff, der oft durch ein Ausrufezeichen (!) symbolisiert wird. Wenn wir von der
Fakultät einer nicht-negativen ganzen Zahl n sprechen, bezeichnet als n!, meinen wir das Produkt aller positiven ganzen
Zahlen von 1 bis n.
Die Formel zur Berechnung der Fakultät lautet:
n!=n×(n−1)×(n−2)× ... × 3 × 2 × 1
Um das zu verdeutlichen, hier einige Beispiele:

-Die Fakultät von 4, also 4! , berechnet sich folgendermaßen: 4! = 4 x 3 x 2 x 1 = 24
-Die Fakultät von 3, also 3! , berechnet sich folgendermaßen: 3! = 3 x 2 x 1 = 6
-Die Fakultät von 2, also 2! , berechnet sich folgendermaßen: 2! = 2 x 1 = 2
-Die Fakultät von 1, also 1! , ist per Definition 1
-Die Fakultät von 0, also 0! , ist ebenfalls per Definition 1

Es ist wichtig zu beachten, dass die Fakultät nur für nicht-negative ganze Zahlen definiert ist. Die Fakultät für
negative Zahlen oder nicht-ganze Zahlen ist nicht definiert. Es gibt zwar eine Erweiterung des Fakultätskonzepts auf
solche Zahlen (die sogenannte Gamma-Funktion), aber das geht über den üblichen Rahmen der Fakultät hinaus.
 */

    public static long berechne(int n) throws IllegalArgumentException
    {
        if (n < 0)
            throw new IllegalArgumentException("Die Zahl muss größer oder gleich 0 sein.");

        long ergebnis = 1;
        for (int i = 2; i <= n; i++)
            ergebnis *= i;

        return ergebnis;
    }

}
