package step19;

/*
    Allgemeine Informationen zu Interfaces in Java:
    Interfaces sind Referenztypen. Interfaces sind eine Sammlung von abstrakten Methoden.
    Es sind aber auch Konstanten, default Methoden, verschachtelte Typen und statische Methoden im Körper eines Interfaces erlaubt.
    Methodenkörper sind in Interfaces erlaubt für default und statische Methoden.

    Ein Interface ist ein Vertrag darüber, welche Methoden eine implementierende Klasse bereitstellen muss.
    Java unterstützt keine Mehrfachvererbung, darum wurde durch Interfaces ein Mittelweg ermöglicht:
    Es kann nur von einer Klasse geerbt werden, aber mehrere Interfaces können implementiert werden.
 */

// Konvention in Java für Interfaces: UpperCamelCase für Interface-Bezeichner.
// Bezeichner sollen in der Regel ein Adjektiv sein oder wie Klassen bezeichnet werden.


public interface Druckbar
{

    //________________________________________________________________
    // KONSTRUKTOR - NICHT ERLAUBT
    // _______________________________________________________________
    //public Druckbar() {} // Konstruktoren sind in einem Interface nicht erlaubt
    // denn von einem Interface darf es keine Objekte geben
    // es findet auch keine Konstruktor-Verkettung statt

    //________________________________________________________________
    // ATTRIBUTE - NUR public static final-Attribute erlaubt
    // _______________________________________________________________

    // private int feld; // Fehlermeldung: Nicht-statische private Felder sind im Interface unzulässig

    /*
    static = bedeutet Klassenattribut
    final = Konstante dh. nicht änderbar
    im Interface sind nur public static final - Attribute erlaubt
    Diese sind immer implizit (automatisch) public static final
    */
    public static final String DINA4 = "297 mm x 210 mm";

    //________________________________________________________________
    // METHODEN - NUR abstrakte Methoden, statische Methoden oder default-Methoden erlaubt
    // _______________________________________________________________

    // Methodendeklaration in einem Interface sind implizit public und abstract
    public abstract void drucken();


    // Statische Methoden sind möglich, müssen aber vollständig implementiert sein.
    // Der Aufruf geschieht dann über den Interfacenamen
    public static void testDruck()
    {
        System.out.println("Druckgeräusche... es wird ein Testblatt gedruckt.");
    }

    // Nicht-statische default-Methode haben bereits eine Implementierung und werden an
    // Klassen vererbt. Sie dürfen in der Klasse aber auch überschrieben werden.
    public default boolean prüfeFormat(String format)
    {
        if(format.equalsIgnoreCase(DINA4))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
