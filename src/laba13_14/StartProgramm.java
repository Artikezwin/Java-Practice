package laba13_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartProgramm {
    public static void main(String[] args) {
        Pattern[] formatter = new Pattern[3];   //29 практика
        formatter[0] = Pattern.compile("\\d\\d.\\d\\d USD");
        formatter[1] = Pattern.compile("\\d\\d.\\d\\d RUB");
        formatter[2] = Pattern.compile("\\d\\d.\\d\\d EU");

        String s = "44.35 EU";
        Matcher matcher1 = null;
        boolean flag = false;
        for(int i=0;i<3;i++){
            matcher1 = formatter[i].matcher(s);
            if(matcher1.matches()){
                System.out.println("Совпало с шаблоном");
                flag = true;
                break;
            }
        }
        if(!flag){ System.out.println("Не совпало с шаблоном"); }

        s = "name@root.com";
        //Pattern formatter2 = Pattern.compile("^[a-z0-9]+@(.+)[a-z0-9].?c?o?m?$");
        Pattern formatter2 = Pattern.compile("^[a-z0-9]+{1,1}@[a-z0-9]+.?c?o?m?$");
        matcher1 = formatter2.matcher(s);
        System.out.print(s + ": " + matcher1.matches());

    }
}
