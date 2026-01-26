package step22.Bankkonto;

public class Bankkonto {




        private double guthaben;

        //Konstruktor
        public Bankkonto(double guthaben)
        {
            this.guthaben = guthaben;
        }

        public double einzahlen(double betrag)
        {
            if(betrag>0)
            {
                guthaben = guthaben + betrag;
            }
            return guthaben;
        }

        public double abheben (double betrag)
        {
            if(betrag > 0 && guthaben >= betrag)
            {
                guthaben = guthaben - betrag;
            }
            else
            {
                System.out.println("Du hast keinen Dispo, du bekommst nur Geld falls du es besitzt.");
            }
            return guthaben;

        }

        public double getGuthaben()
        {
            return guthaben;
        }





}
