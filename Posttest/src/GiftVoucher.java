public class GiftVoucher implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran dengan Gift Voucher: " + amount);
    }
}