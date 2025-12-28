package step5;

/* Level 2
 * Schreiben Sie ein Programm, das
 * eine Zufallszahl von 1 bis inklusive 99 auswürfelt
 * und den Benutzer in einer Schleife über eine Eingabe die Zahl erraten lässt.
 * Dabei wird die eingegebene Zahl in einen Integer geparst. Bei falscher Eingabe soll wiederholt werden.
 * Das Programm teilt nun dem Benutzer mit, ob die Schätzung kleiner oder größer als die gewürfelte Zahl war.
 * Die Schleife endet, wenn die gewürfelte Zahl getroffen wurde.
 * Dem Benutzer wird die Anzahl der Versuche ausgegeben
 */

import java.util.Random;
import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        Random random = new Random();

        int zahl = random.nextInt(99) + 1;
        int raten = 0;
        int versuche = 0;

        System.out.println("Ich habe gewürfelt (1 bis 99)! Rate meine Zahl!");

        Scanner scanner = new Scanner(System.in);

        do {
            boolean parseOk = false;
            do {
                try {
                    System.out.print("Deine Wahl: ");
                    raten = Integer.parseInt(scanner.nextLine());
                    parseOk = true;
                } catch (Exception e) {
                    System.out.println("Fehler!");
                }
            } while (!parseOk);

            if (raten > zahl)
                System.out.println("Deine Wahl ist zu groß!");
            else if (raten < zahl)
                System.out.println("Deine Wahl ist zu klein!");

            versuche++;
        } while (raten != zahl);

        String versuchsAusgabe = versuche + " Versuchen";
        if (versuche == 1) versuchsAusgabe = "einem Versuch"; // Alternative: Siehe Ternary (Zusatzinhalt)
        System.out.println("Du hast es nach " + versuchsAusgabe + " geschafft! Gratulation!");
    }
}
