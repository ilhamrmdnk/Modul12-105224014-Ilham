// Mencetak struk menggunakan formatter yang dipilih
public class ReceiptService {

    private ReceiptFormatter formatter;

    public ReceiptService(ReceiptFormatter formatter) {
        this.formatter = formatter;
    }

    public void printReceipt(double fine) {
        System.out.println(formatter.formatReceipt(fine));
    }
}