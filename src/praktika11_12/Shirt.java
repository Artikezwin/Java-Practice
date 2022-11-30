package praktika11_12;

import java.util.StringTokenizer;

public class Shirt {
    //"S010,Orange T-Shirt,Orange,S";
    private String number;
    private String name;
    private String color;
    private String size;

    public Shirt(String line){

        int k1=0;
        StringTokenizer elem = new StringTokenizer(line, ",");
        while (elem.hasMoreTokens()) {
            number = elem.nextToken();
            name = elem.nextToken();
            color = elem.nextToken();
            size = elem.nextToken();
            k1++;
        }
    }

    /*@Override
    public String toString() {
        return String.format("%s; %s; %s; %s", params);
    }*/

    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
