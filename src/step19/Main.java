package step19;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {

        // Versuch, von Interface ein Objekt zu erzeugen:
        // Druckbar druck = new Druckbar(); // Von Interfaces können keine Instanzen gebildet werden.
        // Achtung: Es können Anonyme Klassen erzeugt werden. Dieses Thema wird in OP2 besprochen

        // auf statische Methoden oder statische Attribute haben wir natürlich Zugriff
        // über den Interfacenamen
        System.out.println("***** Interface- Ausgabe der statischen Member *****");
        System.out.println(Druckbar.DINA4);
        Druckbar.testDruck(); //statische Methode in Interface


        // Ein Objekt der Klasse erzeugen
        System.out.println("\n\n***** Dokument *****");
        Dokument dok = new Dokument("Hallo Welt!");
        boolean b = dok.prüfeFormat("297 mm x 210 mm"); // Aufruf der default-Methode
        System.out.println("Rückgabe der PrüfeFormat-Methode: " + b);

        if(dok.prüfeFormat("297 mm x 210 mm"))
        {
            dok.drucken(); //Aufruf der implementierten Methode
        }

        //Dokument.testDruck(); //Fehler: Die statische Interface-Methode kann nur über das Interface aufgerufen werden

        // Ein Objekt der Klasse PDFDokument
        System.out.println("\n\n***** PDF Dokument *****");
        PDFDokument pdf = new PDFDokument("Hallo Welt in pdf");
        System.out.println(pdf.getText());
        pdf.pdfDrucken();
        pdf.mailVersenden();
        pdf.drucken(); //geerbt aus Klasse Dokument

        System.out.println("\n\n***** Liste mit allen Objekten die von Druckbar implementieren *****");
        // Interfaces können als Datentyp für Listen verwendet werden
        ArrayList<Druckbar> liste = new ArrayList<>();
        liste.add(dok); //Dokument implementiert das Interface 'Druckbar' und kann somit in die Liste hinzugefügt werden
        liste.add(pdf); //PDFDokument implementiert das Interface 'Druckbar' und kann somit in die Liste hinzugefügt werden

        for(Druckbar d : liste)
        {
            d.drucken();
        }



    }

}

