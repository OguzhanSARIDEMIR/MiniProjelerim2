package appPack;

public class Fizyoterapist extends Calisanlar {

    Fizyoterapist(int calisanId) {
        super(calisanId);
    }

    Fizyoterapist(int calisanId, String calisanAd) {
        super(calisanId, calisanAd);
    }

    Fizyoterapist(int calisanId, String calisanAd, String calisanSoyad) {
        super(calisanId, calisanAd, calisanSoyad);
    }

    public void isYap() {
        System.out.println("Tedavi Programi Uygulaniyor....");
    }

}