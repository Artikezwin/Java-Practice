package praktika4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends JFrame{

    /*JTextField jta = new JTextField(3); //3 - сколько символов видно в текстовом поле
    Font fnt = new Font("Calibri", Font.BOLD, 20); //шрифт, жирный текст, размер

    public GUI(){
        super("Example");   //super - текущий экземпляр родительского класса, вызов конструктора родительского класса
        setLayout(new FlowLayout());
        setSize(250, 100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);

        setVisible(true);
    }*/

    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);

    JButton button = new JButton(" Тыкай");

    Font fnt = new Font("Times new roman", Font.BOLD, 18);

    GUI() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result =" + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

}

