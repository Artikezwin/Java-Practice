package praktika7;

import java.util.Stack;

public class Game {
    private Stack<Cards> st_p1 = new Stack<>();
    private Stack<Cards> st_p2 = new Stack<>();

    public void append(Cards obj){
        if (obj.getNum_p()==1){
            st_p1.push(obj);
        }
        else{
            st_p2.push(obj);
        }
    }

    public void refacror(int loser){
        Stack<Cards> st_vrem1 = new Stack<>();
        Stack<Cards> st_vrem2 = new Stack<>();
        if(loser==1){
            for(int i=1;i<st_p1.size();i++){
                st_vrem1.push(st_p1.get(i));
            }

            //System.out.println(st_p2.get(0).getChisl());

            st_p2.push(st_p2.get(0));
            st_p2.push(st_p1.get(0));
            for(int i=1;i<st_p2.size();i++){
                st_vrem2.push(st_p2.get(i));
            }

            st_p2 = st_vrem2;
            st_p1 = st_vrem1;
        }

        else{
            for(int i=1;i<st_p2.size();i++){
                st_vrem2.push(st_p2.get(i));
            }

            st_p1.push(st_p1.get(0));
            st_p1.push(st_p2.get(0));
            for(int i=1;i<st_p1.size();i++){
                st_vrem1.push(st_p1.get(i));
            }

            st_p2 = st_vrem2;
            st_p1 = st_vrem1;
        }
    }

    public void test(){
        //System.out.println(st_p1.get(0).getChisl());
        if(st_p1.get(0).getChisl() == 0){ refacror(2); }

        else if(st_p2.get(0).getChisl() == 0){ refacror(1); }

        else if(st_p1.get(0).getChisl() > st_p2.get(0).getChisl()){ refacror(2); }

        else{ refacror(1); }

        output();
    }

    public void winner(){
        int kol = 0;
        while(!st_p1.empty() && !st_p2.empty()){
            kol++;
            if(st_p1.get(0).getChisl() == 0){ refacror(2); }

            else if(st_p2.get(0).getChisl() == 0){ refacror(1); }

            else if(st_p1.get(0).getChisl() > st_p2.get(0).getChisl()){ refacror(2); }

            else{ refacror(1); }
        }

        if(st_p1.empty()){ System.out.println("second, " + kol); }
        else{ System.out.println("first, " + kol); }
        //output();

        if(kol>=106){
            System.out.println("botva");
            return;
        }
    }

    public void output(){
        System.out.println("--------Player1--------");
        for(int i=0;i<st_p1.size();i++){
            System.out.println(st_p1.get(i).getChisl());
            //st_p1.pop();
        }

        System.out.println("--------Player2--------");
        for(int i=0;i<st_p2.size();i++){
            System.out.println(st_p2.get(i).getChisl());
            //st_p2.pop();
        }
    }
}
