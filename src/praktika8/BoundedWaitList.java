package praktika8;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Object element){
        if(content.size() == capacity) return;
        super.add(element);
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
