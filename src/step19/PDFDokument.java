package step19;

public class PDFDokument extends Dokument implements PDFDruckbar,Mailbar
{

    public PDFDokument(String text)
    {
        super(text);
    }

    //Die Methode pdfDrucken liegt in PDFDruckbar und muss implementiert werden
    @Override
    public void pdfDrucken()
    {
        System.out.println("Digitale Druckergeräusche... Das Dokument wird als PDF gedruckt. Das ist der Text: " + text );
    }

    //Die Methode mailVersenden liegt in Mailbar und muss implementiert werden
    @Override
    public void mailVersenden()
    {
        System.out.println("Digitale Briefgeräusche... Das Dokument wird per Mail versendet. Das ist der Text: " + text);
    }
}
