package praktika5.Prost;
import java.util.*;

public class RunProst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prost obj = new Prost(n);
        obj.prov();
        sc.close();
    }
}
