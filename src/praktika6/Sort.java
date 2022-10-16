package praktika6;

public class Sort {
    public Student[] compareTo(Student[] mas){    //Сортировка вставками
        Student vrem;

        for(int i=1;i<mas.length;i++){
            for(int j=i;j>0 && mas[j-1].getID()>mas[j].getID();j--){
                //swap(ID[j-1], ID[j]);
                vrem = mas[j];
                mas[j] = mas[j-1];
                mas[j-1] = vrem;
            }
        }
        return mas;
    }

    public String output(Student[] mas) {
        String s = "";
        for(int i=0;i<mas.length;i++){
            s = s + Integer.toString(mas[i].getID()) + ": ";
            s = s + "Имя - " +  mas[i].getName()+"\n";
            if(i!=mas.length-1) s = s + " ";
        }
        return "Массив - " + s;
    }
}
