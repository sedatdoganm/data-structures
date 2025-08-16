import java.util.Scanner;

public class LinkedListClass {
    Node head = null;
    Node tail = null;
    Scanner scanner = new Scanner(System.in);

    public void basaElemanEkleme(){
        System.out.print("Data: ");
        int data = scanner.nextInt();

        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else{
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }


    public void sonaElemanEkleme(){
        System.out.print("Data: ");
        int data = scanner.nextInt();

        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else{
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
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

    public void elemanlariListele() {
        if(head == null) {
            System.out.println("Yazdirilacak eleman yok!");
        } else {
            Node temp = head;
            System.out.print("bas -> ");
            do {
                System.out.print(temp.data);
                temp = temp.next;
                if(temp != head) {
                    System.out.print(" -> ");
                }
            } while(temp != head);
            System.out.println(" -> son");
        }
    }

}