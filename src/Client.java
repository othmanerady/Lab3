import java.util.ArrayList;
import java.util.List;

public class Client extends Order{
    public List<Order> orders = new ArrayList<>();
        public Client(String id, int itemPrice, int itemCount) {
        super(id, itemPrice, itemCount);
    }
}
