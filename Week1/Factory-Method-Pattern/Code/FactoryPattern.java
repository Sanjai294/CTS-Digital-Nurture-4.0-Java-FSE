public class FactoryPattern {
    public static void main(String[] args) {
        Logistics bikeLogistics = new BikeLogistics();
        Transport bike = bikeLogistics.createTransport();
        bike.deliver();

        Logistics truckLogistics = new TruckLogistics();
        Transport truck = truckLogistics.createTransport();
        truck.deliver();
    }
}
