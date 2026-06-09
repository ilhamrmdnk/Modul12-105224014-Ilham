// Mengelola denda dengan dependency abstraction
public class FineService {

    private FineCalculator fineCalculator;

    public FineService(FineCalculator fineCalculator) {
        this.fineCalculator = fineCalculator;
    }

    public double getFine(int lateDays) {
        return fineCalculator.calculateFine(lateDays);
    }
}