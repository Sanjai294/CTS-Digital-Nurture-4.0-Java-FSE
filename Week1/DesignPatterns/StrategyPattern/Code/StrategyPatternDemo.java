public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        paymentService.makePayment(1000.00);

        paymentService.setStrategy(new PayPalPayment("user@example.com"));
        paymentService.makePayment(250.00);

        paymentService.setStrategy(new UPIPayment("user@upi"));
        paymentService.makePayment(500.00);
    }
}
