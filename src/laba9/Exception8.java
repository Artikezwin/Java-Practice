package laba9;

import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        int kol=0;
        while (kol<2){
            try {
                Scanner scanner = new Scanner(System.in);
                String key = scanner.next();
                printDetails(key);
                kol = 2;
            }
            catch (Exception e){
                System.out.println("Неправильный ввод");
            }
            kol++;
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e){
            throw e;
            //System.out.println("Возникли проблемы внутри getDetails");
        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")){
            throw new Exception("Key is empty");
        }
        return "data for " + key;
    }
}
