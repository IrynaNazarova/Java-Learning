package step6;

public class ReferenzenUndWerte {

    public static void main(String[] args) {
        System.out.println("Array");
        int[] filmSpiellängeAlsArray = new int[1];
        filmSpiellängeAlsArray[0] = 160;

        passeLängeAn(filmSpiellängeAlsArray); // manipuliert den Wert von filmSpiellängeAlsArray
        System.out.println(filmSpiellängeAlsArray[0]);

        System.out.println("int");
        int filmSpiellängeAlsInt = 160;

        passeLängeAn(filmSpiellängeAlsInt); // manipuliert nicht den Wert von filmSpiellängeAlsInt
        System.out.println(filmSpiellängeAlsInt);
    }

    public static void passeLängeAn(int[] speicherOrt) {
        speicherOrt[0] = 100;
    }

    // hat nicht den gewünschten Effekt
    public static void passeLängeAn(int kopieVomWert) {
        kopieVomWert = 100; // Hat nicht die gleiche Wirkung
        // Wenn wir den Wert herausbekommen wollen, müssten wir z.B. das Return Keyword verwenden.
    }
}
