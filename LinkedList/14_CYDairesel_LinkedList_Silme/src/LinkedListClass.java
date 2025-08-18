import java.util.Scanner;

public class LinkedListClass {
    Node tail = null;
    Node head = null;

    public Node elemanOlustur(){
        System.out.print("Data'yi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        return new Node(data);
    }

    public void basaElemanEkleme(){
        Node eleman = elemanOlustur();

        if(head == null){
            head = eleman;
            tail = eleman;
            head.next = head;
            head.prev = head;
        }
        else{
            eleman.next = head;
            eleman.prev = tail;
            head.prev = tail;
            tail.next = head;
            head = eleman;
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
            }while(temp!=tail);
        }
    }



    public void bastanElemanSil(){
        if(head == null){
            System.out.println("Silinebilecek eleman yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Listede silinebilecek son eleman da silindi");
        }
        else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    public void sondanElemanSil(){
        if(head == null){
            System.out.println("Silinebilecek eleman yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Listede silinebilecek son eleman da silindi");
        }
        else{
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    public void aradanElemanSil(int index){
        if(head == null){
            System.out.println("Silinebilecek eleman yok!");
        }

        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Listede silinebilecek son eleman da silindi");
        }

        else if(index <= 0){
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        else{
            Node temp = head;
            int n=0;
            do{
                n++;
                temp = temp.next;
            }while(temp!=head);

            if(index>=n){
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            else{
                temp = head;
                Node temp2 = temp;
                for(int i=0; i<index; i++){
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
                temp.next.prev = temp2;
            }
        }


    }
}