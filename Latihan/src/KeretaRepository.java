import java.util.List;

public interface KeretaRepository {

    Kereta cariKereta(String kode)
            throws RuteTidakDitemukanException;

    List<Kereta> getSemuaKereta();
}