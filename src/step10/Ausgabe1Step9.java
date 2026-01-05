package step10;

import java.util.Arrays;

public class Ausgabe1Step9 {
    public static void main(String[] args) {
        Firma apple = new Firma();
        apple.setName("Apple");
        apple.setKonten(new double[]{25.5,3.7});

        Firma samsung = new Firma();
        samsung.setName("Samsung");
        samsung.setKonten(new double[]{3.4,32});

        System.out.println(apple.getName());
        System.out.println(Arrays.toString(samsung.getKonten()));
        System.out.println(samsung.getSumme());
    }
}

class Firma {
    private String name;
    private double[] konten;

    public double getSumme() {
        double gesamtbetrag = 0;
        for (double konto : konten) {
            gesamtbetrag += konto;
        }
        return gesamtbetrag;
    }

    public void setName(String neuerWert) {
        name = neuerWert;
    }

    public String getName() {
        return name;
    }

    public void setKonten(double[] neuerWert) {
        konten = neuerWert;
    }

    public double[] getKonten(){
        return konten;
    }
}
