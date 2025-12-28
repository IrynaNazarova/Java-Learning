package step5;

public class StringBuilderExamples {
     /*
    StringBuilder ist eine Klasse in Java, die verwendet wird, um veränderbare Zeichenfolgen zu erstellen und zu bearbeiten.
    Im Gegensatz zu String-Objekten, die unveränderlich sind, ermöglicht StringBuilder das effiziente Bearbeiten von Zeichenfolgen,
    ohne jedes Mal ein neues Objekt zu erstellen.
    */

    public static void main(String[] args) {
        // StringBuilder erstellen
        StringBuilder sb = new StringBuilder("Hallo");

        // Zeichenfolge anhängen
        sb.append(" Welt");
        System.out.println(sb); // Ausgabe: Hallo Welt

        // Zeichenfolge einfügen
        sb.insert(6, "Java ");
        System.out.println(sb); // Ausgabe: Hallo Java Welt

        // Zeichenfolge löschen
        sb.delete(6, 11);
        System.out.println(sb); // Ausgabe: Hallo Welt

        // Zeichenfolge umkehren
        sb.reverse();
        System.out.println(sb); // Ausgabe: tleW ollaH
    }
}
