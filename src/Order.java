import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Order> orders = new ArrayList<>();
    public String id;
    public double itemPrice, itemCount, shipping_cost = 10;
    public Order(String id, double itemPrice, double itemCount) {
        this.id = id;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
    }
    public void attach(Order order){
        orders.add(order);
    }
    public void detach(Order order){
        orders.remove(order);
    }
    public double getTotalPrice(){
        return this.itemPrice;
    }
    public double getCount(){
        return this.itemCount;
    }
    public void addItem(double price, double count){
        this.itemPrice = price; //updating the price
        PriceObserver po = new PriceObserver();
        po.update(this); //calculations are done in the PriceObserver class
        this.itemCount = count;
        QuantityObserver qo = new QuantityObserver();
        qo.update(this); //calculations are done in the PriceObserver class
    }
    @Override
    public String toString(){
        return "";
    }
}