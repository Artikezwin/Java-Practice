package laba6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ugad extends JFrame {
    JTextField jta = new JTextField(10);

    JButton button = new JButton(" Тыкай");

    Font fnt = new Font("Times new roman", Font.BOLD, 18);
    private int chisl = 10;
    private int kol = 0;

    Ugad() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(new JLabel("Попробуй-ка угадать число от 0 до 20"));

        add(jta);
        jta.setFont(fnt);
        add(button);

        button.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                try {
                    int x2 = Integer.parseInt(jta.getText().trim());

                    if(x2 == chisl){
                        JOptionPane.showMessageDialog(null, "Поздравляю, ты угадал!", "Мои поздравления, дружище", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }

                    else{
                        kol++;
                        if(kol==3){
                            JOptionPane.showMessageDialog(null, "Не все так просто, не так ли?", "Попытки кончились, дружище", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Можешь попробовать еще раз. У тебя осталось еще " + Integer.toString(3-kol), "Не повезло... Не повезло...", JOptionPane.INFORMATION_MESSAGE);
                            jta.setText("");
                        }

                    }
                }
                catch (Exception e) {
                    kol++;
                    if(kol==3){
                        JOptionPane.showMessageDialog(null, "Не все так просто, не так ли?", "Попытки кончились, дружище", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }

                    JOptionPane.showMessageDialog(null, "Ты кого обмануть пытаешься? Это не числа!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                    jta.setText("");
                }
            }
        });
        setVisible(true);
    }
}
