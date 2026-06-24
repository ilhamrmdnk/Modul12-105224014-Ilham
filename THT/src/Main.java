import model.KRS;
import report.PDFGenerator;
import repository.KRSRepository;
import repository.NoSQLRepository;
import service.KRSService;
import service.PrerequisiteValidator;
import service.UKTCalculator;
import strategy.MBKMStrategy;

public class Main {

    public static void main(String[] args) {

        KRS krs = new KRS("105224014", 20);

        UKTCalculator calculator =
                new UKTCalculator(
                        new MBKMStrategy());

        double ukt =
                calculator.calculate(
                        krs.getTotalSKS());

        System.out.println(
                "Total UKT = " + ukt);

        KRSRepository repository =
                new NoSQLRepository();

        KRSService service =
                new KRSService(
                        new PrerequisiteValidator(),
                        repository,
                        new PDFGenerator());

        service.prosesKRS(krs);
    }
}