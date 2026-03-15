package step25;

import javax.swing.*;
import java.awt.*;

    public class ClickCounter extends JFrame {
        // 1. Создаем переменную для счета (вне методов, чтобы она была доступна всем)
        private int count = 0;
        private JLabel label;

        public ClickCounter() {
            setTitle("Счетчик кликов");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            setLayout(new BorderLayout());

            // 2. Создаем лейбл с начальным значением
            label = new JLabel("Кнопок нажато: 0", JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));

            // 3. Создаем кнопку
            JButton button = new JButton("Кликни меня!");

            // 4. Оживляем её
            button.addActionListener(e -> {
                count++; // Прибавляем 1
                //Начальный текст тоже сделаем через HTML
                label.setText("<html>Кликов сделано: <font color='black'>0</font> count</html>"); // Обновляем текст в GUI
                System.out.println("Счет в консоли: " + count);// Дублируем для нас в консоль
                // Обновляем только числовую часть цветом
                String ColorName = (count % 2 == 0) ? "red" : "blue";
                label.setText("<html>Кликов сделано: <font color='" + ColorName + "'> " + count + " </font> </html>");

                /* 5. Меняем цвет в зависимости от четности
                if (count % 2 == 0) {
                    // Если число делится на 2 без остатка (четное)
                    label.setForeground(Color.BLUE);
                    System.out.println("Число " + count + " четное -> Синий");
                } else {
                    // Если есть остаток (нечетное)
                    label.setForeground(Color.RED);
                    System.out.println("Число " + count + " нечетное -> Красный");
                }*/
            });

            add(label, BorderLayout.CENTER);
            add(button, BorderLayout.SOUTH);

            setVisible(true);
        }


    }

