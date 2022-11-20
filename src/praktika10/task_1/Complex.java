package praktika10.task_1;

public class Complex {
    private int image;
    private int real;

    public Complex(){
        real=0;
        image=0;
    }
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format("%d+(%d)i", real, image);
    }
}
