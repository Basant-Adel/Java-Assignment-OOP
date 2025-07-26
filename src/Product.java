//import java.util.UUID;

// 1) class name
public class Product {
    private static int idCounter = 1;

    // 2) private fields

    private final String productId;
    private final String name;
    private double price;
    private int stockQuantity;
    private final String category;

    // 3) constructor

    public Product(String name, double price, int stockQuantity, String category) {
        this.productId = generateUniqueId();
        this.name = name;
        this.price = Math.max(price, 0);
        this.stockQuantity = Math.max(stockQuantity, 0);
        this.category = category;
    }
    private String generateUniqueId() {
        return "Product(" + (idCounter++) + ")";
    }
    /*
    * private String generateUniqueId() {
    *   return UUID.randomUUID().toString();
    * }
    */

    // 4) Getters

    public String getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public String getCategory() {
        return category;
    }

    // 5) Setters

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }

    public void setStockQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Stock quantity cannot be negative.");
        this.stockQuantity = quantity;
    }

    // 6) business logic methods

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            return true;
        }
        return false;
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
    }

    // 7) override toString()

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + name +
                ", Price: $" + price +
                ", Stock: " + stockQuantity +
                ", Category: " + category;
    }
}
