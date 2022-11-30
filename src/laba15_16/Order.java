package laba15_16;

import java.util.LinkedList;

public interface Order {
    public static boolean addMenu(Item element) {
        return false;
    }
    boolean delete(String s);
    int deleteAll(String s);
    int getKol();
    public int getPrice();
    public int kolDrinks(String name);
    public LinkedList<String> getNames();
    public LinkedList<Item> getSorted();
}
