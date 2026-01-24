package step21;





public class AdapterEuroDollar implements ClientInterface{

    // Zugriff zum Amerikanischen Online Shop
    private AmerikanischerOnlineShop shop;

    //Konstruktor
    public AdapterEuroDollar(AmerikanischerOnlineShop shop)
    {
        this.shop = shop;
    }

    // Methode 1: Euro in Dollar
    private Dollar wechsleEuroInDollar(Euro e)
    {
        Dollar dollar = new Dollar();
        dollar.betrag = e.betrag * 1.16;
        return dollar;
    }

    // Methode 2: Dollar in Euro
    private Euro wechsleDollarInEuro(Dollar d)
    {
        Euro euro = new Euro();
        euro.betrag = d.betrag * 0.84;
        return euro;
    }


    // Methode 3: Service nutzen, in diesem Fall shopping
    @Override
    public Euro tätigeKauf(Euro e)
    {
        //1. Euro in Dollar wechseln
        Dollar zwischensumme = wechsleEuroInDollar(e);

        //2. shopping im AmerikanischenShop
        // Rückgeld in Dollar
        Dollar rückgeld = shop.shopping(zwischensumme);

        //3. Rückgeld wieder in Euro zurück wechseln
        Euro gewechseltesRückgeld = wechsleDollarInEuro(rückgeld);

        return gewechseltesRückgeld;
    }
    // Methode 2: Dollar in Euro

}
