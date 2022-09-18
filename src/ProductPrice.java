public class ProductPrice extends Product {

    public ProductPrice() {
    }

    public ProductPrice(String name, double quantity, double price) {
        super(name, quantity, price);
    }

    public double productPrice(double quantity, double price) {
        return quantity * price;
    }
}
