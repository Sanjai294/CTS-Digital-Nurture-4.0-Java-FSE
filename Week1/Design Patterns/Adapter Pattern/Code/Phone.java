public class Phone {
    private AmericanCharger charger;

    public Phone(AmericanCharger charger) {
        this.charger = charger;
    }

    public void chargePhone() {
        System.out.println("Phone is trying to charge...");
        charger.charge();
        System.out.println("Phone is charging...");
    }
}
