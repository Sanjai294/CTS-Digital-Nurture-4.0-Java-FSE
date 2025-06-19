public class BikeLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Bike();
    }
}
