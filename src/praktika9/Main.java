package praktika9;

/*
Клиент совершает покупку онлайн. При оформлении заказа у пользователя запрашивается фио и
номер ИНН. В программе проверяется, действителен ли номер ИНН для такого клиента. Исключение будет
выдано в том случае, если введен недействительный ИНН.
 */
//ИНН, — это 12-значный номер
public class Main {
    public static void main(String[] args) {
        try{
            String fio = "Павлова ЕА";
            String INN = "123456289102";
            Client client = new Client(fio, INN);
            System.out.println(client);
        }catch (INNException e){
            System.out.println("Недействительный ИНН:  "+e.getMessage());
            System.out.println("dsws");
            //return;
        }finally{
            System.out.println(1);
        }
    }
}
