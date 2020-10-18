import java.util.ArrayList;

public class ArrayQueueModule {

    private static int size;
    private static ArrayList<Object> array = new ArrayList<>(10);

    public Object dequeue() {
        assert size > 0;
        if (!isEmpty()) return array.remove(0);
        else return null;
    }

    public Object element() {
        assert size > 0;
        if (!isEmpty()) return array.get(0);
        else return null;
    }

    public void enqueue(Object el) {
        assert el != null;
        array.add(el);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int size() {
        return array.size();
    }

    public void clear() {
        assert size > 0;
        array.clear();
    }
}
