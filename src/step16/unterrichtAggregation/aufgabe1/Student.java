package step16.unterrichtAggregation.aufgabe1;

public class Student {
    private String name;
    private int matrikelnummer;
    private Adresse adresse; // Aggregation

    public Student(String name, int matrikelnummer, Adresse adresse) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.adresse = adresse;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matrikelnummer: " + matrikelnummer);
        System.out.println("Adresse: " + adresse.getAdresseInfo());
    }
}
