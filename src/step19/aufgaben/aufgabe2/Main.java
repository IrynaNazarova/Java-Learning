package step19.aufgaben.aufgabe2;

/* Level 3
 *  - Erstellen Sie eine Klasse "Adresse" mit Straße, Hausnummer, PLZ und Ort
 *  - Erstellen Sie ein Interface "HatAdresse" mit den Getter- und Setter-Methoden für Name und Adresse (Adresse ist vom Typ Adresse)
 *      und der Methode printEtikett()
 *  - Erstellen Sie die Klasse Adressverwaltung mit den Static Methoden printEtikett(HatAdresse obj)
 *      und Erfasse(HatAdresse obj, String name, String straße, int hausnr, String plz, String ort)
 *      (Die Klasse Adressverwaltung wird das Interface nicht implementieren, aber wir werden die Klasse verwenden,
 *      um Adressen auszugeben und zu erfassen)
 *  - Die Methode printEtikett soll alle Informationen von HatAdresse ausgeben (also Name und die Werte in Adresse)
 *  - Die Methode "erfasse" soll dem übergebenen HatAdresse-Objekt die neuen Werte zuweisen
 *  - Erstellen Sie eine Klasse Person, die nun das Interface HatAdresse implementiert und über den Konstruktor
 *      public Person(String name, String straße, int hausnr, String plz, String ort) verfügt
 *      Im Konstruktor sollen die Adress-Werte über die Adressverwaltung erfasst werden
 *  - In der Implementierung der printEtikett-Methode des Interfaces soll die printEtikett-Methode der Adressverwaltung
 *      aufgerufen werden
 *  - Testen Sie die Funktionalitäten in der Main-Methode, indem Sie dort eine Liste oder ein Array mit mehreren Personen anlegen und für jede
 *      Person die Etikett-Methode aufrufen.
 *  - Erweitern Sie das Programm durch Erstellen einer Klasse Firma, die ebenfalls HatAdresse implementiert.
 *  - Fügen Sie zu Ihrer Liste im Main nun zusätzlich Objekte der Klasse Firma hinzu. Bewerkstelligen Sie dies ohne
 *      Generalisierung der Klassen.
 */


public class Main {

    public static void main(String[] args)
    {
        HatAdresse[] adressen =
                {
                        new Person("Klaus Müller", "Dorfstr.", 8, "12345", "Irgendwo"),
                        new Person("Jaleh Afshar", "Stadtstr.", 24, "01234", "Sonstwo"),
                        new Firma("Stahlbau GmbH", "Industriestr.", 2, "12345", "Irgendwo")
                };

        for (HatAdresse hatAdresse : adressen)
            hatAdresse.printEtikett();
    }
}
