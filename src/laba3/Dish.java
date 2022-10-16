package laba3;

public abstract class Dish {
    protected boolean broken = false;
    protected String name="";

    public Dish(String name) {
        this.name = name;
    }

    public abstract void setBroken(boolean broken);

    public abstract boolean isBroken();

    public String toString(){
        return("Название посуды: " + name);
    }
}

class Vilka extends Dish {
    private String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    public Vilka(String name, String material) {
        super(name);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void setBroken(boolean broken) {
        this.broken = broken;
        System.out.println("Вилка гнутая\n");
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

    public String toString() {
        return (super.toString() + "\nМатериал: " + material);
    }
}

class Tarelka extends Dish{
    private String material;
    private String colour;

    public Tarelka(String name, String material, String colour) {
        super(name);
        this.material = material;
        this.colour = colour;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
        System.out.println("Тарелка разбита\n");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return(super.toString() + "\nМатериал: " + material + "\nЦвет: " + colour);
    }
}
