package step10;




import java.util.Arrays;

public class Unterricht {
    public static void main(String[] args) {
        Album petersBeste = new Album(
                "Peters Beste",
                2000,
                new Song[]{
                        new Song("Alle Jahr wieder", "Peter Lustig", 1999), // Position 0
                        new Song("Alle Jahr schonwieder", "Peter Lustig", -1), // Position 1
                }
        );

        // erscheinungsjahr ist package private -> alles im Paket musikproduktion kann darauf zugreifen. Außerhalb ('public') dann nicht.
        // petersBeste.erscheinungsjahr; // Fehler
        System.out.println(petersBeste.getErscheinungsjahr()); // 'public'
        System.out.println(petersBeste.getSongAt(1).getErscheinungsjahr(petersBeste));

        String[] alleTitel = petersBeste.getAlleTitel();
        System.out.println(Arrays.toString(alleTitel));
    }
}
