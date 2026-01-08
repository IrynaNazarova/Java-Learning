package step13;

public class Ternaries {

    public static void main(String[] args) {
        // Ternary
        // bedingung ? rückgabewert1 : rückgabewert2
        // Rückgabewert 1 und 2 müssen übereinstimmen
        // Das ganze ist dann ein Wert, der den 1. Wert entspricht, wenn die bedingung wahr ist (ansonsten 2. Wert)

        int tagDerWoche = 1;
        String istHeuteMontag = tagDerWoche == 1 ? "Ja, heute ist Montag" : "Nein, heute ist nicht Montag";
        // ... ist dasselbe wie ...
        if (tagDerWoche == 1)
            istHeuteMontag = "Ja, heute ist Montag";
        else
            istHeuteMontag = "Nein, heute ist nicht Montag";

        System.out.println(1 == 1 ? "Ist gleich" : "Ist nicht gleich");
        System.out.println(1 == 2 ? "Ist gleich" : "Ist nicht gleich");

        int zahl = 1;
        boolean bool = zahl == 1 ? true : false;

        boolean x;

        x = (1 == 1 ? 4 >= 4 ? true : false : false); // Auch hier können Klammern gesetzt oder weggelassen werden, wenn wir Ternaries miteinander verschachteln.
        // .. ist dasselbe wie ...
        x = (1 == 1 ? (4 >= 4 ? true : false) : false);
        // ... ist dasselbe wie ...
        if (1 == 1) {
            if (4 >= 4)
                x = true;
            else
                x = false;
        }
        else {
            x = false;
        }
    }
}
