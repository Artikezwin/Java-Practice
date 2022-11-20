package practiki.prac_11_12;

public class Shirt {
    //"S010,Orange T-Shirt,Orange,S";
    String[] params = new String[4];

    public Shirt(String line){
        int k=0;
        for(String ob: line.split(",")){
            params[k] = ob;
            k++;
        }
    }

    @Override
    public String toString() {
        return String.format("%s; %s; %s; %s", params);
    }
}
