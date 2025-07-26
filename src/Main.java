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
    }
}