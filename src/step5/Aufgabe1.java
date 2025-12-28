package step5;

import java.util.Scanner;

public class Aufgabe1 {
    /* Level 1
Schreiben Sie bitte ein Java-Programm, das
a) einen Integer-Wert so lange abfragt, bis er mindestens die Größe 10 hat
b) bei jeder zu kleinen Eingabe eine Fehlermeldung ausgibt
c) bei einer Eingabe von mindestens 10 mit einer Erfolgsmeldung das Programm beendet
*/
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int eingabe;
            while (true) {
                // Eingabe
                System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
                eingabe = Integer.parseInt(sc.nextLine());

                // Überprüfung und Entscheidung
                if (eingabe >= 10)
                    break; // kein Durchgang mehr
                else
                    System.out.println("Eingabe leider zu klein!"); // noch einen Durchgang
            }

            System.out.println("Eingabe groß genug");

    }

}

