package praktika10;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList {
    protected ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<>();
    public WaitList() {
    }
    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
