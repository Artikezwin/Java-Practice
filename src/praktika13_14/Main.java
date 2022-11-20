package praktika13_14;
// СДАНО
import java.text.SimpleDateFormat;
import java.util.*;
/*
Задание 1. (20%)Написать программу, выводящую фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания. Для получения последней даты и времени использовать класс Date из пакета
java.util.* (Объявление Dated=newDate() или метод System.currentTimeMillis().
Задание 2. (20%)
Приложение, сравнивающее текущую дату и дату, введенную пользователем c текущим системным
временем
Задание 3. (20%)
Доработайте класс Student предусмотрите поле для хранения даты рождения, перепишите метод
toString() таким образом, чтобы он разработайте метод, возвращал строковое представление даты рождения
по вводимому в метод формату даты (например, короткий, средний и полный формат даты).
Задание 4. (10%)
Напишите пользовательский код, который формирует объекты Date и Calendar по следующим
данным, вводимым пользователем:
<Год><Месяц><Число>
<Часы1><минуты>
Задание 5 (30%)
Сравнить время выполнения кода в реализации кода в виде различных структур данных из
предыдущих заданий (сравнить ArrayList и LinkedList по производительности – операции вставки,
удаления, добавления и поиска по образцу)
 */
public class Main {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        Date now = new Date();
        System.out.println("ФИО разработчика:\tСлуцкий АМ");
        System.out.println("Дата разработки:\t13.11.2022");
        System.out.println("Текущая дата:\t\t"+sdf.format(now));
        System.out.println();

        // ЗАДАНИЕ 2
        Scanner in = new Scanner(System.in);
        String inputDate;
        System.out.print("Введите день, месяц и год в формате dd.MM.yyyy: ");
        inputDate = in.next();
        System.out.println(sdf.format(now).equals(inputDate));

        // ЗАДАНИЕ 3
        Student s1 = new Student("Евгений", 3.0, new SimpleDateFormat("dd.MM.yyyy"), new Date());
        Student s2 = new Student("Анатолий", 4.8, new SimpleDateFormat("dd.MM.yyyy ss"), new Date());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();

        // ЗАДАНИЕ 4
        int year, month, date, hour, minuts;
        year = in.nextInt();
        month = in.nextInt();
        date = in.nextInt();
        hour = in.nextInt();
        minuts = in.nextInt();
        Date newDate = new Date();
        newDate.setYear(year-1900);
        newDate.setMonth(month-1);
        newDate.setDate(date);
        newDate.setHours(hour);
        newDate.setMinutes(minuts);
        System.out.println(newDate);
        Calendar newCalendar = Calendar.getInstance();
        newCalendar.setTime(newDate);
        System.out.println(newCalendar.getTime());
        System.out.println();

        // ЗАДАНИЕ 5
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        LinkedList<Integer> lst2 = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.contains(3);
        lst1.remove(2);
        long estimatedTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.contains(3);
        lst2.remove(2);
        long estimatedTime2 = System.nanoTime() - startTime;
        System.out.println((double) estimatedTime/1_000_000_000+" s");
        System.out.println((double) estimatedTime2/1_000_000_000+" s");
    }
}
