public class StackLinkedList {
    int size;
    int counter;

    Node top; // En ust dugumu tutan pointer (head gibi dusunebiliriz)

    public StackLinkedList(int size) {
        this.size = size;
        counter = 0;
    }

    // Ekleme
    public void push(int data) {
        Node eleman = new Node(data);
        if(isFull()){
            System.out.println("Stack dolu oldugu icin ekleme yapilamiyor!");
        }
        else{
            if(isEmpty()){
                // Stack bos ise ilk dugume ekleriz.
                top = eleman;
                top.next = null;
                System.out.println(top.data + " stack'e ilk eleman olarak eklendi.");
            }
            else{
                eleman.next = top;
                top = eleman;
                System.out.println(top.data + " stack'e eklendi.");
            }
            counter++;
        }
    }

    // Cikartma
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack bos oldugu icin cikartilacak eleman yok!");
        }
        else{
            top = top.next;
            System.out.println(top.data+ " cikartildi.");
            counter--;
        }
    }

    // Dolu mu?
    public boolean isFull(){
        return counter == size;
    }

    // Bos mu?
    public boolean isEmpty(){
        return counter == 0;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Yazdirilacak eleman yok!");
        }
        else{
            Node temp = top;
            while(temp!= null){
                System.out.println("Eleman:" +temp.data);
                temp = temp.next;
            }
        }
    }

    public void topGoster(){
        if(isEmpty()){
            System.out.println("Gosterilecek bir top yok!");
        }
        else{
            System.out.println("Top: "+top.data);
        }
    }
}
