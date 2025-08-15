import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OgrenciListe bilgisayarBolumu = new OgrenciListe();
        Scanner scanner = new Scanner(System.in);

        int secim = -1;

        while (secim != 0) {
            System.out.println("\nBilgisayar Bölümü Öğrenci Kayıt Uygulaması");
            System.out.println("1 - Yeni Kayıt");
            System.out.println("2 - Kayıt Sil");
            System.out.println("3 - Kayıtları Listele");
            System.out.println("4 - En Başarılı Öğrenci");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Seçiminizi giriniz: ");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bilgisayarBolumu.ogrenciEkle();
                    break;
                case 2:
                    bilgisayarBolumu.ogrenciSil();
                    break;
                case 3:
                    bilgisayarBolumu.ogrenciListele();
                    break;
                case 4:
                    bilgisayarBolumu.enBasariliOgrenci();
                    break;
                case 0:
                    System.out.println("Program kapatılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        }
    }
}
