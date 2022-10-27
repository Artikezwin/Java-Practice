package praktika1;

public class CompileDog {
    public static void main(String[] args){
        Dog obj1 = new Dog("Ryan_Gosling", 5);
        Dog obj2 = new Dog("Jotaro", 3);
        Dog obj3 = new Dog("Kalendar'");
        obj3.setAge(10);
        System.out.println(obj1);
        obj1.preobr_to_human();
        obj2.preobr_to_human();
        obj3.preobr_to_human();
    }
}
