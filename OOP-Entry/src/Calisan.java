import java.util.Scanner;

public class Calisan {
    private String ad;
    private String soyad;
    private int id;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calisan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    public void bilgileriGoster() {
        System.out.println("Çalışan Bilgileri....");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("Id : " + id);
        
    }
    
}

class Yazilimci extends  Calisan{
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller;
        
    }
    public void formatAt(String isletim_sistemi) {
        
        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının Bildiği Diller :" + diller);
        
    }
    
}

class Yonetici extends Calisan {
    private double sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, double sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = (double) sorumlu_kisi_sayisi;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı : " + sorumlu_kisi_sayisi);

    }
    public void zamYap(int zamMiktari) {
        
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapıyor...");
    } 
    
}

class  Operation{
    public static void main(String[] args) {
        /*
        Çalışanlar Programı
        
        Calisan Sınıfı Şeklinde Bir Üst Sınıf
        
        Calisan Sınıfından Türeyen Yazilimci adında Bir Alt Sınıf
        Calisan Sınıfından Türeyen Yonetici adında Bir Alt Sınıf

        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====================================\n"
		                  +"Çalışanlar Programına Hoşgeldiniz...");
        String islemler = "---- İşlemler ----\n"
                          + "1. Yazılımcı İşlemleri\n"
                          + "2. Yönetici İşlemleri\n"
                          + "Çıkış İçin q'ya basın";
        System.out.println("=====================================");
        System.out.println(islemler);
        System.out.println("=====================================");
        
        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
                
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Musap","Aşkın", 19467,"Python,C++,Java");
                String yazilimci_islem = "------------------------\n"
				                         +"1. Format At\n"
                                         +"2. Bilgileri Göster\n"
                                         + "Çıkış için q'ya basın\n"
										 +"------------------------";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
                    
                }
                
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Elon","Musk", 1971, 71.907);
                
                String yonetici_islem = "------------------------\n"
				                        +"Yönetici İşlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için q'ya basın\n"
										+"------------------------";
										
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                        
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                        
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                        
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Geçersiz İşlem....");
            }
            
            
        }
        
        
    }
}
