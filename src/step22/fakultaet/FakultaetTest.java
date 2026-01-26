package step22.fakultaet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FakultaetTest {

    @Test
    public void testBerechne()
    {
        assertEquals(1, Fakultaet.berechne(0)); // 0! = 1
        assertEquals(1, Fakultaet.berechne(1)); // 1! = 1
        assertEquals(2, Fakultaet.berechne(2)); // 2! = 2
        assertEquals(6, Fakultaet.berechne(3)); // 3! = 6
        assertEquals(24, Fakultaet.berechne(4)); // 4! = 24

        /*
            - Wir testen die berechne-Methode mit einigen bekannten Fakultätswerten.
            - Wir verwenden assertEquals um zu überprüfen, ob das Ergebnis der berechne-Methode dem erwarteten Wert entspricht.
         */
    }

    @Test
    public void testBerechneMitNegativerZahl()
    {
        assertThrows(IllegalArgumentException.class, () -> Fakultaet.berechne(-1));

        /*
            - Wir testen auch, ob die berechne-Methode eine Ausnahme auslöst, wenn sie mit einer negativen Zahl aufgerufen wird.
            - Dies tun wir mit der assertThrows-Methode
         */
    }
}
