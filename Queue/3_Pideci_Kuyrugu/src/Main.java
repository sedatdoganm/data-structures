import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QueueClass queue = new QueueClass(3);

        int secim = -1;

        while(secim != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Musteri Ekle");
            System.out.println("2. Satis Yap (Musteri Cikar)");
            System.out.println("3. Kuyrugu Yazdir");
            System.out.println("4. Bastakini Goster");
            System.out.println("5. Sondakini Goster");
            System.out.println("6. Toplam Kazanci Goster");
            System.out.println("0. Cikis Yap");

            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Eklemek istediginiz kisinin ismi: ");
                    String isim = scanner.nextLine();

                    System.out.print("Bu kisinin alacagi ekmek sayisi: ");
                    int adet = scanner.nextInt();
                    scanner.nextLine();

                    queue.enqueue(isim, adet);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.bastakiKisiyiGoster();
                    break;
                case 5:
                    queue.sondakiKisiyiGoster();
                    break;
                case 6:
                    queue.toplamKazanc();
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor..");
                    break;
                default:
                    System.out.println("Yanlis bir tuslama yaptiniz!");
                    break;
            }
        }
        scanner.close();
    }
}
