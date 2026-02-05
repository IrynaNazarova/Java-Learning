package step23.anonyme_innere_klasse;

public class Main {
    // Mithilfe von anonymen innere Klassen können wir Implementierungen schaffen, die wir nur
    // einmalig, sozusagen im Vorbeigehen, lokal verwenden wollen.
    // Wenn auf die schnelle eine kleine Klasse gebraucht wird, um kleine Codebestandteile zwischen Programmmodulen auszutauschen,
    // dann bekommen anonyme innere Klassen ihren Sinn.
    // Wir verwenden anonyme innere Klassen dann, wenn eine lokale Klasse nur einmalig verwenden werden soll.
    // Namenlose, anonyme Klassen werden gleichzeitig lokal deklariert und instanziiert.
    // Der Vorteil anonymer Klassen besteht in ihrer Flexibilität.
    // Anonyme Klassen können auf lokale Variablen und Klassenmember ihrer unmittelbaren Umgebung zugreifen und diese weitergeben.
    // Werden Klassen umfangreicher und werden diese an verschiedenen Stellen im Code gebraucht, sollte auf anonyme Klassen verzichtet
    // und stattdessen eine benannte Klasse definiert und verwendet werden.
    // Der häufigste Einsatz anonymer Klassen sind Listener für GUIs.

    // Wir können mit zwei Verfahren anonyme Klassen erstellen.
    // 1) Wir erweitern bestehende Klassen.
    // 2) Wir erstellen uns eine anonyme Klasse, die ein Interface (ohne extends Keyword) implementiert.

    // Anonyme Klassen bestehen aus diesen Elementen:
    // -> Den new Operator.
    // -> Den Namen des Interfaces welches implementiert werden soll oder den Namen der Klasse die erweitert werden soll.
    // -> Runde Klammern welche die Argumente für den Konstruktor beinhalten, wie bei normaler Klassenerstellung. Oder leere Klammern für Interfaces.
    // -> Geschwungene Klammern für den Körper der anonymen Klasse, in der wir die Logik implementieren, indem wir die Methoden der erweiterten Klasse / Interface überschreiben.
    // -> Abschließend setzen wir hinter die schließende Klammer ein Semikolon.
    public static void main(String[] args)
    {
        // Bekannt: Instanziierung der Klasse Katze und Aufruf ihrer Methode:
        Katze meineKatze = new Katze();
        meineKatze.sageMiau();

        // 1. Wir erweitern eine bestehende nicht-abstrakte Klasse:
        // Durch Hinzufügen von geschwungenen Klammern nach dem Konstruktoraufruf erstellen wir eine neue anonyme Klasse.
        // z.B. new Katze() { };
        // Wir erweitern damit die Klasse und können die 'macheMiau()'-Methode überschreiben.
        // Hier ist 'englischeKatze' die Referenz auf die Instanz der anonymen Klasse.
        Katze englischeKatze = new Katze()
        {
            @Override
            public void sageMiau()
            {
                System.out.println("Meow!");
            }
        };

        Katze arabischeKatze = new Katze()
        {
            @Override
            public void sageMiau()
            {
                System.out.println("Miawah!");
            }
        };

        englischeKatze.sageMiau();
        arabischeKatze.sageMiau();


        System.out.println("Der Name der benannten expliziten Klasse lautet: " + meineKatze.getClass().getSimpleName());
        System.out.println("Der Name der anonymen inneren Klasse lautet: " + englischeKatze.getClass().getSimpleName());

        Katze winfriedsKatze = getWinfriedsKatze();
        winfriedsKatze.sageMiau();

        // Komplexeres Beispiel mit eigenem Konstruktor und mehreren Methoden:
        // Wir erweitern die bestehende Klasse als anonyme Klasse.
        Tiger tiger = new Tiger("gelb, braun, orange mit schwarzen Streifen")
        {
            @Override
            public void fressen()
            {
                super.fressen();
                System.out.println("Das war lecker!");
                this.bruellen();
            }

            @Override
            public void sageFellfarbe()
            {
                System.out.println("Ich bin ein huebscher Tiger. Meine Farbe ist " + this.getFellfarbe());
            }

            // Wir können diese anonyme Klasse durch beliebige weitere Member ergänzen:
            // ACHTUNG: Der Datentyp 'Tiger' kennt diese Methode nicht! Da wir nicht casten können (denn der Typ der Subklasse ist unbekannt), können wir diese Methode nachträglich nicht über Referenz-Variablen aufrufen.
            public void bruellen()
            {
                System.out.println("ROARRRR!11");
            }
        };

        // Dynamische Polymorphie: Zur Laufzeit wird die ueberschriebene Methoden gefunden und ausgefuehrt.
        tiger.fressen();
        tiger.sageFellfarbe();
        // tiger.bruellen(); // Der Datentyp 'Tiger' kennt die Methode nicht!

        // 2. Wir erweitern eine abstrakte Klasse:
        //Lebewesen löwe = new Lebewesen(); // Wir können abstrakte Klassen und Interfaces nicht direkt instanziieren.
        // Um Objekte davon erzeugen zu können, benötigen wir eine nicht-abstrakte Klasse, welche die abstrakte Klasse erweitert.
        // Das lässt sich als anonyme Klasse umsetzen:
        Lebewesen loewe = new Lebewesen()
        {
            @Override
            public void macheGeraeusch()
            {
                System.out.println("Laute Bruellgeraeusche! ROARRR!");
            }
        };

        loewe.macheGeraeusch();

        // 3. Wir implementieren ein Interface in eine anonyme innere Klasse:
        // IFahrbar pkw = new IFahrbar();
        IFahrbar pkw = new IFahrbar()
        {
            @Override
            public void fahren()
            {
                System.out.println("Brumm, brumm");
            }
        };

        pkw.fahren();
    }

    // Objekte von anonymen Klassen koennen zurueckgegeben werden, der Rueckgabetyp ist natuerlich die Elternklasse:
    public static Katze getWinfriedsKatze()
    {
        Katze winfriedsAnonymeKatze = new Katze()
        {
            @Override
            public void sageMiau()
            {
                System.out.println("Ich bin Winfrieds Katze - Miauauaua");
            }
        };

        return winfriedsAnonymeKatze;
    }
}
