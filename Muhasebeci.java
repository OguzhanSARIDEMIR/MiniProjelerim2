package appPack;

public class Muhasebeci extends Calisanlar {

    Muhasebeci(int calisanId) {
        super(calisanId);
    }

    Muhasebeci(int calisanId, String calisanAd) {
        super(calisanId, calisanAd);
    }

    Muhasebeci(int calisanId, String calisanAd, String calisanSoyad) {
        super(calisanId, calisanAd, calisanSoyad);
    }



    public void isYap() {
        System.out.println("Finansal Takip Yapiliyor..");
    }

}
