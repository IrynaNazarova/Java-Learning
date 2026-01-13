package step16.unterrichtAggregation.aufgabe2;

public class Main {
    public static void main(String[] args)
    {
        Motor motor = new Motor("Benziner", 150);
        Auto auto = new Auto("Volkswagen", "Golf", motor);
        auto.zeigeInfo();
    }
}
