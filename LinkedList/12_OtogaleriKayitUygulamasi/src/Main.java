import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedListOtogaleri otogaleri = new LinkedListOtogaleri();

        int secim = -1;
        int index;
        while(secim != 0){
            System.out.println("1 - Basa Otomobil Ekle");
            System.out.println("2 - Sona Otomobil Ekle");
            System.out.println("3 - Araya Otomobil Ekle");
            System.out.println("4 - Bastan Otomobil Sil");
            System.out.println("5 - Sondan Otomobil Sil");
            System.out.println("6 - Aradan Otomobil Sil");
            System.out.println("7 - Otomobil Listele");
            System.out.println("8 - En Pahali Otomobili Getir");
            System.out.println("9 - Otomobil Ara");
            System.out.println("0 - Cikis Yap");
            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    otogaleri.basaOtomobilEkle();
                    break;
                case 2:
                    otogaleri.sonaOtomobilEkle();
                    break;
                case 3:
                    System.out.print("Kacinci index'e otomobil'i eklemek istiyorsunuz?: ");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    otogaleri.arayaOtomobilEkle(index);
                    break;
                case 4:
                    otogaleri.bastanOtomobilSil();
                    break;
                case 5:
                    otogaleri.sondanOtomobilSil();
                    break;
                case 6:
                    System.out.print("Kacinci index'teki otomobil'i silmek istiyorsunuz?: ");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    otogaleri.aradanOtomobilSil(index);
                    break;
                case 7:
                    otogaleri.otomobilListele();
                    break;
                case 8:
                    otogaleri.enPahaliOtomobiliGetir();
                    break;
                case 9:
                    System.out.print("Aramak istediginiz aracin plakasini giriniz: ");
                    scanner.nextLine();
                    String plaka = scanner.nextLine();
                    otogaleri.aracAra(plaka);
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor..");
                    break;
                default:
                    System.out.println("Yanlis tuslama yaptiniz!");
                    break;
            }
        }
    }
}
