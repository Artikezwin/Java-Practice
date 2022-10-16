package laba4;

public class Main {
    public static void main(String[] args) {
        Nameable output = new Cars("АААААВТОМОБИЛЬ");
        System.out.println(output.getName());

        output = new Planets("Земля");
        System.out.println(output.getName());
    }
}
