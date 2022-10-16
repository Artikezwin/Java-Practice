package praktika6;

import java.util.*;

public class Student {
    private int ID;
    private String name="";

    public Student(String name) {
        int min = 100;
        int max = 200;
        int diff = max-min;
        Random random = new Random();
        ID=random.nextInt(diff+1);
        ID+=min;
        this.name = name;
        //System.out.println(ID);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void swap(Integer x, Integer y){
        System.out.println(x);
        System.out.println(y);
        int vrem=x;
        x=y;
        y=vrem;
    }

}

