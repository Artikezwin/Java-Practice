package laba12;
import java.util.Scanner;
import java.util.regex.*;

/*
1. Необходимо реализовать консольное приложение, позволяющее манипулировать строкой, разбив ее
на элементы путем использования регулярных выражений.
2. Написать регулярное выражение, определяющее является ли данная строка строкой
"abcdefghijklmnopqrstuv18340" или нет.
a) пример правильных выражений: abcdefghijklmnopqrstuv18340
b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340
 */

/*
Написать регулярное выражение, определяющее является ли данная строчка датой в формате
dd/mm/yyyy. Начиная с 1900 года до 9999 года.
– пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
– пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
 */
public class Main {
    public static void main(String[] args) {
        // 1
        // java5tiger 77 java6mustang
        Scanner in = new Scanner(System.in);
        Pattern p1 = Pattern.compile("\\d+\\s?");
        String[] words = p1.split(in.nextLine());
        for (String word : words) {
            System.out.println(word);
        }

        //2
        Pattern p2 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str = "abcdefghijklmnopqrstuv18340444";
        Matcher matcher = p2.matcher(str);
        System.out.println(matcher.matches());

        //3
        /*
        – пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
        – пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
         */
        int a=12, b=3, c=2022;
        Pattern formatter1 = Pattern.compile("\\d{0}\\d[1-9]/\\d{0}\\d[1-9]/\\d\\d\\d\\d");
        Pattern formatter2 = Pattern.compile("\\d[10-31]/\\d[10-12]/\\d\\d\\d\\d");
        Pattern formatter3 = Pattern.compile("\\d{0}\\d[1-9]/\\d[10-12]/\\d\\d\\d\\d");
        Pattern formatter4 = Pattern.compile("\\d[10-31]/\\d{0}\\d[1-9]/\\d\\d\\d\\d");

        String s = "29/02/2000";
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