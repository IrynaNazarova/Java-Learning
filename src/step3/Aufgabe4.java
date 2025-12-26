package step3;
/* Level 3
    Lesen Sie sich handout.DateAndTimeFormatting (die Klasse im handout Paket) durch,
    und versuchen Sie nachzuvollziehen, was dort passiert.

    Führen Sie bitte zunächst die folgende Methode ein:
    Methodenname: tryStringToDate
    Übergabewerte: String s
    Funktion: - Versucht s in LocalDate zu konvertieren
              - Fängt bei DateTimeParseException die Fehlermeldung ab

    Rückgabewert: das LocalDate Objekt, FALLS Konvertierung klappte, sonst null

    Testen Sie diese Funktion.

    Hinweis: "LocalDate" ist ein Datentyp wie Integer oder String und kann als solches auch für Variablen verwendet werden. Und wie bei Integer gibt es für LocalDate auch Funktionen, die aufgerufen werden können.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Aufgabe4 {
    public static void main(String[] args) {
        String datumText = "12.03.1999";
        LocalDate datum = tryStringToDate(datumText);

        if (datum != null)
            System.out.println("Konvertierung klappte");
        else
            System.out.print("Konvertierung klappte nicht");
    }

    static LocalDate tryStringToDate(String s) {
        try {
            DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(s, fm);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}
