// Implementasi aturan denda premium (contoh perubahan aturan)
public class PremiumFineCalculator implements FineCalculator {

    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 3000;
    }
}