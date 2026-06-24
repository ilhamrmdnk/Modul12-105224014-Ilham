package repository;

import model.KRS;

public class NoSQLRepository implements KRSRepository {

    @Override
    public void save(KRS krs) {
        System.out.println("Data disimpan ke Cloud NoSQL");
    }
}