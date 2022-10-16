package praktika5.Prost;

public class Prost {
    private int n;
    private int del = 2;

    public Prost(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void prov() {
        if (this.n % del != 0 && del<=n/2){
            del+=1;
            prov();
        }
        else if(n%del == 0){
            System.out.println("Число не простое");
            System.exit(0);
        }
        System.out.println("Число простое");
        System.exit(0);
    }
}
