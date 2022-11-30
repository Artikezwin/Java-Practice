package praktika11_12;

public class PhoneParser {
    private String code, triplet2, quadruple, triplet1;

    public PhoneParser(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        triplet1 = phone.substring(phone.length()-10, phone.length()-7);
        triplet2 = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    public String toString() {
        return code + "-" + triplet1 + "-" + triplet2 + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneParser("88005553535"));
        System.out.println(new PhoneParser("+78005553535"));
        System.out.println(new PhoneParser("+1238005553535"));
        System.out.println(new PhoneParser("+118005553535"));
    }
}
