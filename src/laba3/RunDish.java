package laba3;

public class RunDish {
    public static void main(String[] args) {
        //Dish obj = new Dish;
        Vilka vilka = new Vilka("Вилка","metall");
        Tarelka tarelka = new Tarelka("Непробиваемая тарелка","Титан","белый");
        System.out.println(vilka);
        System.out.println(tarelka);
        vilka.setBroken(true);
        vilka.isBroken();
    }
}