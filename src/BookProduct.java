public class BookProduct extends Product {
    private final String author;

    public BookProduct(String name, double price, int stockQuantity, String category, String author) {
        super(name, price, stockQuantity, category);
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author name cannot be null or empty.");
        }
        this.author = author.trim();
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}
