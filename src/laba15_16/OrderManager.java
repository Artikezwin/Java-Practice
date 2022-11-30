package laba15_16;

import java.util.HashMap;
import java.util.LinkedList;

public class OrderManager implements Order {
    static HashMap<String, Item> listAddress;

    public OrderManager() {
        listAddress = new HashMap<>();
    }

    public static boolean addMenu(Item element, String address){
        return listAddress.put(address, element) != null;
    }

    @Override
    public boolean delete(String address) {
        for(int i=0;i<listAddress.size();i++){
            if(listAddress.containsKey(address)){
                listAddress.remove(address);
                return true;
            }
        }
        return false;
    }

    @Override
    public int deleteAll(String address) {
        int kol = 0;
        for(int i=0;i<listAddress.size();i++){
            if(listAddress.containsKey(address)){
                listAddress.remove(address);
                kol++;
            }
        }
        return kol;
    }

    @Override
    public int getKol() {
        return listAddress.size();
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(String key : listAddress.keySet()){
            price += listAddress.get(key).getPrice();
        }
        return price;
    }

    @Override
    public int kolDrinks(String name) {
        int kol = 0;
        for(String key : listAddress.keySet()){
            if(listAddress.get(key).getName() == name){ kol++; }
        }
        return kol;
    }

    @Override
    public LinkedList<String> getNames() {
        LinkedList<String> names = new LinkedList<>();
        for(String key : listAddress.keySet()){
            names.add(listAddress.get(key).getName());
        }
        return names;
    }

    @Override
    public LinkedList<Item> getSorted() {
        return null;
    }

    public HashMap<String, Item> getListAddress(){
        return listAddress;
    }
}
