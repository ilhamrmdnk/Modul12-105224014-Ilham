package matakuliah;

public class MataKuliahKKN implements MataKuliah {

    private String nama;
    private int sks;

    public MataKuliahKKN(String nama, int sks) {
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