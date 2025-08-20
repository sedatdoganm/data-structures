import org.w3c.dom.UserDataHandler;

import java.util.Scanner;

public class QueueClass {
    private Node front;
    private Node rear;
    private int size;
    private int counter = 0;

    Scanner scanner = new Scanner(System.in);

    public QueueClass(int size) {
        this.size = size;
        front = null;
        rear = null;
    }


    void enqueue(int data){
        if(isFull()){
            System.out.println("Kuyruk doldugu icin ekleme yapilamaz!");
        }
        else{
            Node eleman = new Node(data);
            if(isEmpty()){
                front = eleman;
                rear = eleman;
            }
            else{
                rear.next = eleman;
                rear = eleman;
            }
            counter++;
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Kuyruktan silinebilecek bir eleman yok!");
        }
        else{
            System.out.println("Silinen eleman: "+ front.data);
            if(front == rear){
                front = null;
                rear = null;
            }
            else{
                front = front.next;
            }
            counter--;
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Yazdirilacak eleman yok!");
        }
        else{
            Node temp = front;
            do{
                System.out.println("Eleman: "+temp.data);
                temp = temp.next;
            }while(temp != null);
        }
    }

    private boolean isFull(){
        return counter == size;
    }


    private boolean isEmpty(){
        return counter == 0;
    }
}
