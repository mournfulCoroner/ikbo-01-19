import java.util.LinkedList;

public class LinkedQueue <T> extends AbstractQueue<T>{
    private LinkedList<T> lst;

    public LinkedQueue(int size) {
        lst = new LinkedList<T>();
    }

    public T dequeue() {
        if(!isEmpty()) return lst.remove(0);
        else return null;
    }

    public T element() {
        if(!isEmpty()) return lst.get(0);
        else return null;
    }

    public void enqueue(T el) {
        assert el!=null;
        lst.add(el);
    }

    public boolean isEmpty() {
        return lst.isEmpty();
    }

    public int size(){
        return lst.size();
    }

    public void clear(){
        assert lst.size() > 0;
        lst.clear();
    }
}
