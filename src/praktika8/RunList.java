package praktika8;

public class RunList {
    public static void main(String[] args) {
        WaitList<Integer> lst1 = new BoundedWaitList<Integer>(2);
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        System.out.println(lst1);
        lst1.remove();
        lst1.add(3);
        System.out.println(lst1);

        System.out.println("-----------------");
        UnfairwaitList<Integer> lst = new UnfairwaitList<Integer>();
        lst.add(123);
        lst.add(2);
        System.out.println(lst);
        lst.remove();
        System.out.println(lst);
        lst.add(32);
        lst.add(123);
        System.out.println(lst);
        lst.moveToBack(32);
        System.out.println(lst);
    }
}
