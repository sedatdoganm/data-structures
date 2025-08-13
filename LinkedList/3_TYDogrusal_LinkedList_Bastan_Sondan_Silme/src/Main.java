import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.sonaEkle(5);
        list.sonaEkle(6);
        list.sonaEkle(7);
        list.listele();
        System.out.println("*****************");
        list.bastanElemanSil();
        list.listele();
        System.out.println("******************");
        list.sondanElemanSil();
        list.listele();
        System.out.println("*******************");
        list.sondanElemanSil();
        list.listele();
    }
}