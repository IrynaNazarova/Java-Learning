package step18;

public class Main {

    public static void main(String[] args)
    {
        // Krokodil krok = new Krokodil("grün", 2);
        // Versuch ein Objekt von Krokodil zu erzeugen: Fehler, da kein Objekt einer abstrakten Klasse erzeugt werden kann

        // Abgeleitete Klassen:
        System.out.println("******************** NILKROKODIL *************************************");
        Nilkrokodil nilkrokodil = new Nilkrokodil("Oberseits dunkel-olivfarben, der Bauch ist einheitlich porzellanfarben.", 2);
        nilkrokodil.imGrasLiegen(); //Methode in der Kindklasse Nilkrokodil
        System.out.println("Das Alter ist: " + nilkrokodil.getAlter()); // getAlter liegt in der Abstrakten Klasse Krokodil
        nilkrokodil.zeigeInfoZumLebensraum(); //Methode wurde im Nilkrokodil überschrieben und mit einem Funktionskörper versehen
        // dies war eine abstrakte Methode und abstrakte Methoden müssen in Kindklassen überschrieben werden
        System.out.println("Die Farbe ist: " + nilkrokodil.getFarbe());// getFarbe liegt in der Abstrakten Klasse Krokodil
        nilkrokodil.schwimmen();

        System.out.println("******************** LEISTENKROKODIL *************************************");
        Leistenkrokodil leistenkrokodil = new Leistenkrokodil("Graubraun", 4);
        System.out.println("Farbe: " + leistenkrokodil.getFarbe());  //die Gettermethode liegt in der abstrakten Klasse Krokodil
        leistenkrokodil.zeigeInfoZumLebensraum(); //überschriebene abstrakte Methode
        leistenkrokodil.schwimmen(); // geerbte Methode, die nicht überschrieben wurde
        leistenkrokodil.imSchlammLiegen(); // eigene Methode aus der Kindklasse Leistenkrokodil
        System.out.println("Alter: " + leistenkrokodil.getAlter()); //die Gettermethode liegt in der abstrakten Klasse Krokodil

        System.out.println("******************** Vorteil Vererbung *************************************");
        // Vorteil 1: Es kann eine Variable für unterschiedliche Objekte verwendet werden.
        Krokodil krokodil = new Nilkrokodil("Olivfarben",3);
        krokodil.zeigeInfoZumLebensraum();
        krokodil = new Leistenkrokodil("Dunkel-Grau",5);
        krokodil.zeigeInfoZumLebensraum();

        // Vorteil 2: Alle Methoden und Attribute aus der Mutterklasse werden geerbt, müssen nur einmal programmiert werden und sind somit leichter wartbar und weniger fehleranfällig

        // Vorteil 3: Alle Objekte die von den Kinderklassen erzeugt werden, können in einer Liste automatisch gespeichert werden. Statische Liste muss in Mutterklasse liegen.
        System.out.println("******************** Ausgabe aller Elemente der Krokodil-Liste *************************************");
        for(Krokodil k : Krokodil.krokodilArrayList)
        {
            // Dieser Text soll ausgegeben werden: "Ich bin ein ...krokodil und habe die Farbe ... außerdem bin ich ... Jahre alt."
            System.out.println("Ich bin ein " + k.getClass().getSimpleName() + " und habe die Farbe " + k.getFarbe() + " außerdem bin ich " + k.getAlter() + " Jahre alt." );
            // ich möchte von jedem Krokodil noch die Info zum Lebensraum ausgeben lassen
            k.zeigeInfoZumLebensraum(); // Je nachdem welches Krokodil es ist wird eine andere Ausgabe erscheinen, da jede Klasse die Methode überschrieben hat.

            // Bei Leistenkrokodil soll imSchlammLiegen ausgegeben werden
            if(k instanceof Leistenkrokodil)
            {
                ((Leistenkrokodil) k).imSchlammLiegen(); //Es fand ein Cast von Krokodil zu Leistenkrokodil statt, da die Methode in der Kindklasse liegt
            }

            // Beim Nilkrokodil soll noch die Methode imGrasLiegen ausgegeben werden
            else if(k instanceof Nilkrokodil)
            {
                ((Nilkrokodil) k).imGrasLiegen(); //Es fand ein Cast von Krokodil zu Nilkrokodil statt, da die Methode in der Kindklasse liegt
            }

        }






    }


}
