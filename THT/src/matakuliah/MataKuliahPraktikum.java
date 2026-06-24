package matakuliah;

public class MataKuliahPraktikum implements MataKuliah, Praktikum {

    private String nama;
    private int sks;

    public MataKuliahPraktikum(String nama, int sks) {
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

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Asisten lab dialokasikan");
    }

    @Override
    public void cekPeralatan() {
        System.out.println("Peralatan diperiksa");
    }
}