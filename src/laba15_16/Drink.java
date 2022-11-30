package laba15_16;

public final class Drink implements Item {
    private int price = 0;
    private String name;
    private String opis;

    public Drink(final int price, String name, String opis) {
        if(price>0 && (opis != "" || name != "")) {
            this.price = price;
            this.name = name;
            this.opis = opis;
        }
        else{
            throw new IllegalArgumentException("Ошибка при создании напитка, конструктор №1");
        }
    }

    public Drink(int price, String opis) {
        if(price>0 && opis != ""){
            this.price = price;
            this.opis = opis;
        }
        else{
            throw new IllegalArgumentException("Ошибка при создании напитка, конструктор №2");
        }
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
