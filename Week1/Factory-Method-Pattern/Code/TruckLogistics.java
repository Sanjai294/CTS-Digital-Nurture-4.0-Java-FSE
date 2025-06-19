public class TruckLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
