package step20;

public class StandFutter extends Stand implements LizenzenUndCo  {

    @Override
    public void erlaubnis() {
        hatErlaubnis = true; // MUSS haben
    }

    @Override
    public void lizenz() {
        hatLizenz = true; // MUSS haben
    }

    @Override
    public void infektion() {
        hatInfektion  = true; // MUSS haben
    }
}
