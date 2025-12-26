package step3;
/*
    Deklarieren Sie eine String Variable und initialisieren Sie diese.
    Danach setzen Sie die variable '= null;'.

    Versuchen Sie nun die lower-case Version des Strings auszulesen.
    Fangen Sie die Exception ab und geben Sie ihrem Vergangenheits-Ich eine passende Fehlermeldung aus.
*/

public class Aufgabe3 {
    public static void main(String[] args) {
        String meinText = "hallo";
        meinText = null;

        try {
            String inKleinbuchstaben = meinText.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("meinText ist null. Auf null kann man toLowerCase nicht aufrufen!");
        }
    }
}
