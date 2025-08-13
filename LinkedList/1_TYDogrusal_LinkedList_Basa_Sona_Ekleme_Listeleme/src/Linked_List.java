public class Linked_List {
    Node head;
    Node tail;

    public void basaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        if(head == null){
            head = tail = eleman;
            eleman.next = null;
        }
        else{
            eleman.next = head;
            head = eleman;
        }
    }
    public void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        if(tail == null){
            tail = head = eleman;
        }
        else{
            tail.next = eleman;
            tail = eleman;
            eleman.next = null;
        }
    }
    public void listele(){
        if(head == null){
            System.out.println("bu liste bos");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.println("eleman: "+ temp.data);
                temp = temp.next;
            }
        }
    }
}
