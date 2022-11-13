package praktika8;

public class UnfairwaitList<E> extends WaitList{
    public UnfairwaitList() {
    }
    public void remove(E element){
        content.remove(element);
    }
    public void moveToBack(E element){
        E elem = (E) content.remove();
        content.add(elem);
    }
}
