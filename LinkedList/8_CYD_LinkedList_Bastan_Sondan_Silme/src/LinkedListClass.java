import java.util.Scanner;

public class LinkedListClass {
    Node head = null;
    Node tail = null;

    public void elemanlariBastanSil(){

        //Listede eleman yoksa
        if(head == null){
            System.out.println("Listede silinecek eleman yok!");
        }
        else if(head.next == null){
            head = null;
            tail = null;
            System.out.println("Listedeki son elemanda basariyla silindi!");
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void basaElemanEkle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Elemani giriniz: ");
        int x = input.nextInt();

        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }

    public void elemanlariSondanSil(){
        if(head == null){
            System.out.println("Listede silinecek eleman yok!");
        }
        else if(head.next == null){
            head = null;
            tail = null;
        }
        else{
            tail.prev = tail;
            tail.next = null;
        }
    }

    public void elemanlariAradanSil(int index) {
        if (head == null) {
            System.out.println("Silinecek eleman yok!");
        }
        else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Silinebilecek son eleman da silindi!");
        }
        else {
            int n = 0;
            Node temp = head;
            while (temp != null) {
                n++;
                temp = temp.next;
            }

            if (index < 0 || index >= n) {
                System.out.println("Geçersiz index!");
            }
            else if (index == 0) { // baştan silme
                head = head.next;
                head.prev = null;
            }
            else if ((n - 1) == index) { // sondan silme
                tail = tail.prev;
                tail.next = null;
            }
            else { // aradan silme
                temp = head;
                Node temp2 = head;
                for (int i = 0; i < index; i++) {
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
                temp.next.prev = temp2;
            }
        }
    }


    public void elemanlariListele(){
        if(head == null){
            System.out.println("Liste bos!");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void elemanSayisiGetir(){
        int n=0;
        Node temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        System.out.println("Eleman sayisi: "+n);
    }
}
