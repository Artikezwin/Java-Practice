package laba9;

public class Exception5 {
    public void getDetails(String key){

        if(key == null){
            throw new NullPointerException("null key in getDetails!");
        }

        key = key + "abc";
        System.out.println(key);
    }
}
