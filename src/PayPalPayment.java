public class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("- Processing PayPal payment of $" + amount);
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber.contains("@");
    }
}