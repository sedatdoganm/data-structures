import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        Scanner scanner = new Scanner(System.in);

        int secim = -1;

        while(secim != 0){
            System.out.println("1 - Basa Eleman Ekle");
            System.out.println("2 - Sona Eleman Ekle");
            System.out.println("3 - Araya Eleman Ekle");
            System.out.println("4 - Elemanlari Listele");
            System.out.println("0 - Cikis Yap\n");

            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim){
                case 1:
                    list.basaElemanEkleme();
                    break;
                case 2:
                    list.sonaElemanEkleme();
                    break;
                case 3:
                    list.arayaElemanEkleme();
                    break;
                case 4:
                    list.elemanlariListele();
                    break;
                case 0:
                    System.out.println("Donguden cikiliyor..");
                    break;
                default:
                    System.out.println("Gecersiz secim!");
                    break;
            }
        }
    }
}
