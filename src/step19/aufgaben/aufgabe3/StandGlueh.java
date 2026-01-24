package step19.aufgaben.aufgabe3;

public class StandGlueh  extends Stand implements LizenzenUndCo{

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
