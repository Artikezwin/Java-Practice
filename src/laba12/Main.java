package laba12;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {

        int a=12, b=3, c=2022;
        Pattern formatter1 = Pattern.compile("\\d{0}\\d[1-9]/\\d{0}\\d[1-9]/\\d\\d\\d\\d");
        Pattern formatter2 = Pattern.compile("\\d[10-31]/\\d[10-12]/\\d\\d\\d\\d");
        Pattern formatter3 = Pattern.compile("\\d{0}\\d[1-9]/\\d[10-12]/\\d\\d\\d\\d");
        Pattern formatter4 = Pattern.compile("\\d[10-31]/\\d{0}\\d[1-9]/\\d\\d\\d\\d");

        String s = "19/12/2000";
        Matcher matcher1 = null;
        for(int i=0;i<4;i++){
            matcher1 = formatter1.matcher(s);
            if(matcher1.matches() == true){
                System.out.println("Совпало с шаблоном");
                System.exit(0);
            }
        }
        System.out.println("Не совпало с шаблоном");

    }
}