package step21;

public class AmerikanischerOnlineShop {
    public Dollar shopping(Dollar d)
    {
        System.out.println("Thank you for shopping :)");
        d.betrag = d.betrag - 10;
        return d;
    }
}
