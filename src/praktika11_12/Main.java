package practiki.prac_11_12;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
//СДАНО

/*
Задание 1. (10%)
Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О. Функция
должна учитывать возможность отсутствия значений в полях Имя и Отчество.
Задание 2. (20%)
Доработать класс адреса, который из полученной строки формата "Страна[d] Регион[d] Город[d]
Улица[d] Дом[d] Корпус[d] Квартира" ([d] – разделитель, например, «запятая») выбирает соответствующие
части и записывает их в соответствующие поля класса Address. Учесть, что в начале и конце разобранной
части адреса не должно быть пробелов. Все поля адреса строковые. Разработать проверочный класс не
менее чем на четыре адресных строки. В программе предусмотреть две реализации этого метода:
а) разделитель – только запятая (использовать метод split()); Внимание, при разработке нужно учесть, что
б) разделитель – любой из символов ,.;- (класс StringTokenizer).
Задание 3. (30%)
Реализуйте класс Shirt: Метод toString() выводит объяснение и значение полей построчно.
Дан также строковый массив: shirts[0] = "S001,Black Polo Shirt,Black,XL"; shirts[1] = "S002,Black
Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M";
shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White TShirt,White,XL"; shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S"; shirts[9] =
"S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
Преобразуйте строковый массив в массив класса Shirt и выведите его на консоль.
Задание 4. (30%)
 */

/*
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом. В
методе getLine() используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
данного слова совпадала с первой буквой следующего не учитывая регистр. Каждое слово должно
участвовать 1 раз.
 */

public class Main {
    public static void main(String[] args) {

        String line = "";
        try(FileReader reader = new FileReader("src/practiki/prac_11_12/sourse/inp.txt")){
            int c;
            while((c=reader.read())!=-1){
                line += (char)c;
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] words = line.split(" ");
        StringBuilder result = arrangement(words);
        System.out.println(result.toString());
    }

    public static StringBuilder arrangement(String[] words){
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length==1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(words));
        result.append(wordsList.get(0));
        wordsList.remove(0);
        System.out.println();
        while(!wordsList.isEmpty()){
            for(int i=0; i<result.length(); i++){
                if(result.charAt(result.length()-1)==wordsList.get(i).toUpperCase().charAt(0)){
                    result.append(" ");
                    result.append(wordsList.get(i));
                    wordsList.remove(i);
                    break;
                }
                else if(result.charAt(result.length()-1)==wordsList.get(i).toLowerCase().charAt(0)){
                    result.append(" ");
                    result.append(wordsList.get(i));
                    wordsList.remove(i);
                    break;
                }
            }
        }
        return result;
    }
}
