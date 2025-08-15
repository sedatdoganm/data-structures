public class LinkedListClass {
    Node head = null;
    Node tail = null;

    public void arayaElemanEkleme(int index, int x){
        Node eleman = new Node(x);

        if(head == null){
            head = eleman;
            tail = eleman;
        }
        else if(head!=null && index == 0){
            eleman.next = head;
            head = eleman;
            eleman.prev = null;
        }
        else{
           int n = 0;
           Node temp = head;
           Node temp2 = head;
           while(temp != null){
               n++;
               temp2 = temp;
               temp = temp.next;
           }
           if(index == n){
               tail.next = eleman;
               tail = eleman;
               eleman.prev = temp;
           }
           else if(index > n){
               System.out.println("Index sayisi eleman sayisindan buyuk olamaz!");
           }
           else{
               temp = head;
               temp2 = head;
               for(int i=0; i<index; i++){
                   temp2 = temp;
                   temp = temp.next;
               }
               temp2.next = eleman;
               eleman.next = temp;
               temp.prev = eleman;
               eleman.prev = temp2;
           }
        }
    }

    public void elemanlariListele(){
        if(head == null){
            System.out.println("Liste bos!");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void elemanSayisiGetir(){
        int n=0;
        Node temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        System.out.println("Eleman sayisi: "+n);
    }
}
