public class SocketAdapter implements AmericanCharger {
    private EuropeanSocket europeanSocket;

    public SocketAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    @Override
    public void charge() {
        System.out.println("Using Adapter to convert round pins to flat pins...");
        europeanSocket.provideElectricity();
    }
}
