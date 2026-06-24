package repository;

import model.KRS;

public class MySQLRepository implements KRSRepository {

    @Override
    public void save(KRS krs) {
        System.out.println("Data disimpan ke MySQL");
    }
}