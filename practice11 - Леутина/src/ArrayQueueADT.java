import java.util.ArrayList;

public class ArrayQueueADT <T> {
    private int size;
    private ArrayList<T> array = new ArrayList<>(10);

    public Object dequeue(ArrayQueueADT qu) {
        assert size > 0;
        if(!isEmpty(qu)) return qu.array.remove(0);
        else return null;
    }

    public Object element(ArrayQueueADT qu) {
        assert size > 0;
        if(!isEmpty(qu)) return qu.array.get(0);
        else return null;
    }

    public void enqueue(ArrayQueueADT qu, T el) {
        assert el!=null;
        qu.array.add(el);
    }

    public boolean isEmpty(ArrayQueueADT qu) {
        return qu.array.isEmpty();
    }

    public int size(ArrayQueueADT qu){
        return qu.array.size();
    }

    public void clear(ArrayQueueADT qu){
        assert size > 0;
        qu.array.clear();
    }
}
