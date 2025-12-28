package step5;

import java.util.Random;

public class WeitereHelfer {
    public static void main(String[] args) {
        // Wrapper-Klasse (Helfer-Klasse) vom String ist der Typ selbst
        String einfachEinZeilenumbruch = String.format("%n");

        // Andere nützliche Helfer aus der Java Welt

        // Zufallszahlen (Pseudo-Random -> keine ganz echte Zufälligkeit, aber für den Nutzer nicht von echter Zufälligkeit zu unterscheiden)
        Random randomisierer = new Random(); // Helfer-Objekt (wieder ein eigener Zustand)
        System.out.println(randomisierer.nextInt(5)); // Fähigkeit die nächste zufällige Zahl zu bekommen (mit Obergrenze 5)

        Random r1 = new Random(10); // deterministisch (vorhersehbar) durch den Seed
        System.out.println(r1.nextInt());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextInt());
        Random r2 = new Random(10);
        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt());

        // Math
        System.out.println(Math.random()); // Globaler Zugriff über eine andere API (intern verwendet Math aber auch Random())
        System.out.println(Math.abs(-10)); // Betrag (absuolute value) minus wird plus, und plus bleibt plus
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10) == Math.abs(10));

        System.out.println(Math.sin(100)); // Sinus
        System.out.println(Math.sqrt(4)); // Wurzel
    }
}
