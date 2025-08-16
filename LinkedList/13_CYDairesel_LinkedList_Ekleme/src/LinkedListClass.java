import java.util.Scanner;

public class LinkedListClass {
    Node head = null;
    Node tail = null;

    Scanner scanner = new Scanner(System.in);

    public Node elemanOlustur(){
        System.out.print("Data'yi gir: ");
        int data = scanner.nextInt();
        scanner.nextLine();
        return new Node(data);
    }

    public void basaElemanEkleme(){
        Node eleman = elemanOlustur();
        if(head == null){
            head = eleman;
            tail = eleman;

            head.next = tail;
            tail.next = head;
            head.prev = tail;
            tail.prev = head;
        }
        else{
            eleman.next = head;
            head.prev = eleman; // buralar onemli
            head = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }

    public void sonaElemanEkleme(){
        Node eleman = elemanOlustur();
        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;
            head.prev = tail;
        }
        else{
            tail.next = eleman;
            eleman.prev = tail; // buralar onemli
            tail = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }

    public void arayaElemanEkleme(){
        Node eleman = elemanOlustur();
        System.out.print("Hangi index'e eleman eklemek istiyorsunuz?: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
        }
        else{
            int n=0;
            Node temp = head;
            do{
                n++;
                temp = temp.next;
            }while(temp != head);

            if(index<=0){
                eleman.next = head;
                head.prev = eleman;
                head = eleman;
                tail.next = head;
                head.prev = tail;
            }
            else if(index>=n){
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
                tail.next = head;
                head.prev = tail;
            }
            else{
                temp = head;
                Node temp2 = head;
                for(int i=0;i<index;i++){
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.prev = temp2;
                eleman.next = temp;
                temp.prev = eleman;
            }
        }
    }

    public void elemanlariListele(){
        if(head == null){
            System.out.println("Listelenecek eleman yok!");
        }
        else{
            Node temp = head;
            do{
                System.out.println("Eleman: "+temp.data);
                temp = temp.next;
            }while(temp != head);
        }
    }

    public void elemanlariTerstenListele(){
        if(head == null){
            System.out.println("Listelenecek eleman yok!");
        }
        else{
            Node temp = tail;
            do{
                System.out.println("Eleman: "+temp.data);
                temp = temp.prev;
            }while(temp != tail);
        }

    }
}
