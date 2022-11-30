package laba15_16;

import java.util.LinkedList;

public class InternetOrder implements Order {
    static LinkedList<Item> list;

    public InternetOrder() {
        list = new LinkedList<>();
    }

    public InternetOrder(LinkedList<Item> list) {
        this.list = list;
    }

    public static boolean addMenu(Item element){
        return list.add(element);
    }

    @Override
    public boolean delete(String s){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getOpis() == s || list.get(i).getName() == s){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int deleteAll(String s){
        int kol = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName() == s){
                list.remove(i);
                kol+=1;
            }
        }
        return kol;
    }

    @Override
    public int getKol(){
        return list.size();
    }

    public int getPrice(){
        int price = 0;

        for(int i=0; i<list.size(); i++){
            price+=list.get(i).getPrice();
        }

        return price;
    }

    @Override
    public int kolDrinks(String name){
        int kol = 0;

        for(int i=0;i<list.size();i++){
            if(list.get(i).getName() == name){ kol++; }
        }

        return kol;
    }

    @Override
    public LinkedList<String> getNames(){
        LinkedList<String> names= new LinkedList<>();
        for(int i=0;i< list.size();i++){
            names.add(list.get(i).getName());
        }
        return names;
    }

    @Override
    public LinkedList<Item> getSorted(){
        boolean sorted = false;
        Item temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getPrice() > list.get(i+1).getPrice()) {
                    temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    sorted = false;
                }
            }
        }
        return list;
    }
}
