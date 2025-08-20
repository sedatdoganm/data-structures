public class QueueClass {
    int[] dizi;
    int size; // dizinin boyutu
    int front; // bastaki elemanin indexi
    int rear; // sondaki elemanin indexi

    public QueueClass(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if(isFull()){
            System.out.println("Queue is full!");
        }
        else{
            rear++;
            dizi[rear] = data;
        }
    }

    void dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        else{
            int sayi = dizi[front];
            for(int i=1; i<=rear; i++){
                dizi[i-1] = dizi[i];
            }
            rear--;
        }

    }

    boolean isFull(){
        return rear == size - 1;
    }

    boolean isEmpty(){
        return rear == -1;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        else{
            for(int i=0; i<=rear; i++){
                System.out.print(dizi[i] + " ");
            }
        }
    }

    // Tersten yazdirma
    void print2(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        else{
            for(int i=0; i<=rear; i++){
                System.out.print(dizi[rear-i] + " ");
            }
        }
    }
}

// enqueue: kuyruga eleman ekleme
// dequeue: kuyruktan eleman cikarma
// front: kuyrugun en basindaki eleman
// rear: kuyrugun son elemani
