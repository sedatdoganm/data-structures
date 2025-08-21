public class Node{
    int ogrenciNo;
    int ogrenciNot;
    String ogrenciAdi;
    String ogrenciSoyadi;
    Node left;
    Node right;

    public Node() {
        ogrenciNo = 0;
        ogrenciNot = 0;
        ogrenciAdi = "";
        ogrenciSoyadi = "";
        left = null;
        right = null;
    }

    public Node(int ogrenciNo, int ogrenciNot, String ogrenciAdi, String ogrenciSoyadi) {
        this.ogrenciNo = ogrenciNo;
        this.ogrenciNot = ogrenciNot;
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciSoyadi = ogrenciSoyadi;
        left = null;
        right = null;
    }
}
