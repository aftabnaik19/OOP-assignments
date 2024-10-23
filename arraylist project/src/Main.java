import java.util.List;
import java.util.ArrayList;

class Order {
    //private
    int orderId;
    List<String> itemNames;
    boolean cashOnDelivery;


    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
        this.orderId = orderId;
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;
    }
}

class Tester {
    public static List<String> getItems(List<Order> orders) {

        List<String> items = new ArrayList<String>();

        for( Order order:orders){

            items.addAll(order.itemNames);
        }
        return items;
    }

    public static void main(String[] args) {


        List<String> items1 = new ArrayList<String>();
        items1.add("Jeans");
        items1.add("Shirt");
        items1.add("Belt");
        //orders.add(new Order(101, items1, true));

        List<String> items2 = new ArrayList<String>();
        items2.add("Tie");
        items2.add("Shirt");
        items2.add("Belt");
        items2.add("Belt");
        //orders.add(new Order(102, items2, true));

        List<String> items3 = new ArrayList<String>();
        items3.add("Tshirt");
        items3.add("Socks");
        items3.add("Tie");
        //orders.add(new Order(103, items3, true));


        Order o1=new Order(101, items1, true);
        Order o2=new Order(102, items2, true);
        Order o3=new Order(103, items3, true);

        List<Order> orders = new ArrayList<Order>();
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        List<String> items = getItems(orders);
        System.out.println(items);
    }
}

















