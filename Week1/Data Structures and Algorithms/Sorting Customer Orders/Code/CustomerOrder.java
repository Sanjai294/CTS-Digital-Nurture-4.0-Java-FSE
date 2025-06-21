import java.time.LocalDate;

public class CustomerOrder {
    private String orderId;
    private String customerName;
    private LocalDate orderDate;
    private double orderAmount;

    public CustomerOrder(String orderId, String customerName, LocalDate orderDate, double orderAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName +
                ", Date: " + orderDate + ", Amount: $" + orderAmount;
    }
}
