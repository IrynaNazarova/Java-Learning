package step24.unterricht;
// Bekanntes Verfahren: wir implementieren das Interface in einer Klasse und verwenden die Instanz-Methode, um eine Quadratzahl zu berechnen.
public class QuadratZahlBerechner  implements IOperation{
    @Override
    public int calculate(int zahl)
    {
        return zahl * zahl;
    }

}
