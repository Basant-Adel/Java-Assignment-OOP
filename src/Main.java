import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Simple E-Commerce System!");

        List<Product> products = new ArrayList<>();

        Product p1 = new ElectronicProduct("Samsung Galaxy", 1999.99, 10, "Electronics", 24);
        Product p2 = new BookProduct("Java Basics", 32.26, 5, "Books", "Laura Lemay");
        Product p3 = new Product("Meat",43.96,0,"Food");

        products.add(p1);
        products.add(p2);
        products.add(p3);

        System.out.println("\n==== Product List ====");
        for (Product product : products) {
            System.out.println(product);
        }

        // Simple E-Commerce System
        // User System

        System.out.println("\n==== User System ====");
        Customer customer1 = new Customer("Customer(1)", "Adel", "adel@customer.com");
        Customer customer2 = new Customer("Customer(2)", "Hamed", "hamed@customer.com");
        Admin admin = new Admin("Admin(1)", "Mohamed", "mohamed@admin.com");

        System.out.println(customer1.getUserDetails());
        System.out.println(customer2.getUserDetails());
        System.out.println(admin.getUserDetails());

        customer1.placeOrder("Product(1)");
        customer2.placeOrder(" ", -2);

        admin.updateProduct(p1, 899.99);

        // Payments

        System.out.println("\n==== Payments ====");
        Payment credit = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        credit.processPayment(100);
        paypal.processPayment(200);

    }
}