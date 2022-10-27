package praktika1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int n){
        this.name = name;
        this.age = n;
    }

    public Dog(String name){
        age = 0;
        this.name = name;
    }

    public Dog(){
        name = "безымянный";
        age = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + ", миленькая собачка не так ли, а возраст ее - " + this.age + " лет";
    }

    public void preobr_to_human(){
        System.out.println(name + " в человеческих годах возраст этой собаки " + this.age*7 + " лет");
    }
}
