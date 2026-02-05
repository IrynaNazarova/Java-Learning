package step23.lokale_innere_klasse;

public class Main {
    public static void main(String[] args)
    {
        Outer aussen = new Outer();
        aussen.method();
    }
}

class Outer
{
    void method()
    {
        // Lokale innere Klasse, die sich lokal in einer Methode der auesseren Klasse befindet.
        class LocalInner
        {
            void display()
            {
                System.out.println("Ich befinde mich in einer lokalen inneren Klasse.");
            }
        }

        LocalInner lokaleInnereKlasse = new LocalInner();
        lokaleInnereKlasse.display();
    }
}
