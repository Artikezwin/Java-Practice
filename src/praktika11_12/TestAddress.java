package practiki.prac_11_12;

public class TestAddress {
    public static void main(String[] args) {
        Address address = new Address();
        address.recording2("a1,.;a2,a3.a4,a5,a6.a7");
        System.out.println(address);
        address.recording1("a1,a2,a3,a4,a5,a6,a7");
        System.out.println(address);
    }
}
