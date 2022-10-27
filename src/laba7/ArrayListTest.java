package laba7;

import java.util.ArrayList;

public class ArrayListTest {    //список на основе массива, не путать с связным списком (LinkedList)
    private ArrayList<Cat> CatsList = new ArrayList<Cat>();

    public ArrayListTest() {
        Cat Gosling = new Cat("black", "Rayan Gosling");
        Cat Anekdot = new Cat("white", "Anekdot");
        Cat Jotero = new Cat("grey", "Jotero");
        Cat Artem = new Cat("black", "Artem");

        CatsList.add(0, Gosling);
        CatsList.add(Anekdot);
        CatsList.add(1, Artem);
        CatsList.add(Jotero);
    }

    public boolean IsEmpty(){
        return CatsList.isEmpty();
    }

    public Cat remove(int i){
        Cat vrem = CatsList.get(i);
        CatsList.remove(i);
        return vrem;
    }

    public void add(int i, Cat cat){
        CatsList.add(i, cat);
    }

    public void set(int i, Cat cat){
        CatsList.set(i, cat);
    }

    @Override
    public String toString() {
        if(CatsList.isEmpty()){ System.out.println("Список пуст"); return "Список пуст"; }

        String out = "";
        for(int i=0;i<CatsList.size();i++){
            out +=  CatsList.get(i).getColour() + " " + CatsList.get(i).getName() + "\n";
        }

        return out;
    }

}
