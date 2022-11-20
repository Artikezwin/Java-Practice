package praktika13_14;

import java.text.DateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private String name;
    private double grade;
    DateFormat f;
    Date birth;

    public Student(String name, double grade, DateFormat f, Date birth){
        this.name = name;
        this.grade = grade;
        this.birth = birth;
        this.f = f;
    }

    public String getName() {return name;}
    public double getGrade() {return grade;}
    public void getInfo() {
        System.out.println(name+' '+grade);}

    @Override
    public int compareTo(Student o) {
        if(grade < o.getGrade()) return 1;
        if(grade > o.getGrade()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return f.format(birth);
    }
}
