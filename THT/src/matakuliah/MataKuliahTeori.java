package matakuliah;

public class MataKuliahTeori implements MataKuliah {

    private String nama;
    private int sks;

    public MataKuliahTeori(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getSKS() {
        return sks;
    }
}