public class Admin extends User {

    public Admin(String userId, String username, String email) {
        super(userId, username, email);
    }

    public void updateProduct(Product product, double newPrice) {
        if (product == null) {
            System.out.println("❌ Cannot update: Product is null.");
            return;
        }

        if (newPrice < 0) {
            System.out.println("❌ Invalid price. Price must be non-negative.");
            return;
        }

        double oldPrice = product.getPrice();
        product.setPrice(newPrice);
        System.out.println("✅ Admin " + username + " updated " + product.getName() + " price from $" + oldPrice + " to $" + newPrice);
    }

    @Override
    public String getUserDetails() {
        return "[Admin] " + super.getUserDetails();
    }
}
