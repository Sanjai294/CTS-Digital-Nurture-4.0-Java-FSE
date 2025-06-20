public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.setPartA("Part A");
    }

    public void buildPartB() {
        product.setPartB("Part B");
    }

    public Product getResult() {
        return product;
    }
}
