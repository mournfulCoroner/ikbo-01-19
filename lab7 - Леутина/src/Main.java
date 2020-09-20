import java.util.LinkedList;

/*2. Протестировать работу коллекции LinkedList*/
public class Main {
    public static void main(String[] args) {
        LinkedList<String> collection = new LinkedList<>();
        collection.add("Pen");
        collection.add("Aqua");
        collection.addFirst("Moon");
        collection.addLast("Rain");

        for (String s: collection) {
            System.out.println(s);
        }
        System.out.println("+++");
        collection.removeFirst();
        collection.removeLast();

        for (String s: collection) {
            System.out.println(s);
        }
        System.out.println("+++");
        System.out.println(collection.getFirst());
        System.out.println(collection.getLast());
    }
}
