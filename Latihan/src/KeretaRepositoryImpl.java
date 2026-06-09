import java.util.ArrayList;
import java.util.List;

public class KeretaRepositoryImpl
        implements KeretaRepository {

    private List<Kereta> daftarKereta;

    public KeretaRepositoryImpl() {

        daftarKereta = new ArrayList<>();

        daftarKereta.add(
                new Kereta(
                        "K01",
                        "Argo Bromo",
                        "JKT-SBY",
                        50));

        daftarKereta.add(
                new Kereta(
                        "K02",
                        "Parahyangan",
                        "JKT-BDG",
                        15));
    }

    @Override
    public Kereta cariKereta(String kode)
            throws RuteTidakDitemukanException {

        for (Kereta k : daftarKereta) {

            if (k.getKode().equalsIgnoreCase(kode)) {
                return k;
            }
        }

        throw new RuteTidakDitemukanException(
                "Kode kereta tidak ditemukan");
    }

    @Override
    public List<Kereta> getSemuaKereta() {
        return daftarKereta;
    }
}