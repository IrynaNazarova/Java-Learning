package step10;

public class StringWiederholung {
    public static void main(String[] args) {
        // Siehe nochmal step5/StringBuilderExamples

        String thema = " Welt";
        String konkatenation = "Hallo" + thema + "!"; // Hier werden 5 Strings verwendet: "Hallo", " Welt", "!", und die Konkatenationen beider Operatoren "Hallo Welt", "Hallo Welt!"

        StringBuilder builder = new StringBuilder();
        builder
                .append("Hallo") // Die Methoden vom StringBuilder geben das gleiche Helferobjekt immer wieder zurück -> "Fluent Interface"
                .append(" Welt");
        // Es kommt dasselbe dabei heraus
        String ohneBuilder = "Hallo";
        ohneBuilder = ohneBuilder + " Welt";
    }
}
