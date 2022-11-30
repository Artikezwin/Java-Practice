package praktika11_12;

import java.util.StringTokenizer;

public class Number {
    String[] adress = new String[7];

    public void recording1(String line){
        int k=0;
        for(String elem : line.split(",")){
            adress[k] = elem;
            k++;
        }
    }

    public void recording2(String line){
        int k=0;
        StringTokenizer elem = new StringTokenizer(line, ",.;-");
        while (elem.hasMoreTokens()) {
            adress[k] = elem.nextToken();
            k++;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", adress);
    }

}
