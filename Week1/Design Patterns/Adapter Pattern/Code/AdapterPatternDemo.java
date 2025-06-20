public class AdapterPatternDemo {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket();
        AmericanCharger adapter = new SocketAdapter(europeanSocket);

        Phone phone = new Phone(adapter);
        phone.chargePhone();
    }
}
