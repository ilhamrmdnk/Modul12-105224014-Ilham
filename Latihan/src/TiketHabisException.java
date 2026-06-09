public class TiketHabisException
        extends Exception {

    public TiketHabisException(
            String namaKereta,
            int sisaKursi) {

        super(
                "Tiket untuk kereta "
                        + namaKereta
                        + " tidak mencukupi. Sisa kursi hanya "
                        + sisaKursi);
    }
}