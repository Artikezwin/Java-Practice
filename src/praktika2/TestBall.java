package praktika2;

public class TestBall {
    public static void main(String[] args) {
        Ball obj1 = new Ball(100, 100);
        System.out.println(obj1);
        obj1.move(30, 15);
        System.out.println(obj1);
    }
}
