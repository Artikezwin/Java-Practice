package laba12;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
        String str = "abcdefghijklmnopqrstuv18340";
        Matcher matcher = p2.matcher(str);
        System.out.println(matcher.matches());

        //3
        /*
        – пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
        – пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s = "29/02/2000";
        try {
            LocalDate date = LocalDate.parse(s, formatter);
            if(s.matches(formatter.format(date))) System.out.println(formatter.format(date));
            else System.out.println("Год не високосный! неправильное выражение");
        }catch(java.time.format.DateTimeParseException e){
            System.out.println("неправильное выражение");
        }
    }
}