package step19.aufgaben;

public class Musiker  implements IGitarrenspieler, ISänger{

    @Override
    public void gitarreSpielen()
    {
        System.out.println("Ich spiele Gitarre.");
    }

    @Override
    public void singen()
    {
        System.out.println("Ich singe.");
    }
}
