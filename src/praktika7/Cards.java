package praktika7;

import java.util.Stack;

public class Cards {
    private int chisl;
    private int num_p;

    public Cards(int chisl, int num_p) {
        this.chisl = chisl;
        this.num_p = num_p;
    }

    void output(){
        System.out.println(chisl);
    }

    public int getChisl() {
        return chisl;
    }

    public void setChisl(int chisl) {
        this.chisl = chisl;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }
}

