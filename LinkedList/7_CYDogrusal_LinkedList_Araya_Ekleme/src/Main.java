public class Main {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.arayaElemanEkleme(0,5);
        list.arayaElemanEkleme(0,12);
        list.arayaElemanEkleme(2,25);
        list.arayaElemanEkleme(2,15);
        list.elemanSayisiGetir();
        System.out.println("**************");
        list.elemanlariListele();
        list.elemanSayisiGetir();

    }
}