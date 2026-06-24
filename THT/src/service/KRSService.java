package service;

import model.KRS;
import repository.KRSRepository;
import report.PDFGenerator;

public class KRSService {

    private PrerequisiteValidator validator;
    private KRSRepository repository;
    private PDFGenerator pdfGenerator;

    public KRSService(
            PrerequisiteValidator validator,
            KRSRepository repository,
            PDFGenerator pdfGenerator) {

        this.validator = validator;
        this.repository = repository;
        this.pdfGenerator = pdfGenerator;
    }

    public void prosesKRS(KRS krs) {

        if (validator.validate(krs.getNim())) {

            repository.save(krs);

            pdfGenerator.generate(krs);
        }
    }
}