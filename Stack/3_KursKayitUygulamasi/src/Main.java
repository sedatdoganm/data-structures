import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackClass kurs = new StackClass(3);

        int secim = 1;

        while(secim != 0){
            System.out.println("1. Ekle");
            System.out.println("2. Cikar");
            System.out.println("3. Top'dali Kursiyeri Goster");
            System.out.println("4. Tum Kursiyerleri Goster");
            System.out.println("0. Cikis Yap\n");

            System.out.print("Seciminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    kurs.push();
                    break;
                case 2:
                    kurs.pop();
                    break;
                case 3:
                    kurs.topBilgileriGoster();
                    break;
                case 4:
                    kurs.tumKursiyerleriGoster();
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor..");
                    break;
                default:
                    System.out.println("Yanlis tuslama yaptiniz!");
                    break;
            }
        }
        scanner.close();
    }
}