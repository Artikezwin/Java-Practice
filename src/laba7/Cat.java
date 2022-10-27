package laba7;

public class Cat {
    private String colour;
    private String name;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
