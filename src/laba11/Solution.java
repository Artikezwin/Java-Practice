package laba11;

import java.util.*;
/*Основываясь на предыдущей работе:
Реализуйте вспомогательные методы в классе Solution, которые должны
создавать соответствующую коллекцию и помещать туда переданные объекты.
Методы newArrayList, newHashSet параметризируйте общим типом T. Метод
newHashMap параметризируйте парой <K, V>, то есть типами К- ключ и Vзначение. Аргументы метода newHashMap должны принимать
 */
public class Solution <T> {
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> res = new ArrayList<>();
        for (T elm : elements)
            res.add(elm);

        return res;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> res = new HashSet<>();
        for (T elm : elements)
            res.add(elm);

        return res;
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length)
            throw new IllegalArgumentException();

        HashMap<K, V> res = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            res.put(keys[i], values[i]);
        }

        return res;
    }
}

