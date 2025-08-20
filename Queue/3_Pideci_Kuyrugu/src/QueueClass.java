public class QueueClass {
    Node front;
    Node rear;

    int size;
    int counter;
    int kasa = 0;

    public QueueClass(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }

    void enqueue(String isim, int adet) {
        Node eleman = new Node(isim, adet);
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(isEmpty()){
                front = eleman;
                rear = eleman;
            }
            else{
                rear.next = eleman;
                rear = eleman;
            }
            counter++;
            // eklenen kişinin ücreti kasaya ekleniyor
            kasa += eleman.ucret;
        }
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        else{
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

    boolean isFull() {
        return counter == size;
    }

    boolean isEmpty() {
        return counter == 0;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Kuyruk boş!");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.println("Müşteri: " + temp.isim +
                    ", Adet: " + temp.adet +
                    ", Ücret: " + temp.ucret);
            temp = temp.next;
        }
    }

    void bastakiKisiyiGoster(){
        if(isEmpty()){
            System.out.println("Kuyruk bos!");
        }
        else{
            System.out.println("Bastaki: " + front.isim);
        }
    }

    void sondakiKisiyiGoster(){
        if(isEmpty()){
            System.out.println("Kuyruk bos!");
        }
        else{
            System.out.println("Sondaki: " + rear.isim);
        }
    }

    // Kasadaki toplam para
    void toplamKazanc(){
        System.out.println("Toplam Kazanç: " + kasa + " TL");
    }
}
