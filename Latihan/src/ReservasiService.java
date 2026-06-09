public class ReservasiService {

    private KeretaRepository repository;
    private Validator validator;

    public ReservasiService(
            KeretaRepository repository,
            Validator validator) {

        this.repository = repository;
        this.validator = validator;
    }

    public void pesanTiket(
            String kodeKereta,
            Penumpang penumpang,
            int jumlah)

            throws RuteTidakDitemukanException,
            TiketHabisException {

        validator.validasi(penumpang);

        Kereta kereta =
                repository.cariKereta(kodeKereta);

        if (jumlah > kereta.getSisaKursi()) {

            throw new TiketHabisException(
                    kereta.getNama(),
                    kereta.getSisaKursi());
        }

        kereta.kurangiKursi(jumlah);

        System.out.println(
                "Reservasi berhasil");
    }
}