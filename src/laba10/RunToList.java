package laba10;

import java.util.List;

public class RunToList {

    public static void main(String[] args) {
        MyGenericArrayList<String> strList = new MyGenericArrayList<String>();

        String[] mas = {"a", "ab", "q", "qwerty", "awd", "dfg", "dw", "gr", "Amogus", "gf"};
        strList = strList.convert(mas);
        System.out.println(strList.get(1));
        System.out.print(strList);
    }
}
