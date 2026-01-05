package step9;

public class Haus {
    // Typ "Haus" für Objekt-Variablen
    // Zustände (Speichern von Daten in Variablen)
    public String möbelStückImWohnzimmer;
    public String möbelStückInDerKüche;

    // Fähigkeiten (Verarbeiten von Daten in Methoden)
    public String listeMöbelStückeAuf() {
        String ausgabe =
                "Im Wohnzimmer steht: " + möbelStückImWohnzimmer + ", und " +
                        "in der Küche steht: " + möbelStückInDerKüche;
        return ausgabe;
    }
}
