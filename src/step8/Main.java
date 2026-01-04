package step8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Date:");
        LocalDate date = LocalDate.now();
        System.out.println(date); // Implizite String Konvertierung
        DateTimeFormatter formatSettings = DateTimeFormatter.ofPattern("dd. MM. yyyy"); // Helfer Objekt
        System.out.println(date.format(formatSettings)); // Explizite String Konvertierung
    }
}
