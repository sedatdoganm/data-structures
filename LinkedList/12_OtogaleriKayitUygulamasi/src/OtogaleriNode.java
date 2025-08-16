public class OtogaleriNode {
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyati;
    int satisFiyati;
    String aciklama;

    OtogaleriNode next;

    public OtogaleriNode(String plaka, String marka, String model, String renk, int alisFiyati, String aciklama) {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.alisFiyati = alisFiyati;
        this.aciklama = aciklama;
        satisFiyati = (int) (alisFiyati * 1.2);
        next = null;
    }
}
