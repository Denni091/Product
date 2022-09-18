
import java.util.Scanner;

public class App {

    static String name;
    static double quantity;
    static double price;
    static double priceProduct;
    static double discount;
    static double discountProduct;
    static double finalPrice;
    static Scanner scanner;

    public static void main(String[] args) {
        setInfo();
        setScanner();
        calcProduct();
        cheque();
    }

    public static void setInfo() {

        System.out.println("Good evening in our shop!Please write product information"
                + "\n---------------------------------------------------------");
    }

    public static void setScanner() {

        scanner = new Scanner(System.in);
        System.out.print("Write product name: ");
        name = scanner.nextLine();

        System.out.print("Write " + name + " quantity (UAH): ");
        quantity = Double.parseDouble(scanner.nextLine());

        System.out.print("Write " + name + " price (UAH): ");
        price = Double.parseDouble(scanner.nextLine());

        System.out.print("Write " + name + " discount (UAH): ");
        discount = Double.parseDouble(scanner.nextLine());

        scanner.close();
    }

    public static void calcProduct() {

        ProductPrice productPrice = new ProductPrice();
        priceProduct = productPrice.productPrice(quantity, price);

        ProductDiscount productDiscount = new ProductDiscount();
        discountProduct = productDiscount.discount(quantity, price, discount);

        finalPrice = priceProduct - discountProduct;
    }

    public static void cheque() {

        System.out.println(
                "\nProduct name: " + name
                        + "\nProduct price: " + priceProduct + " UAH"
                        + "\nDiscount: " + discountProduct + " UAH"
                        + "\nFinal Price: " + finalPrice + " UAH"
                        + "\n---------------------------------------------------------"
                        + "\nHave a nice day :)");
    }
}
