package praktika6;
import com.sun.source.util.SourcePositions;

import java.util.*;

public class Sort {
    int[] ID = new int[10];

    public Sort() {
        int min = 100;
        int max = 200;

        for(int i=0;i<ID.length;i++){
            Random random = new Random();
            ID[i]=random.nextInt(min, max);
            //System.out.println(ID[i]);
        }
    }

     private static void swap(int x, int y){
        System.out.println(x);
        System.out.println(y);
        int vrem=x;
        x=y;
        y=vrem;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i=0;i<ID.length;i++){
            s = s + Integer.toString(ID[i]);
            if(i!=ID.length-1) s = s + " ";
        }
        return s;
    }

    public void InsertionSort(){    //Сортировка вставками
        int vrem;
        for(int i=1;i<ID.length;i++){
            for(int j=i;j>0 && ID[j-1]>ID[j];j--){
                //swap(ID[j-1], ID[j]);
                vrem = ID[j];
                ID[j] = ID[j-1];
                ID[j-1] = vrem;
            }
        }
    }


}
