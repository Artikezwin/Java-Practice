package praktika4;

import javax.swing.*;
import java.awt.*;

class GUI extends JFrame{

    JTextField jta = new JTextField(3); //3 - сколько символов видно в текстовом поле
    Font fnt = new Font("Calibri", Font.BOLD, 20); //шрифт, жирный текст, размер

    public GUI(){
        super("Example");   //super - текущий экземпляр родительского класса, вызов конструктора родительского класса
        setLayout(new FlowLayout());
        setSize(250, 100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);

        setVisible(true);
    }


}

