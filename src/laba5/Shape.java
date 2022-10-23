package laba5;

import java.awt.*;

public abstract class Shape {
    protected int pos_x = 50;
    protected int pos_y = 50;
    protected int colors[] = {0, 0, 0};

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public void Set(){
        int min = 0, max = 255;
        for(int i=0;i<3;i++){
            colors[i] = min + (int)(Math.random() * max);
        }
    }

    public abstract void apaint(int strelka, Graphics g);

    public int[] getColors() {
        return colors;
    }
}

class Circle extends Shape{
    public Circle(int x, int y) {
        pos_x = x;
        pos_y = y;
    }

    @Override
    public void apaint(int strelka, Graphics g) {
        int x = this.getPos_x();
        int y = this.getPos_y();
        switch (strelka){
            case 1:
                Graphics2D g3 = (Graphics2D) g;
                this.Set();
                g3.setColor(new Color(this.getColors()[0], this.getColors()[1], this.getColors()[2]));
                g3.fillRect(this.getPos_x(), this.getPos_y(), 50, 50);


                break;
            case 3:
                Graphics2D g5 = (Graphics2D) g;
                this.Set();
                g5.setColor(new Color(this.getColors()[0], this.getColors()[1], this.getColors()[2]));
                g5.fillRect(this.getPos_x(), this.getPos_y(), 60, 20);


                break;
        }
    }
}

class Kvadr extends Shape{
    public Kvadr(int x, int y) {
        pos_x = x;
        pos_y = y;
    }

    @Override
    public void apaint(int strelka, Graphics g) {
        int x = this.getPos_x();
        int y = this.getPos_y();
        switch (strelka){
            case 2:
                Graphics2D g2 = (Graphics2D) g;
                this.Set();
                g2.setColor(new Color(this.getColors()[0], this.getColors()[1], this.getColors()[2]));
                g2.drawOval(this.getPos_x(), this.getPos_y(), 50, 50);

                break;

            case 4:
                Graphics2D g4 = (Graphics2D) g;
                this.Set();
                g4.setColor(new Color(this.getColors()[0], this.getColors()[1], this.getColors()[2]));
                g4.drawOval(this.getPos_x(), this.getPos_y(), 60, 20);

                break;
        }
    }
}

