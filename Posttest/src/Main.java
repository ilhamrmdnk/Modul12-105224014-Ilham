public class Main {

    public static void main(String[] args) {

        PaymentMethod payment = new OVO();

        EmailNotifier notifier = new EmailSystem();

        OrderRepository repository =
                new OrderRepository();

        OrderService service =
                new OrderService(
                        payment,
                        notifier,
                        repository);

        service.createOrder("ORD001", 500000);
    }
}