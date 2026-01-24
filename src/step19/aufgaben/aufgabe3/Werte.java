package step19.aufgaben.aufgabe3;

public abstract class Werte {
    static final int mieteGlueh = 100; // pro qm
    static final int mieteFutter = 75; // pro qm
    static final int mieteVerkauf = 65; // pro qm

    static final int minSizeKlein = 15;
    static final int maxSizeKlein = 30;
    static final int minSizeGross = 35;
    static final int maxSizeGross = 100;

    static final int standMin = 70;
    static final int standMax = 100;
    static final double anteilGlueh = 0.1; // 10%
    static final double anteilFutter = 0.3; // 30%
    static final double anteilVerkauf = 0.6; // 60%

    static final int besucherMin = 7000;
    static final int besucherMax = 10000;

    static final double besucherGlueh = 0.3; // 30%
    static final double besucherFutter = 0.2; // 20%
    static final double besucherVerkauf = 0.1; // 10%
    static final double besucherGlueVerkauf = 0.25; // 25%
    static final double besucherGluehFutterVerkauf = 0.15; // 15%

    static final int gluehGeldMin = 25;
    static final int gluehGeldMax = 40;
    static final int futterGeldMin = 20;
    static final int futterGeldMax = 30;
    static final int verkaufGeldMin = 30;
    static final int verkaufGeldMax = 50;
}
