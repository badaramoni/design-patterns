import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Order> orderList = new ArrayList<Order>();



    public void Wheels_Manufacturer_Order(Order order){
        orderList.add(order);
    }

    public void Wheels_Recycling_Wheels(Order order){
        orderList.add(order);
    }

    public void Start_production_orders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
