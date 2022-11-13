package praktika8;

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
        content.add((E) element);
    }

    @Override
    public Object remove() {
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        for(Object elem: content){
            if(elem.equals(element)) return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        for(Object elem: c){
            if(!this.contains(c)) return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
