package praktika6;

public class RunSort {
    public static void main(String[] args) {
        Student[] mas = new Student[5];
        Student st1 = new Student("Makar"); mas[0] = st1;
        Student st2 = new Student("Ded"); mas[1] = st2;
        Student st3 = new Student("Artem"); mas[2] = st3;
        Student st4 = new Student("Amogus"); mas[3] = st4;
        Student st5 = new Student("Egor Letov"); mas[4] = st5;
        //obj.swap(10, 9);

        Sort sort = new Sort();
        System.out.println(sort.output(mas));
        mas = sort.compareTo(mas);
        System.out.println(sort.output(mas));
    }
}
