public class Main {
    public static void main(String[] args) {
        QueueClass q = new QueueClass(3);

        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.print();
        q.enqueue(5);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.print();
    }
}