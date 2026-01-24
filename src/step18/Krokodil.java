package step18;


// Abstrakte Klassen werden häufig als Generalisierungs-Klasse betrachtet,
// die in der Regel dazu da sind, Subklassen in einer gemeinsamen Superklasse zusammenzufassen.
// Von abstrakten Klassen können keine Instanzen/Objekte gebildet werden.
// Eine Klasse MUSS abstrakt sein, wenn sie mindestens eine abstrakte Methode hat.

import java.util.ArrayList;

public abstract class Krokodil {

    // Diese Klassen können dann, zum Beispiel, zur Bildung von Listen verwendet werden, in die dann Subklassen-
    // Objekte zur Iteration gespeichert werden können.
    public static ArrayList<Krokodil> krokodilArrayList = new ArrayList<>();

    private String farbe;
    private int alter;

    public int getAlter()
    {
        return alter;
    }

    public String getFarbe()
    {
        return farbe;
    }

    // Abstrakte Klassen haben normalerweise einen 'protected' Konstruktor
    // Da von abstrakten Klassen keine Objekte erzeugt werden können, wird dies über 'protected' Konstruktoren verdeutlicht.
    protected Krokodil(String farbe, int alter)
    {
        this.alter = alter;
        this.farbe = farbe;
        krokodilArrayList.add(this);
    }

    // nicht-abstrakte Methode
    public void schwimmen()
    {
        System.out.println("Ich schwimme im Wasser.");
    }

    // abstrakte Methode
    // Diese Methode gibt Informationen zum Lebensraum des Krokodils auf der Konsole aus.
    // Abstrakte Methoden haben keinen Funktionskörper und MÜSSEN in den Kindklassen überschrieben werden um
    // der Methode eine Funktionalität zu geben
    public abstract void zeigeInfoZumLebensraum();

    // private abstract void methode(); //Fehler: private abstrakte Methoden sind nicht erlaubt,
    // weil Kind hat keinen Zugriff, nichtmal um die Methode zu überschreiben
}
