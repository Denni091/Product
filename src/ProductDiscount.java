public class ProductDiscount extends ProductPrice {

    private double discount;

    public ProductDiscount(String name, double quantity, double price, double discount) {
        super(name, quantity, price);
        this.discount = discount;
    }

    public double discount(double quantity, double price, double discount){
        return (quantity * price) * discount;
    }
}
