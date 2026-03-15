package step25;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyGuiWindow extends JFrame { // Теперь этот класс и есть Окно

    // Конструктор - здесь настраиваем окно
    public MyGuiWindow() {
        setTitle("Профессиональная структура");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Позиция: Окно появится по центру монитора (не относится к Layout)
        setLocationRelativeTo(null);
        // Правило: Внутри окна используем BorderLayout
        setLayout(new BorderLayout());

        initialize(); // Вызываем метод для добавления кнопок
    }

    private void initialize() {
        //setLayout(new BorderLayout());

        JLabel label = new JLabel("Я в отдельном классе!", JLabel.CENTER);
        JButton button = new JButton("Нажми меня");
        // Erweiterung 1 durch ein Label->
        // Эти строки устанавливают выравнивание текста внутри метки по горизонтали и вертикали в центр.
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        //label.setSize(125,50);
        //label.setLocation(25, 25);
        //Здесь создается граница для метки с помощью BorderFactory.
        // Граница будет черной и толщиной 2 пикселя. Затем эта граница устанавливается для метки.
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        label.setBorder(border);
        //Устанавливается фоновый цвет метки с помощью RGB-значений.
        // Метод setOpaque(true) делает метку непрозрачной, что позволяет фоновому цвету отображаться.
        label.setBackground(new Color(171, 205, 247));
        label.setOpaque(true);
        // --- ВОТ ОН, ACTION LISTENER ---
        // Мы говорим кнопке: "Добавь слушателя действий"
        button.addActionListener(e -> {
            // Всё, что внутри этих фигурных скобок, выполнится ТОЛЬКО при клике
            label.setText("Ура! Кнопка нажата!");
            label.setForeground(Color.RED); // Сделаем текст красным

            System.out.println("Пользователь кликнул по кнопке.");

        });
        // -------------------------------

        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        // ВАЖНО: setVisible(true) обычно вызывают в конце настройки
        setVisible(true);
    }
}



