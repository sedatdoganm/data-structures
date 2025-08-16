import org.w3c.dom.Node;

public class MusteriNode {
    int id;
    String ad;
    String soyad;
    String telNo;
    String adres;
    String urun;
    MusteriNode next;
    MusteriNode prev;

    public MusteriNode(){}
    public MusteriNode(int id, String ad, String soyad, String telNo, String adres, String urun) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.telNo = telNo;
        this.adres = adres;
        this.urun = urun;

        next = null;
        prev = null;
    }
}
