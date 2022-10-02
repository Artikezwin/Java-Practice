package praktika5;
import java.util.*;


public class RunPalindrom {
    public static void main(String[] args) {
        String s="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ben is talking");
        s = sc.nextLine();
        Palindrom obj = new Palindrom(s);
        obj.prov();
    }
}
