package step1;

public class Aufgabe3 {
    /* Level 2
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable "breite" einführt (deren Wert sie selbst bestimmen können)
b) eine String-Variable "s" einführt (deren Wert sie selbst bestimmen können)
c) eine Char-Variable "c" einführt (deren Wert sie selbst bestimmen können)
d) einen String "zeile" einführt, der durch eine for-Schleife wie folgt initialisiert werden soll:
	- die Schleife soll "breite"-mal durchlaufen werden
	- bei jedem Durchlauf soll "zeile" um s und c verlängert werden
e) eine for-Schleife startet, die 3-mal durchlaufen wird und pro Durchlauf die Zeile (mit Umbruch) ausgibt


Beispiel
breite: 5, s: *, c: -, dann ergibt sich die folgende Ausgabe:
*-*-*-*-*-
*-*-*-*-*-
*-*-*-*-*-
*/
    public static void main(String[] args) {

        int breite = 5;
        String s = "*";
        char c = '-';
        String zeile = "";

        for(int i = 0 ; i < breite; i++)
            zeile += s+c;

        for(int i = 0; i < 3; i++)
            System.out.println(zeile);
    }

}
