package praktika5.ot_1_do_n;

public class OutN {
    private int a=1;
    private int b;

    public OutN(int b) {
        this.b = b;
    }

    public void recurs(){
        if(a<=b){
            System.out.println(a);
            a++;
            recurs();
        }
    }
}
