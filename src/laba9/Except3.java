package laba9;

import java.util.Scanner;

public class Except3 {
    public void exceptionDemo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите чиселку");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e){
            System.out.println("Что-то пошло не так");
        }
    }
}
