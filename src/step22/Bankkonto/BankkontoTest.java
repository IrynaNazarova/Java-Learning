package step22.Bankkonto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankkontoTest {

    Bankkonto konto;

    @BeforeEach
    public void vorbereitung()
    {
        konto = new Bankkonto(100);
    }

    @Test
    public void testPositivEinzahlen()
    {
        //Übergabe von 2 Werten
        // -> erwartetes Guthaben
        // -> tatsächliches Guthaben

        //assertEquals prüft ob die beiden Werte gleich sind
        // falls ja ist der Test bestanden -> grün
        // falls nein ist der Test nicht bestanden -> gelb
        double neuesGuthaben = konto.einzahlen(50);
        assertEquals(150, neuesGuthaben);

    }

    @Test
    public void testMinusEinzahlen()
    {
        double neuesGuthaben = konto.einzahlen(-50);
        // Falls der Betrag kleiner als 0 wird das Guthaben unverändert
        // zurückgegeben
        assertEquals(100,neuesGuthaben);
    }

    @Test
    public void testPositivAbheben()
    {
        // Test 100 Euro abhebe
        assertEquals(0, konto.abheben(100));
    }

    @Test
    public void testKontoÜberziehen()
    {
        // Guthaben bleibt wie es ist, da überziehen nicht erlaubt
        assertEquals(100, konto.abheben(200));
    }

    // Es können noch weitere Testfälle geschrieben werden
    // z.B. für die getGuthaben-Methode, ...

}
