class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product(int productId, String productName, double price, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Assign a valid price");
        }
    }

    public void sellProduct(int amount) {

        if (amount <= 0) {
            System.out.println("Enter valid stock amount");
        }

        else if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " item(s) sold");
        }

        else {
            System.out.println("Not enough stock available");
        }
    }

    public void displayProduct() {

        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

public class ProductInventorySystem {

    public static void main(String[] args) {

        Product details = new Product(1001, "HP", 15000, 10);

        details.displayProduct();

        details.sellProduct(5);

        System.out.println("\nAfter selling:");

        details.displayProduct();
    }
}