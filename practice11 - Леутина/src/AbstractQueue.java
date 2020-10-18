public abstract class AbstractQueue <T> implements Queue <T>{
    public abstract T dequeue();
    public abstract T element();
    public abstract  void enqueue(T el);
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract  void clear();
}
