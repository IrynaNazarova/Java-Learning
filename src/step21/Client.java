package step21;

public class Client {

    public static void main(String[] args)
    {
        ClientInterface einkauf;
        einkauf = new AdapterEuroDollar(new AmerikanischerOnlineShop());

        Euro euro = new Euro();
        euro.betrag = 100;
        System.out.println("Du hast vor deinem Kauf " + euro.betrag + " auf dem Konto.");

        Euro restgeld = einkauf.tätigeKauf(euro);

        System.out.printf("Du hast noch %.2f auf dem Konto.", restgeld.betrag);


    }
}
