public class CreditCard implements PaymentMethod, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran Credit Card: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund Credit Card: " + amount);
    }
}