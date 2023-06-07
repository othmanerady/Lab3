public class QuantityObserver implements OrderObserver{
    public void update(Order order) {
        if (order.itemCount > 5)
            order.shipping_cost = 0;
    }
}