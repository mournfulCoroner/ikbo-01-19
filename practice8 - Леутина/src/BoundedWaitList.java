public class BoundedWaitList <E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E el){
       if(content.size() < capacity) content.add(el);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
