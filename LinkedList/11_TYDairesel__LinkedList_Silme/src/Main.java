public class Main {
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.arayaElemanEkleme();
        list.arayaElemanEkleme();
        list.arayaElemanEkleme();
        list.arayaElemanEkleme();
        list.arayaElemanEkleme();
        list.arayaElemanEkleme();

        System.out.println("***************");
        list.elemanlariListele();
        System.out.println("***************");
        list.bastanElemanSilme();
        System.out.println("***************");
        list.elemanlariListele();
        System.out.println("***************");
        list.sondanElemanSilme();
        System.out.println("***************");
        list.elemanlariListele();
        System.out.println("***************");
        list.aradanElemanSilme(3);
        System.out.println("***************");
        list.elemanlariListele();
    }
}