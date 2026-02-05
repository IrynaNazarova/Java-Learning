package step23.statische_innere_klasse;
// Statische innere Klassen haben in der Praxis keine grosse Bedeutung.
public class Main {
    public static void main(String[] args)
    {
        Aussen.StatischInnen inneresObjekt = new Aussen.StatischInnen();
        inneresObjekt.display();
    }
}

class Aussen
{
    static class StatischInnen
    {
        void display()
        {
            System.out.println("Ich bin eine statische innere Klasse.");
        }
    }
}
