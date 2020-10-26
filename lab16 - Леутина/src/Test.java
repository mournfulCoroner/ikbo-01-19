import java.util.Arrays;

public class Test {
    public static void main(String[] args)  {
        TableOrdersManager manager = new TableOrdersManager(10);
        TableOrder order = new TableOrder();
        order.add(new Dish(5,"g","n"));
        manager.add(order, 5);
        manager.add(new TableOrder(), 5);
        TableOrder or = (TableOrder)manager.getOrder(5);
        System.out.println(Arrays.toString(or.getItems()));
        manager.getOrder(7);
    }
}
