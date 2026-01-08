package step12.unterricht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> meineLieblingslieder = new ArrayList<>();
        Collections.addAll(meineLieblingslieder, "Alle Jahre wieder", "Alle Jahre schon wieder");
        for (String lied : meineLieblingslieder) {
            System.out.println(lied);
            // meineLieblingslieder.add(lied); // Exception -> die Manipulation der Liste in For-Each ist so nicht erlaubt,
            // diese Exception kommt vom Iterator
        }

        // Ein Hilfsobjekt, welches den Zustand unserer aktuellen Iterations-Position speichert.
        Iterator<String> iterator = meineLieblingslieder.iterator();
        System.out.println(iterator.next());
        meineLieblingslieder.add("Bla blubb");
        System.out.println(meineLieblingslieder); // Bis hier funktioniert alles. Das Anhängen war also nicht das Problem, sondern dass der Iterator in nächsten Schritt erkennt, dass die Liste manipuliert wurde.
        System.out.println(iterator.next());
    }
}
