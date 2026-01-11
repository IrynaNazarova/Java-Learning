package step14.vorlesungCode;

public enum Kleidergröße {
    // Konstanten werden immer groß geschrieben -> Programmierkonvention
    XS(34), S(36), M(38), L(40), XL(42), XXL(44);

    // Falls ich den Konstantennamen zusätzlich eine Zahl selbst zuweisen möchte
    // brauche ich einen Konstruktor und eine Variable
    private final int nummerischeGröße;

    private Kleidergröße(int nummerischeGröße)
    {
        this.nummerischeGröße = nummerischeGröße;
    }

    public int getNummerischeGröße()
    {
        return nummerischeGröße;
    }
}
