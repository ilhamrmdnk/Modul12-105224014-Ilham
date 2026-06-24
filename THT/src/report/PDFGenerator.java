package report;

import model.KRS;

public class PDFGenerator {

    public void generate(KRS krs) {
        System.out.println(
            "Membuat PDF KRS untuk " + krs.getNim()
        );
    }
}