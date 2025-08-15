import java.util.Scanner;

public class OgrenciListe {
    OgrenciNode head = null;
    OgrenciNode tail = null;

    Scanner scanner = new Scanner(System.in);

    public void ogrenciEkle() {
        System.out.println("Bilgisayar bolumune kaydolacak ogrencinin bilgilerini giriniz..");

        System.out.print("Numara: ");
        int numara = scanner.nextInt();
        scanner.nextLine(); // buffer temizliği

        System.out.print("Ad: ");
        String ad = scanner.nextLine();

        System.out.print("Soyad: ");
        String soyad = scanner.nextLine();

        System.out.print("Vize: ");
        int vize = scanner.nextInt();

        System.out.print("Final: ");
        int fin = scanner.nextInt();

        double ortalama = (vize * 0.4) + (fin * 0.6);
        String durum = ortalama >= 50 ? "Geçti" : "Kaldı";

        OgrenciNode ogrenci = new OgrenciNode(numara, ad, soyad, vize, fin);

        if (head == null) {
            head = ogrenci;
            tail = ogrenci;
        } else {
            ogrenci.next = head; // başa ekleme
            head = ogrenci;
        }

        System.out.println("Öğrenci başarıyla eklendi!\n");
    }

    public void ogrenciSil() {
        if (head == null) {
            System.out.println("Silinecek ogrenci yok!");
            return;
        }

        System.out.print("Silmek istediginiz ogrencinin numarasini giriniz: ");
        int numara = scanner.nextInt();

        // Başta ise
        if (numara == head.numara) {
            if (head.next == null) { // tek eleman varsa
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            System.out.println(numara + " numaralı öğrenci silindi.");
            return;
        }

        // Sonda ise
        if (numara == tail.numara) {
            OgrenciNode temp = head;
            OgrenciNode temp2 = null;

            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null; // bağlantıyı kopardık
            tail = temp2;

            System.out.println(numara + " numaralı öğrenci silindi.");
            return;
        }

        // Ortada ise
        OgrenciNode current = head;
        OgrenciNode previous = null;

        while (current != null && current.numara != numara) {
            previous = current;
            current = current.next;
        }

        if (current != null) { // bulundu
            previous.next = current.next;
            System.out.println(numara + " numaralı öğrenci silindi.");
        } else {
            System.out.println("Öğrenci bulunamadı.");
        }
    }

    public void ogrenciListele() {
        if (head == null) {
            System.out.println("Ogrenci listesinde ogrenci yok.");
            return;
        }

        OgrenciNode temp = head;
        while (temp != null) {
            System.out.println("Numara: " + temp.numara);
            System.out.println("Ad: " + temp.ad);
            System.out.println("Soyad: " + temp.soyad);
            System.out.println("Vize: " + temp.vize);
            System.out.println("Final: " + temp.fin);
            System.out.println("Ortalama: " + temp.ortalama);
            System.out.println("Durum: " + temp.durum);
            System.out.println("----------------------");
            temp = temp.next;
        }
    }

    public void enBasariliOgrenci() {
        if (head == null) {
            System.out.println("Listede öğrenci yok.");
            return;
        }

        OgrenciNode enBasarili = head;
        double enBuyukOrtalama = head.ortalama;

        OgrenciNode temp = head;
        while (temp != null) {
            if (temp.ortalama > enBuyukOrtalama) {
                enBuyukOrtalama = temp.ortalama;
                enBasarili = temp;
            }
            temp = temp.next;
        }

        System.out.println("En başarılı öğrenci: " + enBasarili.ad + " " + enBasarili.soyad);
        System.out.println("Ortalaması: " + enBuyukOrtalama);
    }
}
