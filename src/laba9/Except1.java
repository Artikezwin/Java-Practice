package laba9;

public class Except1 {
    public void exceptionDemo() {
        try{
            System.out.println(2 / 0);
        }
        catch(ArithmeticException e){
            System.out.println("Деление на 0");
        }
    }
}
