public class Main {
    public static void main(String[] args) {
        QueueClass kuyruk = new QueueClass(3);
        kuyruk.enqueue(5);
        kuyruk.enqueue(6);
        kuyruk.enqueue(7);
        kuyruk.print();
        kuyruk.enqueue(8);

        kuyruk.dequeue();
        kuyruk.print();
        kuyruk.enqueue(9);
        System.out.println();
        kuyruk.print();
        System.out.println();
        kuyruk.print2();
        System.out.println(kuyruk.dizi[kuyruk.front]);

    }
}