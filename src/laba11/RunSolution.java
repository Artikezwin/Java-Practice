package laba11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RunSolution {
    public static void main(String[] args) {
        Solution test = new Solution();
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] lines = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};

        ArrayList list = test.newArrayList(numbers);
        System.out.println(list);
        HashSet set = test.newHashSet(numbers);
        System.out.println(set);
        HashMap map = test.newHashMap(numbers, lines);
        System.out.println(map);

    }
}
