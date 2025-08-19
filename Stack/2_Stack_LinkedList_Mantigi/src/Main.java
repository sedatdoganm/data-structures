import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Stack size'ini giriniz: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        StackLinkedList stackList = new StackLinkedList(size);

        int secim = -1;

        while(secim != 0){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top'u goster");
            System.out.println("4. Yazdir");
            System.out.println("0. Exit");

            secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim){
                case 1:
                    System.out.print("Data'yi gir: ");
                    int data = scanner.nextInt();
                    stackList.push(data);
                    break;
                case 2:
                    stackList.pop();
                    break;
                case 3:
                    stackList.topGoster();
                    break;
                case 4:
                    stackList.print();
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor..");
                    break;
                default:
                    System.out.println("Yanlis bir secim girdiniz!");
            }
        }
    }
}