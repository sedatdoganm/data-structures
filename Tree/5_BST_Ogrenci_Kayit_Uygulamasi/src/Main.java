import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BSTree ogrenciAgaci = new BSTree();
        Scanner sc = new Scanner(System.in);

        int secim;
        do {
            System.out.println("\n--- ÖĞRENCİ AĞACI MENÜ ---");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Sil");
            System.out.println("3. Öğrencileri Listele (InOrder)");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Öğrenci No: ");
                    int no = sc.nextInt();
                    System.out.print("Öğrenci Not: ");
                    int not = sc.nextInt();
                    sc.nextLine(); // buffer temizle
                    System.out.print("Öğrenci Adı: ");
                    String ad = sc.nextLine();
                    System.out.print("Öğrenci Soyadı: ");
                    String soyad = sc.nextLine();

                    ogrenciAgaci.root = ogrenciAgaci.insert(ogrenciAgaci.root, no, not, ad, soyad);
                    System.out.println("Öğrenci eklendi.");
                    break;

                case 2:
                    System.out.print("Silinecek öğrenci numarası: ");
                    int silNo = sc.nextInt();
                    ogrenciAgaci.root = ogrenciAgaci.delete(ogrenciAgaci.root, silNo);
                    System.out.println("Öğrenci silme işlemi yapıldı.");
                    break;

                case 3:
                    System.out.println("\nÖğrenciler (InOrder)");
                    ogrenciAgaci.inOrder(ogrenciAgaci.root);
                    break;

                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("⚠ Geçersiz seçim! Tekrar deneyiniz.");
            }

        } while (secim != 0);

        sc.close();
    }
}
