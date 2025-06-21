import java.util.*;
import java.time.LocalDate;

public class OrderManager {
    private List<CustomerOrder> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(CustomerOrder order) {
        orders.add(order);
    }

    public List<CustomerOrder> getOrdersSortedByDate() {
        List<CustomerOrder> sorted = new ArrayList<>(orders);
        sorted.sort(Comparator.comparing(CustomerOrder::getOrderDate));
        return sorted;
    }

    public List<CustomerOrder> getOrdersSortedByAmountDesc() {
        List<CustomerOrder> sorted = new ArrayList<>(orders);
        sorted.sort(Comparator.comparing(CustomerOrder::getOrderAmount).reversed());
        return sorted;
    }

    public List<CustomerOrder> getOrdersSortedByCustomerName() {
        List<CustomerOrder> sorted = new ArrayList<>(orders);
        sorted.sort(Comparator.comparing(CustomerOrder::getCustomerName));
        return sorted;
    }

    public List<CustomerOrder> getAllOrders() {
        return new ArrayList<>(orders);
    }
}
