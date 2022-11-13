package laba10;

import java.util.ArrayList;
import java.util.List;

public class MyGenericArrayList<E> extends ArrayList{
    private int size;
    private Object[] elements;

    public MyGenericArrayList() {
        size = 0;
        elements = new Object[10];
    }

    /*public Object get(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: "+ size);
        }
        return (Object)elements[index];
    }*/

    public int size(){
        return this.size;
    }

    public MyGenericArrayList<E> convert(E[] mas){
        MyGenericArrayList<E> list = new MyGenericArrayList<E>();
        list.addAll(List.of(mas));
        return list;
    }

    @Override
    public String toString() {
        return "Первый элемент - " + this.get(0) + "\n"
                + "Второй элемент - " + this.get(1) + "\n"
                + "Третий элемент - " + this.get(2) + "\n"
                + "Четвертый элемент - " + this.get(3) + "\n"
                + "Пятый элемент - " + this.get(4);
    }
}
