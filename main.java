package appPack;

public class main {

    public static void main(String[] args) {

        Muhasebeci M1 = new Muhasebeci(1, "Oguzhan", "Saridemir");
        Muhasebeci M2 = new Muhasebeci(2, "Cemil");
        Muhasebeci M3 = new Muhasebeci(3);

        System.out.print(M1.calisanId + " id'li " + M1.calisanAd + " " + M1.calisanSoyad
                + " tarafindan ");
        M1.isYap();
        System.out.println(" ve ayni zamanda " + M2.calisanId + " id'li " + M2.calisanAd
                + " adli kisinin evraki " + M3.calisanId + " id'li kisiye gonderilecektir..");

        Fizyoterapist F1 = new Fizyoterapist(4, "Mahmut", "yesil");
        Fizyoterapist F2 = new Fizyoterapist(5, "Beyza", "Gungor");
        Fizyoterapist F3 = new Fizyoterapist(6, "Orhan");
        System.out.println("Doktorlarimizdan " + F1.calisanId + " id'li " + F1.calisanAd + " "
                + F1.calisanSoyad + " ve " + F2.calisanId + " id'li " + F2.calisanAd
                + " " + F2.calisanSoyad + " ile beraber hastalara ");
        F1.isYap();
        System.out.println(F3.calisanId + " id'li bas hekime bilgi verilecek..");

        Calisanlar calisanlar1 = new Calisanlar(M1.calisanId, M1.calisanAd, M1.calisanSoyad);
        Calisanlar calisanlar2 = new Calisanlar(M2.calisanId, M2.calisanAd);
        Calisanlar calisanlar3 = new Calisanlar(M3.calisanId);
        Calisanlar calisanlar4 = new Calisanlar(F1.calisanId, F1.calisanAd,
                F1.calisanSoyad);
        Calisanlar calisanlar5 = new Calisanlar(F2.calisanId, F2.calisanAd,
                F2.calisanSoyad);
        Calisanlar calisanlar6 = new Calisanlar(F3.calisanId);
        System.out.println();
        System.out.println();
        System.out.println("*****Veri Tabanina Ekleme*****");
        System.out.print(M1.calisanId + " id li  kisi tarafindan ");
        calisanlar1.isYap();
        System.out.print(calisanlar2.calisanId + " id li kisi tarafindan ");
        calisanlar2.isYap();
        System.out.print(calisanlar3.calisanId + " id li kisi tarafindan ");
        calisanlar3.isYap();
        System.out.print(calisanlar4.calisanId + " id li kisi tarafindan ");
        calisanlar4.isYap();
        System.out.print(calisanlar5.calisanId + " id li kisi tarafindan ");
        calisanlar5.isYap();
        System.out.print(calisanlar6.calisanId + " id li kisi tarafindan ");
        calisanlar6.isYap();

    }

}