import java.util.LinkedList;

public class TestQueue {
    public static void main(String[] args) {
        ArrayQueueADT<Integer> ar1 = new ArrayQueueADT<>();
        for(int i = 0; i < 5; i++) ar1.enqueue(ar1, i);
        System.out.println(ar1.dequeue(ar1));
        System.out.println(ar1.dequeue(ar1));
        ar1.clear(ar1);
        System.out.println(ar1.isEmpty(ar1));

        ArrayQueueModule ar2 = new ArrayQueueModule();
        for(int i = 6; i < 10; i++) ar2.enqueue(i);
        System.out.println(ar2.dequeue());
        System.out.println(ar2.dequeue());
        ar2.clear();
        System.out.println(ar2.isEmpty());

        ArrayQueue<Integer> ar3 = new ArrayQueue<>(5);
        for(int i = 8; i < 12; i++) ar3.enqueue(i);
        System.out.println(ar3.dequeue());
        System.out.println(ar3.dequeue());
        ar3.clear();
        System.out.println(ar3.isEmpty());

        LinkedQueue<Integer> ar4 = new LinkedQueue<>(5);
        for(int i = 12; i < 16; i++) ar4.enqueue(i);
        System.out.println(ar4.dequeue());
        System.out.println(ar4.dequeue());
        ar4.clear();
        System.out.println(ar4.isEmpty());
    }
}
