package step2;
/* Level 2
 * Erweitern Sie die Aufgabe 3 mit der Angabe einer Integer-Variable "jahr" um ein bestimmtes Jahr einzuführen.
 * Danach führen sie eine Kontrollmethode istSchaltjahr ein, die das Jahr kontrolliert, ob es ein Schaltjahr ist.
 * Wenn ja soll anstatt 28 im Februar 29 Tage ausgegeben werden.
 * Die neue Konsolenausgabe soll dann lauten: "Der "+monat+" hat im Jahr "+jahr"+" : "+tage+" Tage.
 */

public class Aufgabe4 {
    static int istSchaltjahr(int jahr)
    {
        boolean schaltjahr = false;

        if (jahr % 400 == 0)
        {
            schaltjahr = true;
        }
        else if (jahr % 100 == 0)
        {
            schaltjahr = false;
        }
        else if (jahr % 4 == 0)
        {
            schaltjahr = true;
        }
        else
        {
            schaltjahr = false;
        }


        if (schaltjahr == true)
        {
            return 29;
        }
        else
        {
            return 28;
        }

    }


    public static void main(String[] args)
    {

        int jahr = 2016;
        String monat = "Februar";

        int tage = 0;

        switch (monat)
        {
            case "Januar":
            case "März":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":
                tage = 31;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                tage = 30;
                break;
            case "Februar":
                tage = istSchaltjahr(jahr);
                break;
            default:
                System.out.println("Ungültiger Monatsname");
                tage = 0;
                break;
        }

        if (tage != 0)
        {
            System.out.println("Der " + monat + " hat im Jahr " + jahr + " : " + tage + " Tage.");
        }

    }
}
