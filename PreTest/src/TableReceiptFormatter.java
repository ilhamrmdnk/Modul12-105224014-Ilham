// Format tabel
public class TableReceiptFormatter implements ReceiptFormatter {

    @Override
    public String formatReceipt(double fine) {
        return "====================\n"
             + "| Total Denda | " + fine + " |\n"
             + "====================";
    }
}