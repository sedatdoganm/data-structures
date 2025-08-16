import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListClass liste = new LinkedListClass();

        int secim = -1;
        while(secim != 0){
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Basa Eleman Ekle");
            System.out.println("2 - Sona Eleman Ekle");
            System.out.println("3 - Araya Eleman Ekle");
            System.out.println("4 - Elemanlari Listele");
            System.out.println("5 - Elemanlari Tersten Listele");
            System.out.println("0 - Cikis");
            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();

            switch(secim){
                case 1:
                    liste.basaElemanEkleme();
                    break;
                case 2:
                    liste.sonaElemanEkleme();
                    break;
                case 3:
                    liste.arayaElemanEkleme();
                    break;
                case 4:
                    liste.elemanlariListele();
                    break;
                case 5:
                    liste.elemanlariTerstenListele();
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz!");
            }
        }
    }
}
