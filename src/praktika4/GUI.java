package praktika4;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;

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

    /*JTextField jta1 = new JTextField(10);
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
    }*/

    /*JTextArea jta1 = new JTextArea(10, 25);

    JScrollPane jScroll = new JScrollPane(jta1);
    JButton button = new JButton("Нажми на кнопку");
    public GUI(){
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());    // setLayout - прорисовка, позволяет приложению работаь при различных разрешениях
        // FlowLayout() - Добавляет все компоненты в таком порядке, в котором все написано в программе
        add(jta1);
        add(button);
        //add(jScroll);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog(null, "Вставьте текст");

                jta1.append(txt);
            }
        });

    }*/

    JPanel[] pnl = new JPanel[12];
    public GUI(){
        setLayout(new GridLayout(3, 4));
        for(int i=0; i<pnl.length; i++){
            int r = (int)(Math.random()*255);
            int b = (int)(Math.random()*255);
            int g = (int)(Math.random()*255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("один"), BorderLayout.WEST);
        pnl[4].add(new JButton("два"), BorderLayout.EAST);
        pnl[4].add(new JButton("три"), BorderLayout.SOUTH);
        pnl[4].add(new JButton("четыре"), BorderLayout.NORTH);
        pnl[4].add(new JButton("пять"), BorderLayout.CENTER);

        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("один"));
        pnl[10].add(new JButton("два"));
        pnl[10].add(new JButton("три"));
        pnl[10].add(new JButton("четыре"));
        pnl[10].add(new JButton("пять"));

        setSize(800, 500);



    }


}

