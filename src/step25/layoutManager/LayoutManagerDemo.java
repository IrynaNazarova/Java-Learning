package step25.layoutManager;

import javax.swing.*;
import java.awt.*;

public class LayoutManagerDemo {

    public static void main(String[] args)
    {
        // Layouts oder LayoutManager in Swing sind verantwortlich fuer die Platzierung
        // und Ausrichtung der Steuerelemente. Ein JPanel (Leinwand), aber auch das JFrame hat einen Layoutmanager.

        // Jede Swing Anwendung braucht mindestens ein JFrame.
        // Hauptfenster:
        JFrame frame = new JFrame("Layout Managers Demo");
        frame.setSize(600, 400);

        // Wenn der X Button gedrueckt soll die Anwendung beendet werden:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // das Fenster anzeigen:

        // JPanel haben Layouts! JPanel hat als default das FlowLayout:
        JPanel flowPanel = new JPanel(new FlowLayout()); // besser explizit das Flow Layout setzen
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 2));
        gridPanel.add(new JButton("1"));
        gridPanel.add(new JButton("2"));
        gridPanel.add(new JButton("3"));
        gridPanel.add(new JButton("4"));

        // BoxLayout
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new Button("TOP"));
        boxPanel.add(new JButton("Middle"));
        boxPanel.add(new Button("Bottom"));

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("FlowLayout", flowPanel);
        tabbedPane.addTab("BorderLayout", borderPanel);
        tabbedPane.add("GridLayout", gridPanel);
        tabbedPane.add("BoxLayout", boxPanel);

        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}
