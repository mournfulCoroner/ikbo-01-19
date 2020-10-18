public interface Queue <T>{
    /*Инвариант
      n>=0 (где n - индекс последнего элемента в очереди)
      \-/i = 1..n : ai != null (ai - элемент очереди)*/
    T dequeue();
    T element();
    void enqueue(T el);
    boolean isEmpty();
    int size();
    void clear();
}
