package laba15_16;

import praktika4.GUI;

import java.util.HashMap;
import java.util.LinkedList;

public class StartProgramm {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();

        internetOrder.addMenu(new Dish(1000, "Мясо на гриле", "Что-то поджаристое и мясное"));
        internetOrder.addMenu(new Drink(10, "Газировка, сладкая"));
        InternetOrder.addMenu(new Drink(5000, "Тэкила с лимоном"));

        /**
         * InternetOrder.addMenu(new Drink(-10, "1", "2"));
         * InternetOrder.addMenu(new Drink(10, ""));
         * InternetOrder.addMenu(new Drink(10, "", ""));
         * internetOrder.addMenu(new Dish(1000, "", ""));
         * internetOrder.addMenu(new Dish(-10000, "Свежее мясо"));
         **/

        LinkedList<Item> items = internetOrder.getSorted();
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }

        OrderManager orderManager1 = new OrderManager();
        orderManager1.addMenu(new Drink(1900, "Что-то из индейки"), "Верхние поля");
        orderManager1.addMenu(new Drink(1500, "Пирожные с заварным кремом"), "Римская улица");
        orderManager1.addMenu(new Drink(26000, "Набор из 2кг самых вкусных суши"), "Площадь Ильича");

        HashMap<String, Item> listAddress = orderManager1.getListAddress();
        for(String key : listAddress.keySet()){
            System.out.println(listAddress.get(key).getOpis()+ " - " + listAddress.get(key).getPrice() + ", адрес: " + key);
        }

        new GUIR().setVisible(true);
    }
}
