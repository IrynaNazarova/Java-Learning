package step19.aufgaben.aufgabe2;

import java.util.Collections;

public class Adresseverwaltung {
    public static void printEtikett(HatAdresse obj)
    {
        System.out.println(String.join("", Collections.nCopies(30, "*")));

        //char[] c = new char[30];
        //Arrays.fill(c, '*');
        //System.out.println("\n" + new String(c));
        System.out.println(obj.getName());
        System.out.println(obj.getAdresse());
        //System.out.println(new String(c));

        System.out.println(String.join("", Collections.nCopies(30, "*")));
    }

    public static void erfasse(HatAdresse obj, String name, String straße, int hausnr, String plz, String ort)
    {
        obj.setName(name);
        obj.setAdresse(new Adresse(straße, hausnr, plz, ort));
    }
}
