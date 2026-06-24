package model;

public class KRS {
    private String nim;
    private int totalSKS;

    public KRS(String nim, int totalSKS) {
        this.nim = nim;
        this.totalSKS = totalSKS;
    }

    public String getNim() {
        return nim;
    }

    public int getTotalSKS() {
        return totalSKS;
    }
}