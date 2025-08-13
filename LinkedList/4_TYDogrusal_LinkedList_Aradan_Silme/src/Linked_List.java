public class Linked_List {
    Node head;
    Node tail;

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

    public void aradanSilme(int index){
        if(index<0){
            System.out.println("Index 0'dan kucuk olamaz!");
        }
        else if(index == 0){
            if(head == null){
                System.out.println("Bu liste zaten bos!");
            }
            else if(head.next == null){
                head = null;
                tail = null;
                System.out.println("Listedeki son eleman da silindi.");
            }
            else{
                head = head.next;
            }
        }
        else{
            // Index'e gore sondan silme durumunu ekleyelim..
            int n = 0;
            Node temp = head;
            Node temp2 = head;
            while(temp != null){
                n++; // bu dongude temp=tail'i temp2 ise tail'den onceki dugumu tutuyor.
                temp2 = temp;
                temp = temp.next;
            }
            if(n == index){
                    temp2.next = null; // temp2.next'i null yaparsak son deger tail'i sileriz.
                    tail = temp2; // burada da yeni son degeri tail'e atiyoruz.
            }
            else{
                temp = head;
                temp2 = head;
                int i = 0;
                while(i != index){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = temp.next;
            }
        }
    }
}
