package step16.unterrichtAggregation.aufgabe1;

public class Main {
    public static void main(String[] args)
    {
        Adresse adr = new Adresse("Musterstraße 1", "Berlin", "10115");
        Student student = new Student("Max Mustermann", 123456, adr);
        student.printInfo();
    }
}
