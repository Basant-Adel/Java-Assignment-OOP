public class Customer extends User {

    public Customer(String userId, String username, String email) {
        super(userId, username, email);
    }

    public void placeOrder(String productId) {
        if (productId == null || productId.trim().isEmpty()) {
            System.out.println("❌ Invalid product ID. Cannot place order.");
            return;
        }
        System.out.println("- Customer " + username + " placed an order for Product ID: " + productId);
    }

    public void placeOrder(String productId, int quantity) {
        if (productId == null || productId.trim().isEmpty() || quantity <= 0) {
            System.out.println("❌ Invalid order details. Product ID must not be empty and quantity must be positive.");
            return;
        }
        System.out.println("- Customer " + username + " placed an order for " + quantity + " unit(s) of Product ID: " + productId);
    }

    @Override
    public String getUserDetails() {
        return "[Customer] " + super.getUserDetails();
    }
}
