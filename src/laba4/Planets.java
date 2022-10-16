package laba4;

public class Planets implements Nameable {
    String name;
    @Override
    public String getName() {
        return name;
    } //dodelat

    public Planets(String name) {
        this.name = name;
    }

}
