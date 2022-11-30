package praktika15_16;

public final class Dish implements Item{    //Блюдо
    private int price = 0;
    private String name;
    private String opis;

    public Dish(int price, String name, String opis) {
        if(price>0 && (opis != "" || name != "")) {
            this.price = price;
            this.name = name;
            this.opis = opis;
        }
        else{
            throw new IllegalArgumentException("Ошибка при создании блюда, конструктор №1");
        }
    }

    public Dish(int price, String opis) {
        if(price>0 && opis != "") {
            this.price = price;
            this.opis = opis;
        }
        else{
            throw new IllegalArgumentException("Ошибка при создании блюда, конструктор №2");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOpis() {
        return opis;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
