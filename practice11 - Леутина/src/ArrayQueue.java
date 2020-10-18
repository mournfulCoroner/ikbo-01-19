import java.util.ArrayList;

public class ArrayQueue <T> extends AbstractQueue<T>{
    private int size;
    private ArrayList<T> array;

    public ArrayQueue(int size) {
        this.size = size;
        array = new ArrayList<>(size);
    }

    public T dequeue() {
        assert size > 0;
        if(!isEmpty()) return array.remove(0);
        else return null;
    }

    public T element() {
        assert size > 0;
        if(!isEmpty()) return array.get(0);
        else return null;
    }

    public void enqueue(T el) {
        assert el!=null;
        array.add(el);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int size(){
        return array.size();
    }

    public void clear(){
        assert size > 0;
        array.clear();
    }
}
