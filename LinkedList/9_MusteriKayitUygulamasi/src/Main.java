import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MusteriLinkedList musteri = new MusteriLinkedList();
        Scanner input = new Scanner(System.in);
        int secim = -1;

        while (secim != 0) {
            System.out.println("\n=== MÜŞTERİ MENÜSÜ ===");
            System.out.println("1 - Müşteri Ekle");
            System.out.println("2 - Müşteri Sil");
            System.out.println("3 - Müşteri Ürün Güncelle");
            System.out.println("4 - Müşteri Ara");
            System.out.println("5 - Müşteri Bilgilerini Göster");
            System.out.println("6 - Tüm Müşterileri Listele");
            System.out.println("7 - Toplam Müşteri Sayısı");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Seçiminiz: ");

            secim = input.nextInt();
            input.nextLine(); // buffer temizleme

            switch (secim) {
                case 1:
                    System.out.println("Eklenecek Müşterinin Bilgilerini Giriniz:");
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Ad: ");
                    String ad = input.nextLine();
                    System.out.print("Soyad: ");
                    String soyad = input.nextLine();
                    System.out.print("Telefon No: ");
                    String telNo = input.nextLine();
                    System.out.print("Adres: ");
                    String adres = input.nextLine();
                    System.out.print("Ürün: ");
                    String urun = input.nextLine();

                    musteri.musteriEkle(id, ad, soyad, telNo, adres, urun);
                    break;

                case 2:
                    System.out.print("Silinecek Müşterinin ID'sini giriniz: ");
                    id = input.nextInt();
                    musteri.musteriSilme(id);
                    break;

                case 3:
                    System.out.print("Ürünü Güncellenecek Müşterinin ID'sini giriniz: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Yeni Ürün Adı: ");
                    String yeniUrun = input.nextLine();
                    musteri.musteriGuncelle(id, yeniUrun);
                    break;

                case 4:
                    System.out.print("Aranacak Müşterinin ID'sini giriniz: ");
                    id = input.nextInt();
                    musteri.musteriAra(id);
                    break;

                case 5:
                    System.out.print("Bilgileri Yazdırılacak Müşterinin ID'sini giriniz: ");
                    id = input.nextInt();
                    musteri.musteriBilgileriniYazdir(id);
                    break;

                case 6:
                    musteri.musteriListele();
                    break;

                case 7:
                    musteri.kacMusteriVar();
                    break;

                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }

        input.close();
    }
}
