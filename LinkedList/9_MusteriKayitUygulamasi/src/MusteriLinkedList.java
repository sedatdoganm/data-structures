import org.w3c.dom.Node;

public class MusteriLinkedList {
    MusteriNode head = null;
    MusteriNode tail = null;

    public void musteriEkle(int id, String ad, String soyad, String telNo, String adres, String urun) {
        MusteriNode musteri = new MusteriNode(id, ad, soyad, telNo, adres, urun);

        if(head == null) {
            head = musteri;
            tail = musteri;
            System.out.println("Liste olusturuldu, ilk musteri kaydedildi.");
        }
        else {
            musteri.next = head;
            head.prev = musteri;
            head = musteri;
        }
    }

    public void musteriSilme(int id){
        boolean sonuc = false;
        if(head == null) {
            System.out.println("Silinecek musteri yok!");
        }
        else{
            if(head.next == null) {
                head = null;
                tail = null;
                System.out.println("Silinebilecek son musteri de silindi!");
                sonuc = true;
            }
            else if(head.next != null && head.id == id){
                head = head.next;
                head.prev = null;
                sonuc = true;
            }
            else if(tail.id == id){
                tail = tail.prev;
                tail.next = null;
                sonuc = true;
            }
            else{
                MusteriNode temp = head;
                while(temp!=null){
                    if(temp.id == id){
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
        if(!sonuc){
            System.out.println("Aranan musteri listede yok!");
        }
    }

    public void musteriGuncelle(int id, String urunIsmi){
        if(head == null) {
            System.out.println("Guncellenecek musteri yok!");
        }
        boolean sonuc = false;
        MusteriNode temp = head;
        while(temp!=null){
            if(temp.id == id){
                temp.urun = urunIsmi;
                sonuc = true;
                break;
            }
            temp = temp.next;
        }
        if(!sonuc){
            System.out.println("Musteri bulunamadi");
        }
        else{
            System.out.println("Musteri bulundu ve urun guncellendi!");
        }
    }

    public void musteriListele(){
        if(head == null) {
            System.out.println("Listelenecek musteri yok!");
        }

        int n = 0;
        MusteriNode temp = head;
        while(temp!=null){
            System.out.println(temp.id+ "numarali musteri: "+temp.ad+" "+temp.soyad);
            temp = temp.next;
        }
    }

    public void kacMusteriVar(){
        int n = 0;
        MusteriNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        System.out.println("Toplam musteri sayisi: "+n);
    }

    public void musteriBilgileriniYazdir(int id){
        if(head == null) {
            System.out.println("Liste bos oldugu icin hicbir musteri bilgisi yazdirililamadi!");
        }
        else{
            MusteriNode temp = head;
            boolean sonuc = false;

            while(temp!=null){
                if(temp.id == id){
                    System.out.println("Ad: " + temp.ad);
                    System.out.println("Soyad: " + temp.soyad);
                    System.out.println("TelNo: " + temp.telNo);
                    System.out.println("Adres: " + temp.adres);
                    System.out.println("Urun: " + temp.urun);
                    sonuc = true;
                    break;
                }
                temp = temp.next;
            }
            if(!sonuc){
                System.out.println("Bu ID'e sahip musteri bulunamadi!");
            }
            else{
                System.out.println("Bu ID'e sahip musteri bilgileri yazdirildi!");
            }

        }
    }

    public void musteriAra(int id){
        boolean sonuc = false;
        if(head == null) {
            System.out.println("Liste bos oldugu icin musteri aranamaz!");
        }
        else{
            MusteriNode temp = head;
            while(temp!=null){
                if(temp.id == id){
                    sonuc = true;
                    break;
                }
                temp = temp.next;
            }
            if(!sonuc){
                System.out.println("Aranan musteri bulunamadi!");
            }
            else{
                System.out.println("Aranan musteri bulundu!");
            }
        }
    }
}
