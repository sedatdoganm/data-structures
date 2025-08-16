import java.util.Scanner;

public class LinkedListClass {
    Node head = null;
    Node tail = null;

    Scanner scanner = new Scanner(System.in);

    public void bastanElemanSilme(){
        if(head == null){
            System.out.println("Silinecek eleman yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Silinecek son eleman da silindi!");
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }

    public void sondanElemanSilme(){
        if(head == null){
            System.out.println("Silinecek eleman yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Silinecek son eleman da silindi!");
        }
        else{
            Node temp = head;
            Node temp2 = head;
            while(temp != tail){
                temp2 = temp;
                temp = temp.next;
            }
            tail = temp2;
            tail.next = head;
        }
    }

    public void aradanElemanSilme(int index){

        Node temp = head;
        int n = 0;
        do{
            n++;
            temp = temp.next;
        }while(temp!=head);

        if(head == null){
            System.out.println("Silinecek eleman yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Silinecek son eleman da silindi!");
        }
        else{
            if(index <= 0){
                head = head.next;
                tail.next = head;
            }
            else if(index>=n){
                temp = head;
                Node temp2 = head;
                while(temp != tail){
                    temp2 = temp;
                    temp = temp.next;
                }
                tail = temp2;
                tail.next = head;
            }
            else{
                temp = head;
                Node temp2 = head;
                for(int i=0;i<index;i++){
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;

                if(temp == tail){
                    tail = temp2;
                }
            }
        }
    }

    public void arayaElemanEkleme(){
        System.out.print("Index: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data: ");
        int data = scanner.nextInt();
        scanner.nextLine();
        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else if(index == 0){
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
        else{
            int n = 0;
            Node temp = head;
            while(temp != tail){
                n++;
                temp = temp.next;
            }
            n++;

            if(index >= n-1){
                tail.next = eleman;
                tail = eleman;
                tail.next = head;
            }
            else{
                temp = head;
                Node temp2 = head;
                for(int i = 0; i < index-1; i++){
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.next = temp;
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
                System.out.println("Eleman: " + temp.data);
                temp = temp.next;
            }while(temp != head);
        }
    }
}
