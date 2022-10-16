package laba4;

public class Cars implements Nameable {
    String name;
    @Override
    public String getName() {
        return name;
    }

    public Cars(String name) {
        this.name = name;
    }
}
