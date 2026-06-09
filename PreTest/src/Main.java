// Main
public class Main {
    public static void main(String[] args) {

        FineCalculator calculator = new StandardFineCalculator();
        FineService fineService = new FineService(calculator);

        double fine = fineService.getFine(3);

        ReceiptFormatter formatter = new TableReceiptFormatter();
        ReceiptService receiptService = new ReceiptService(formatter);

        receiptService.printReceipt(fine);
    }
}