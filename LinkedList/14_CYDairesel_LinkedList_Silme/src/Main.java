import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        Scanner scanner = new Scanner(System.in);

        int secim = -1;

        while (secim != 0) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Başa Eleman Ekle");
            System.out.println("2 - Baştan Eleman Sil");
            System.out.println("3 - Sona Eleman Sil");
            System.out.println("4 - Aradan Eleman Sil (indise göre)");
            System.out.println("5 - Elemanlari Listele");
            System.out.println("0 - Cikis");
            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    list.basaElemanEkleme();
                    break;
                case 2:
                    list.bastanElemanSil();
                    break;
                case 3:
                    list.sondanElemanSil();
                    break;
                case 4:
                    System.out.print("Silinecek elemanin indisini giriniz: ");
                    int index = scanner.nextInt();
                    list.aradanElemanSil(index);
                    break;
                case 5:
                    list.elemanlariListele();
                    break;
                case 0:
                    System.out.println("Programdan cikiliyor...");
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz!");
            }
        }
    }
}
