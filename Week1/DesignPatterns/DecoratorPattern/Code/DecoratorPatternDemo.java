public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee);
        myCoffee = new WhippedCreamDecorator(myCoffee);

        System.out.println("Order: " + myCoffee.getDescription());
        System.out.println("Total Cost: $" + myCoffee.getCost());
    }
}
