package step18;

public class Nilkrokodil  extends Krokodil {

    public Nilkrokodil(String farbe, int alter)
    {
        super(farbe, alter);
    }

    @Override
    public void zeigeInfoZumLebensraum()
    {
        System.out.println("Anders als mein Name vermuten lässt, lebe ich nicht nur am Nil, sondern in fast ganz Afrika.");
    }

    public void imGrasLiegen()
    {
        System.out.println("Ich liege im Gras. Hier mag ich es.");
    }
}
