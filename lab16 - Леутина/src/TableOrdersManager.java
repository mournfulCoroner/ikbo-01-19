import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TableOrdersManager implements OrdersManager{
    private static HashMap<Integer, Order> orders = new HashMap<>();
    int size;

    public TableOrdersManager(int amountOfTables){
        size = amountOfTables;
    }

    public boolean add(Order order, int tableNumber){
        try{
            if(orders.containsKey(tableNumber)) throw new OrderAlreadyAddedException();
            orders.put(tableNumber, order);
            return true;
        }
        catch (OrderAlreadyAddedException ex){
            int i = freeTableNumber();
            if(i!=-1) {
                JOptionPane.showMessageDialog(null, "Этот столик уже занят или его не существует, " +
                        "ваш заказ будет распределён на свободный стол " + i + ".", "Извините!", JOptionPane.INFORMATION_MESSAGE);
                orders.put(i, order);
                return true;
            }
            else JOptionPane.showMessageDialog(null, "Приносим свои извинения, но"
                    + "в ресторане нет свободных столов.", "Извините!", JOptionPane.ERROR_MESSAGE);
            return false;

        }
    }

    public void addItem(MenuItem item, int tableNumber){
        if(orders.containsKey(tableNumber)) orders.get(tableNumber).add(item);
        else{
            TableOrder n = new TableOrder();
            n.add(item);
            orders.put(tableNumber, n);
        }
    }

    public int freeTableNumber(){
        int res = -1;
        for(int i = 0; i < size; i++)
        {
            if(!orders.containsKey(i)){
                res = i;
                break;
            }
        }
        return res;
    }

    public int[] freeTableNumbers(){
        int[] n;
        ArrayList<Integer> m = new ArrayList<>();
        for(int i = 0; i < size; i++)
        {
            if(!orders.containsKey(i)) m.add(i);
        }
        n = new int[m.size()];
        for(int i = 0; i < m.size();i++) n[i] = m.get(i);
        return n;
    }

    public Order getOrder(int tableNumber){
        if(!orders.containsKey(tableNumber)) throw new IllegalTableNumber();
        return orders.get(tableNumber);
    }

    public void remove(int tableNumber){
        if(!orders.containsKey(tableNumber)) throw new IllegalTableNumber();
        orders.remove(tableNumber);
    }

    public void remove(Order order){
       for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            if(entry.getValue() == order){
                orders.remove(entry.getKey());
                break;
            }
       }
    }

    public void removeAll(Order order){
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            if(entry.getValue() == order){
                orders.remove(entry.getKey());
            }
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            count+= entry.getValue().itemQuantity(itemName);
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            count+= entry.getValue().itemQuantity(item);
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] or = new Order[orders.size()];
        int i = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
           or[i] = entry.getValue();
           i++;
        }
        return or;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for(Map.Entry<Integer, Order> entry: orders.entrySet()){
            cost += entry.getValue().getCost();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return orders.size();
    }
}
