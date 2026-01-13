package step16.unterrichtKomposition.aufgabe2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Gruppe {

    // Private innere Klasse: Damit können außerhalb von Gruppe keine Instanzen der Klasse gebildet werden.
    private static class Abenteurer
    {
        private String name;

        private Abenteurer(String name)
        {
            this.name = name;
        }
    }

    private final List<Abenteurer> abenteurerInDerGruppe = new ArrayList<Abenteurer>();

    // Hinzufügen von Abenteurern nur über diese Methode.
    public void addAbenteurer(String name)
    {
        abenteurerInDerGruppe.add(new Abenteurer(name));
    }

    public void removeAbenteurer(int index)
    {
        abenteurerInDerGruppe.remove(index);
    }

    // Abenteurer nur als String zurückgeben.
    public String getAbenteurerString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < abenteurerInDerGruppe.size(); i++)
        {
            sb.append(i).append(":").append(abenteurerInDerGruppe.get(i).name);
            if (i < abenteurerInDerGruppe.size() - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Alle Änderungen an Abenteurern werden über die Gruppe behandelt.
    public void setName(int index, String name)
    {
        abenteurerInDerGruppe.get(index).name = name;
    }


}
