// Format teks biasa
public class TextReceiptFormatter implements ReceiptFormatter {

    @Override
    public String formatReceipt(double fine) {
        return "Total Denda : Rp " + fine;
    }
}