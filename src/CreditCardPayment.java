public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("- Processing credit card payment of $" + amount);
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber != null && cardNumber.length() == 16;
    }
}