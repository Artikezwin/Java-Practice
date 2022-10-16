package praktika5.Palindrom;


public class Palindrom {
    String s;
    private int i=0;

    public Palindrom(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void prov(){
        char c1 = this.s.charAt(i);
        char c2 = this.s.charAt(s.length()-1-i);

        if(i>s.length()/2){
            System.out.println("Yeeees!");
            return;
        }

        if(c1 == c2){
            i+=1;
            prov();
        }
        else{
            System.out.println("No!");
        }

    }
}
