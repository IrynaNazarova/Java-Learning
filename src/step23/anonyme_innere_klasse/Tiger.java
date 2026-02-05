package step23.anonyme_innere_klasse;

public class Tiger extends Katze {
    private String fellfarbe;

    public Tiger(String fellfarbe)
    {
        this.fellfarbe = fellfarbe;
    }

    public String getFellfarbe()
    {
        return this.fellfarbe;
    }

    public void fressen()
    {
        System.out.println("Omnomnomnom - lecker Kekse!");
    }

    public void sageFellfarbe()
    {
        System.out.println("Meine Fellfarbe ist: " + this.fellfarbe);
    }
}
