package step5;

/* Level 1
Schreiben Sie eine Methode, die vom Benutzer eine Zahl abfragt und die eingegebene Zahl als Integer zurückgibt.
Wenn der Benutzer etwas eingibt, was keine ganze Zahl ist, soll eine Fehlermeldung erscheinen und die Abfrage wird wiederholt.
Geben Sie zum Testen die eingegebene Zahl in der Konsole aus.
Rückgabewert: Die eingegebene Zahl
*/


import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {

        int eineZahl = eingabe();
        System.out.println("Eingegeben: " + eineZahl);
    }

    public static int eingabe() {
        Scanner sc = new Scanner(System.in);

        while (true) // Endlosschleife
        {
            System.out.print("Bitte eine Zahl eingeben: ");
            String zahlText = sc.nextLine();

            try {
                // Versuche den Integer Wert zu erhalten
                int zahl = Integer.parseInt(zahlText);
                // Konnte der Wert geparst werden, kann er zurückgegeben werden.
                return zahl; // Die Methode (und damit auch die Endlosschleife) wird mit return beendet.
            } catch (NumberFormatException e) {
                System.out.println("Ihre Eingabe war nicht korrekt");
                // ein weiterer Durchgang der Schleife
            }
        }
    }
}
