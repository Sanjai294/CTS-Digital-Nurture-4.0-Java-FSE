public class BuilderPatternDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(builder);

        Product product = builder.getResult();
        product.show();
    }
}
