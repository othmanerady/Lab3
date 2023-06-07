public class PriceObserver implements OrderObserver{
//    private double price;
    public void update(Order order){
        if (order.itemPrice >= 200)
            order.itemPrice -= 20;
    }
}