package step2;

/* Level 1
 * Schreiben Sie ein Programm, das Ihnen ausgibt, ob das über die Integer-Variable jahr eingeführte Jahr ein Schaltjahr ist.
 * Durch 4 ohne Rest teilbare Jahre sind normalerweise Schaltjahre.
 * Durch 100 ohne Rest teilbare Jahre sind keine Schaltjahre
 * Durch 400 ohne Rest teilbare Jahre sind doch Schaltjahre
 * Nutzen Sie zu Umsetzung die Boolesche Variable schaltjahr und lassen Sie sich das Jahr sowie ob es ein Schaltjahr ist oder nicht
 * auf der Konsole ausgeben.
 */

public class Aufgabe2 {
    public static void main(String[] args) {

        int jahr = 2004;
        boolean schaltjahr = false;

        if(jahr % 400 == 0)
        {
            schaltjahr = true;
        }
        else if(jahr % 100 == 0)
        {
            schaltjahr = false;
        }
        else if(jahr % 4 == 0)
        {
            schaltjahr = true;
        }
        else
        {
            schaltjahr = false;
        }


        if(schaltjahr == true)
        {
            System.out.println(jahr + " ist ein Schaltjahr");
        }
        else
        {
            System.out.println(jahr + " ist kein Schaltjahr");
        }
    }

    public static void alternative(){
        // Verkettung von Ternaries (/4 und (!/100 oder /400))
        int jahr = 2024;
        String ausgabe = jahr%400 == 0 ? "Schaltjahr weil durch 400" : (jahr%100 == 0 ? "kein Schaltjahr weil durch 100" : (jahr%4 == 0 ? "Schaltjahr weil durch 4" : "kein Schaltjahr weil nicht durch 4"));
        System.out.println(ausgabe);
    }


}
