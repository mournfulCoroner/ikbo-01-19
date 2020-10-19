import java.util.HashMap;
import java.util.Map;

public class OrderManager implements OrdersManager {

    private HashMap<Address, Order> orders = new HashMap<>();

    public void add(Address address, Order order) throws OrderAlreadyAddedException {
        try{
            if(orders.containsKey(address)) throw new OrderAlreadyAddedException();
            orders.put(address, order);
        }
        catch (OrderAlreadyAddedException ex){
            System.out.println("У этого адреса уже есть заказ");
        }

    }
    public void add(Address address) throws OrderAlreadyAddedException {
        if(orders.containsKey(address)) throw new OrderAlreadyAddedException();
        orders.put(address, new InternetOrder());
    }

    public void remove(Address address){
        orders.remove(address);
    }

    public void addToOrder(Address address, MenuItem item){
        orders.get(address).add(item);
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for(Map.Entry<Address, Order> entry: orders.entrySet()){
            count+= entry.getValue().itemQuantity(itemName);
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for(Map.Entry<Address, Order> entry: orders.entrySet()){
            count+= entry.getValue().itemQuantity(item);
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] or = new Order[orders.size()];
        int i = 0;
        for(Map.Entry<Address, Order> entry: orders.entrySet()){
            or[i] = entry.getValue();
            i++;
        }
        return or;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for(Map.Entry<Address, Order> entry: orders.entrySet()){
            cost += entry.getValue().getCost();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return orders.size();
    }
}
