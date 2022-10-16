package praktika7;

public class RunCards {
    public static void main(String[] args) {

        //int max=9, min=0;
        Game game = new Game();

        Cards Player1;
        int a=1, b=2;
        for(int i=0;i<5;i++){
            //Player1 = new Cards((int) (Math.random()*(max - min) + min), 1);
            Player1 = new Cards(a, 1);
            a+=2;
            //Player1.output();
            game.append(Player1);
        }

        Cards Player2;
        for(int i=0;i<5;i++){
            //Player2 = new Cards((int) (Math.random()*(max - min) + min), 2);
            if(i!=4){ Player2 = new Cards(b, 2); b+=2; }
            else{ Player2 = new Cards(0, 2); }
            //Player2.output();
            game.append(Player2);
        }

        game.winner();
    }
}
