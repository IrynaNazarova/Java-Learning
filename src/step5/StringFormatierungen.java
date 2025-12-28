package step5;

import java.util.Date;

public class StringFormatierungen {
    public static void main(String[] args) {
        // String.format() – Grundlagen
        String name = "Anna";
        int alter = 30;
        System.out.printf("%s ist %d Jahre alt.%n", name, alter);
        // Ausgabe: Anna ist 30 Jahre alt.

        // printf mit %n == println von String.format
        System.out.println(String.format("%s ist %d Jahre alt.", name, alter));
        // Ausgabe: s.o.

        // Übersicht Platzhalter
        // % [argument_index$] [flags] [width] [.precision] conversion

        // Padding & Ausrichtung
        System.out.printf("%1$10s|%n", "Test");
        // Ausgabe: "      Test|"
        // %10s → Breite 10 (rechtsbündig)

        System.out.printf("%1$-10s|%n", "Test");
        // Ausgabe: "Test      |"
        // %-10s → linksbündig, Breite 10

        int c = 5;
        System.out.println(String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0"));
        // Ausgabe: "00000101"
        // → %8s reserviert 8 Stellen, rechtsbündig. replace() ersetzt Leerzeichen mit Nullen.

        // Parameterposition benutzen (argument_index)
        System.out.printf("%2$s liebt %1$s%n", "Kaffee", "Maria");
        // Ausgabe: Maria liebt Kaffee

        System.out.printf("%1$s %1$s %2$s!%n", "Hallo", "Welt");
        // Ausgabe: Hallo Hallo Welt!

        // Kommapräzision (Fließkommazahlen)
        double pi = Math.PI;
        System.out.printf("%.2f%n", pi);       // Ausgabe: 3.14
        System.out.printf("%10.3f%n", pi);     // Ausgabe: "     3.142"

        // Typabhängige Formatierung (conversion)
        int zahl = 255;
        System.out.printf("%d%n", zahl);       // Dezimal → 255
        System.out.printf("%x%n", zahl);       // Hexadezimal → ff
        System.out.printf("%08d%n", zahl);     // Mit führenden Nullen → 00000255

        // Unterschiedliche Typen
        System.out.printf("%f%n", 12.0);       // Fließkomma → 12.000000
        System.out.printf("%e%n", 12.0);       // Exponential → 1.200000e+01
        System.out.printf("%g%n", 12.0);       // Kompakt → 12.0000

        // Datum & Uhrzeit ohne DateTimeFormatter
        Date now = new Date();
        System.out.printf("%1$td.%1$tm.%1$tY%n", now); // 09.10.2025
        System.out.printf("%1$tH:%1$tM:%1$tS%n", now); // 15:44:30

        // Argumente mehrfach nutzen mit verschiedenen Konvertierungen
        System.out.printf("Heute ist %1$td.%1$tm.%1$tY und es ist %1$tH:%1$tM Uhr%n", now);
        // Ausgabe: Heute ist 09.10.2025 und es ist 15:44 Uhr

        // Typische Konvertierungen
        System.out.printf("%s%n", "Text");     // String
        System.out.printf("%d%n", 42);         // Ganzzahl
        System.out.printf("%f%n", 3.14);       // Fließkomma
        System.out.printf("%x%n", 255);        // Hexadezimal
        System.out.printf("%tY%n", now);       // Jahr
        System.out.printf("%tm%n", now);       // Monat
        System.out.printf("%td%n", now);       // Tag
        System.out.printf("%tH%n", now);       // Stunde
        System.out.printf("%tM%n", now);       // Minute
        System.out.printf("%tS%n", now);       // Sekunde

    }
}
