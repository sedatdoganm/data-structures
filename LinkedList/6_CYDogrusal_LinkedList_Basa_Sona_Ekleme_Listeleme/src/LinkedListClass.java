public class LinkedListClass {
    Node head = null;
    Node tail = null;

    public void basaElemanEkle(int x) {
        Node eleman = new Node(x);
        if (this.head == null) {
            this.head = eleman;
            this.tail = eleman;
        } else {
            eleman.next = this.head;
            this.head.prev = eleman;
            this.head = eleman;
        }

    }

    public void sonaElemanEkle(int x) {
        Node eleman = new Node(x);
        if (this.head == null) {
            this.head = eleman;
            this.tail = eleman;
        } else {
            this.tail.next = eleman;
            eleman.prev = this.tail;
            this.tail = eleman;
        }

    }

    public void elemanlariListele() {
        if (this.head == null) {
            System.out.println("Listede eleman yok!");
        } else {
            for(Node temp = this.head; temp != null; temp = temp.next) {
                System.out.println("eleman: " + temp.data);
            }
        }

    }
}
