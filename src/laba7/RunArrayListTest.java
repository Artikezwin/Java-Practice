package laba7;

public class RunArrayListTest {
    public static void main(String[] args) {
        ArrayListTest obj = new ArrayListTest();
        obj.add(0, new Cat("white", "ghost"));
        System.out.println(obj);
        System.out.printf("Удаленный элемент - ");
        System.out.println(obj.remove(1));
        obj.set(1, new Cat("Blue","Sky"));
        System.out.println(obj);
    }
}
