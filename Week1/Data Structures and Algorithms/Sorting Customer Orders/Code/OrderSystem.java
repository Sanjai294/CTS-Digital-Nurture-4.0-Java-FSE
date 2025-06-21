import java.time.LocalDate;
import java.util.List;

public class OrderSystem {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        manager.addOrder(new CustomerOrder("O001", "Zara", LocalDate.of(2024, 12, 10), 1800.0));
        manager.addOrder(new CustomerOrder("O002", "Alan", LocalDate.of(2024, 9, 21), 950.0));
        manager.addOrder(new CustomerOrder("O003", "Priya", LocalDate.of(2024, 11, 5), 2300.0));
        manager.addOrder(new CustomerOrder("O004", "Ben", LocalDate.of(2024, 10, 12), 1500.0));

        System.out.println("Sorted by Order Date:");
        printOrders(manager.getOrdersSortedByDate());

        System.out.println("\nSorted by Order Amount (High to Low):");
        printOrders(manager.getOrdersSortedByAmountDesc());

        System.out.println("\nSorted by Customer Name:");
        printOrders(manager.getOrdersSortedByCustomerName());
    }

    private static void printOrders(List<CustomerOrder> orders) {
        for (CustomerOrder order : orders) {
            System.out.println(order);
        }
    }
}
