package step1;

public class Datentypen {
    public static void main(String[] args) {
        // Primitive Datentypen
        //                      // Wertebereich                             // Standardwert         // Größe [Bit]
        boolean bool = true;    // true, false                              // false                // 1
        byte b8 = 1;            // -128...+127                              // 0                    // 8
        short short16 = 2;      // -2^15...+2^15-1                          // 0                    // 16
        int int32 = 3;          // -2^31...+2^31-1                          // 0                    // 32
        long long64 = 4L;       // -2^63...+2^63-1                          // 0                    // 64
        float float32 = 3.5F;   // +-1.2*10^-38...+-3.4*10^38               // 0                    // 32
        double double64 = 50.5; // +-2.2*10^-308...+-1.8*10^308             // 0                    // 64
        char character = 'C';   // \u0000 ... \uFFFF (Unicode Zeichen)      // \u0000 (NULL)        // 16
        // https://www.utf8-zeichentabelle.de/unicode-utf8-table.pl?utf8=dec

        float f = 1.0F; // Der Standard-Typ für Kommazahlen ist Double. Um die Zahl in einen Float zu schreiben, müssen wir F angehen oder in float casten.
        f = (float) 2.0; // Beispiel mit Cast.
        long l = 10_000_000_000L; // Bei Zahlen größer als knapp 2 Milliarden (int) muss ich L für long angeben!

        // Floating Points und Precision: https://0.30000000000000004.com/

        System.out.println("CASTEN");
        int integer = 1234567890;
        //short integerInShort = integer; // Fehler, da Integer zu groß für Short ist.
        short integerInShort = (short) integer; // Durch den expliziten Cast wird aus int ein short.
        System.out.println(integerInShort);

        // Rangfolge der Operatoren: https://introcs.cs.princeton.edu/java/11precedence/
    }
}
