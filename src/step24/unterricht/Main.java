package step24.unterricht;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args)
    {
    // Themen: Funktionale Interfaces und Lambda-Ausdrücke.
    // Wir haben bereits gelernt, wie wir anonyme Klassen implementieren.
    // Ein Problem bei der Verwendung von anonymen Klassen ist, wenn die Implementierung
    // sehr einfach gehalten ist, z.B. wenn ein Interface nur eine Methode hat, dann wirkt
    // die Syntax zur Verwendung anonymer Klassen umständlich und nicht klar.
    //
    // Durch Lambda Ausdrücke können wir Instanzen von Klassen mit nur einer Methode kompakter verwenden
    // als die umständliche Implementierung anonymer Klassen.
    //
    // Mit Java 8 wurden funktionale Interfaces und Lambda eingeführt.
    // Funktionale Interfaces werden durch Lambda-Ausdrücke instanziiert und wir vermeiden den Einsatz expliziter anonymer Klassen.
    //
    // Lambda Ausdrücke ähneln Methoden, sie haben Parameter, einen Körper und einen Rückgabewert. Man kann sie auch als anonyme Methoden bezeichnen.
    // Lambda Ausdrücke lehnen sich am Functional Programming an und bringen dieses Paradigma damit, zu gewissen Teilen,
    // in die OOP Welt von Java ein.
    //
    // Funktionale Interfaces:
    // Ein funktionales Interface ist ein Interface, welches nur eine abstrakte Methode bereitstellt. Dies bedeutet, dass ein
    // funktionales Interface nur 1 Verhalten repräsentiert. Ein funktionales Interface kann aber zusätzlich zur abstrakten Methode beliebig
    // viele default und statische Methoden bereitstellen. Ein funktionales Interface kann andere Interfaces erweitern, solange
    // diese keine abstrakten Methoden beinhalten.
        QuadratZahlBerechner rechner = new QuadratZahlBerechner();
        System.out.println(rechner.calculate(9));

        IOperation quadratzahlrechner = new IOperation()
        {
        @Override
        public int calculate(int zahl)
        {
            return zahl * zahl;
        }
        };

        System.out.println(rechner.calculate(7));

    // Diese bekannten Verfahren sind aber eventuell umständlich und beinhalten redundanten Code.
    // Mit Lambda-Ausdrücken können wir dasselbe erreichen, aber mit weniger Codezeilen.
    // https://de.wikipedia.org/wiki/Anonyme_Funktion
    // Erstes Beispiel für einen Lambda-Ausdruck:
        IOperation quadratZahlLambda = z -> z * z;
        int ergebnis = quadratZahlLambda.calculate(6);
        System.out.println("Ergebnis vom Lambdaausdruck: " + ergebnis);

    // Syntax:
    // Im Beispiel erwartet die Methode 'calculate' einen Integer-Übergabewert.
    // Die linke Seite des Lambda-Ausdrucks ist: 'zahl'
    // 'zahl' ist der Parameter der Funktion.
    // Die rechte Seite des Lambda-Ausdrucks, die hinter dem Pfeil '->' steht, ist: 'zahl * zahl'
    // Dies ist die tatsächliche Implementierung der abstrakten 'calculate'-Methode des funktionalen Interfaces.
    // Das Ergebnis von 'zahl * zahl' ist die Rückgabe der Methode.
    // Parameter und Rückgabe müssen der abstrakten Methode des Interfaces entsprechen.
    // Der Pfeil verbindet die Parameterliste mit dem Funktionskörper.
    // Syntax in kurz: (Parameterliste) -> { Funktionskörper }

    // Komplexe Lambda-Ausdrücke:
    // Lambda-Ausdrücke können beliebig viele Anweisungen im Methodenkörper haben. In diesen Fällen muss der Körper aber mit geschwungen Klammern angegeben werden.
    // Wenn kein Datentyp angegeben wurde, dann nimmt sich der Lambda-Ausdruck den Typ aus dem Kontext.
    // Wir können aber die Datentypen zur besseren Lesbarkeit trotzdem angeben.
        IOperation quadratZahlBerechner = (int zahl) ->
        {
            System.out.println("Uebergebener Wert: " + zahl);

            // Werden geschwungene Klammern für den Funktionskörper verwendet, müssen wir für die Rückgabe das return-Keyword angeben.
            return zahl * zahl;
        };

        int result = quadratZahlBerechner.calculate(5);
            System.out.println(result);

    // Lambda-Ausdruck ohne Parameter:
    // Hat die abstrakte Methode keine Parameter, müssen runde Klammern angegeben werden,
    // wenn wir die abstrakte Methode mittels Lambda realisieren wollen:
        IEtwasAusgebend halloWeltAusgebend = () -> System.out.println("Hallo Welt!");
            halloWeltAusgebend.ausgeben();

        // Lambda-Ausdrücke können beliebig viele Parameter haben:
        IBerechnend berechnend = (x, y) -> x - y;
        result = berechnend.berechne(12, 100);
            System.out.println(result);

    // Lambda-Ausdrücke können als Argumente an Methoden übergeben werden. Dies ist auch eine der Hauptzwecke von Lambda-Ausdrücken.
    // Lambda ermöglicht es uns also, Funktionalität an Methoden zu übergeben. Funktionalität wird wie Daten behandelt.
    // Dieses Verfahren wird z.B. häufig in der GUI Entwicklung eingesetzt.
    // Man spricht auch von Funktionsobjekte - also pure in Objekte gekapselte Funktionalitaet.

        result = Main.berechne(((x, y) -> x + y), 8, 6);
            System.out.println(result);

        ArrayList<String> tiere = new ArrayList<>();
            tiere.add("Krokodil");
            tiere.add("Nilpferd");
            tiere.add("Elefant");
            tiere.add("Tiger");

            for(String tier : tiere)
        {
            System.out.println(tier);
        }

            System.out.println("Ausgabe ueber forEach-Methode");

        // foreach-Methode mit Lambda:
            tiere.forEach(t -> System.out.println(t));

        // Sonderfall: Die 'println()'-Methode hat eine Signatur, die identisch mit dem 'Consumer'-Interface ist (void mit String-Parameter).
        // Darum können wir hier verkürzt eine Methodenreferenz anstelle der Lambda-Expression angeben.
        // Anstatt des .-Operators wird dann :: verwendet.
            tiere.forEach(System.out::println);

    // Die Methode im IBerechnend-Interface hat eine identische Signatur zur 'Integer.sum()'-Methode.
    // Zwei int-Parameter mit int-Return.
    // Darum kann auch hier eine Methodenreferenz verwendet werden.
        IBerechnend berechnend1 = Integer::sum;
        result = berechnend1.berechne(2,3);
            System.out.println(result);

    // Wichtige Functional Interfaces in Java:
    // Consumer Interface
    // Java stellt uns viele vordefinierte funktionale Interfaces bereit. Ein Beispiel dafür ist das 'Consumer<T>'-Interface, welches zwei Methoden bereitstellt. Erinnerung: Funktionale Interfaces dürfen nur eine abstrakte Methode haben, aber beliebig viele statische und default Methoden.
    // Um die Definition einzusehen mit IntelliJ: Rechtsklick auf Consumer -> Go To -> Declaration or Usages.
    // Alternativ mit der Maus über das Interface und im Popup Rechtsklick -> Jump to Source.

    // Beispiele zum Consumer: https://www.geeksforgeeks.org/java-8-consumer-interface-in-java-with-examples/

    // Die Methode 'accept()' des Interfaces ist die abstrakte Methode.
    // Sie konsumiert einen beliebigen Typen und gibt nichts zurück.
    // Die Methode 'andThen()' des Interfaces ist eine default-Methode. Sie wird auf ein existierendes Consumer-Objekt aufgerufen.
        Consumer<String> gibStringAus = System.out::println; // Wir können eine Lambda-Expression zuweisen, oder eine passende Methodenreferenz.

        gibStringAus = gibStringAus.andThen(s -> System.out.println(s.toUpperCase()));
        gibStringAus = gibStringAus.andThen(s -> System.out.println(s.toLowerCase()));

            gibStringAus.accept("Das ist ganz schoen kompliziert heute");

        // Predicate Interface (Einen Parameter, gibt immer Boolean zurück)
        Predicate<Integer> groesserAls10 = x -> x > 10;
        boolean istGroesser10 = groesserAls10.test(9);
            System.out.println(istGroesser10);

    }

// Lambda-Ausdrücke können als Argumente an Methoden übergeben werden:
// (Funktionalität wird wie Daten behandelt)
    public static int berechne(IBerechnend lambda, int ersteZahl, int zweiteZahl)
    {
        return lambda.berechne(ersteZahl, zweiteZahl);
    }
}
