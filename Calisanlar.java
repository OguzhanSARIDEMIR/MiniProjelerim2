package appPack;

public class Calisanlar {

    public int calisanId;
    public String calisanAd, calisanSoyad;

    Calisanlar(int calisanId) {
        this.calisanId = calisanId;
    }

    Calisanlar(int calisanId, String calisanAd) {
        this.calisanId = calisanId;
        this.calisanAd = calisanAd;

    }

    Calisanlar(int calisanId, String calisanAd, String calisanSoyad) {
        this.calisanId = calisanId;
        this.calisanAd = calisanAd;
        this.calisanSoyad = calisanSoyad;
    }

    public void isYap() {
        System.out.println(" is yapiliyor...");
    }

}