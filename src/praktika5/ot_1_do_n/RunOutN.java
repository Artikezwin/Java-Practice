package praktika5.ot_1_do_n;

import java.util.Scanner;

public class RunOutN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OutN obj = new OutN(n);
        obj.recurs();
    }
}
