public class Linked_List {
    Node head;
    Node tail;

    public void bastanElemanSil()
    {
        if(head == null){
            System.out.println("Bu liste bos oldugu icin silinecek eleman yok.");
        }
        else if(head.next == null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman da silindi.");
        }
        else{
            head = head.next;
            System.out.println("Bastaki eleman silindi.");
            // Java'da garbage collector, bu bosta kalan(sildigimiz) head'i temizler.
        }
    }

    public void sondanElemanSil()
    {
        if(tail == null){
            System.out.println("Bu liste bos oldugu icin silinecek eleman yok.");
        }
        else if(head.next == null){
            head = null;
            System.out.println("Listede kalan son eleman da silindi.");
        }
        else{
            Node temp = head;
            Node temp2 =  head;
            while(temp.next != null){ // asagidaki yapida temp2 sondan bir onceki dugumu tutarken temp ise son dugumu tutuyordur.
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null; // bu sondaki'ne denk geliyor, yani aslında temp'e
            tail = temp2;
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
