public class Main {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.sonaEkle(2);
        list.sonaEkle(3);
        list.sonaEkle(4);
        list.sonaEkle(5);
        list.listele();
        System.out.println("----------------");
        list.aradanSilme(2);
        list.listele();
    }
}