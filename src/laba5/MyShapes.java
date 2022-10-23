package laba5;

import javax.swing.*;
import java.awt.*;

public class MyShapes extends JFrame {
    private int kol=0;
    public MyShapes(){
        super("Мои фигурки!");
        setSize(700, 500);
    }

    private void proverka(Shape shape, int x, int y){
        /*shape.setPos_x(x+100);
        x+=100;
        if(shape.getPos_x() >= 450){
            shape.setPos_y(y+100);
            shape.setPos_x(50);
            x=50;
            y+=100;
        }*/
    }

    public void paint(Graphics g){
        int min=1, max = 4, strelka = 0;
        Shape shape;
        int x=50, y=50;
        while(this.kol<20){
            strelka = min + (int)(Math.random() * max);
            switch (strelka){
                case 1:
                    shape = new Circle(x, y);

                    shape.apaint(strelka, g);

                    x+=80;
                    shape.setPos_x(x);
                    if(shape.getPos_x() >= 450) {
                        y += 100;
                        x = 50;
                        shape.setPos_x(x);
                        shape.setPos_y(y);
                    }

                    break;
                case 2:
                    shape = new Kvadr(x, y);

                    shape.apaint(strelka, g);

                    x+=80;
                    shape.setPos_x(x);
                    if(shape.getPos_x() >= 450) {
                        y += 100;
                        x = 50;
                        shape.setPos_x(x);
                        shape.setPos_y(y);
                    }



                    break;
                case 3:
                    shape = new Circle(x, y);
                    shape.apaint(strelka, g);

                    x+=100;
                    shape.setPos_x(x);
                    if(shape.getPos_x() >= 450) {
                        y += 100;
                        x = 50;
                        shape.setPos_x(x);
                        shape.setPos_y(y);
                    }

                    break;
                case 4:
                    shape = new Kvadr(x, y);
                    shape.apaint(strelka, g);

                    x+=100;
                    shape.setPos_x(x);
                    if(shape.getPos_x() >= 450) {
                        y += 100;
                        x = 50;
                        shape.setPos_x(x);
                        shape.setPos_y(y);
                    }

                    break;
            }

            this.kol++;
        }
    }
}
