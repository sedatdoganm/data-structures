public class Linked_List {
    Node head;
    Node tail;

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

    public void elemanSayisiGetir(){
        int n = 0;
        Node temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        System.out.println("eleman sayisi: "+n);
    }

    public void arayaElemanEkleme(int index, int x){
        Node eleman = new Node();
        eleman.data = x;

        if(index < 0){
            System.out.println("Index 0'dan kucuk olamaz!");
        }
        else{
            if(index == 0){
                if(head == null){
                    head = tail = eleman;
                    tail.next = null;
                }
                else{
                    eleman.next = head;
                    head = eleman;
                }
            }
            else{
                Node temp = head;
                Node temp2 = head;
                int n = 0;
                while(temp != null){
                    n++; // Buradaki n sayisi eleman sayisi vermelidir.
                    temp = temp.next;
                }
                if(n == index) // n = index oldugunda sona eleman ekleyecegiz demektir.
                {
                    tail.next = eleman;
                    tail = eleman;
                }
                else{
                    temp = head;
                    temp2 = head;
                    for(int i = 0; i < index; i++){}{
                        temp = temp.next;
                        temp2 = temp.next;
                    }
                    temp.next = eleman;
                    eleman.next = temp2;
                }
            }
        }
    }
}





// LinkedList'de araya ekleme de onceligimiz, onceki node'u bulmamiz lazimdir.
// Daha sonra ekleyecegimiz indis'ten sonraki node'u da (yani aslında eklenmeden onceki o indis'e ait node'u da) bir yerde tutmamiz lazim
// Onceki dugumun next'i araya eklenecek yeni dugum olacaktir.

