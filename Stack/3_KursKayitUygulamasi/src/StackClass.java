import org.w3c.dom.Node;

import java.util.Scanner;

public class StackClass {
    KursNode top;
    int kontenjan;
    int sayac = 0;

    Scanner scanner = new Scanner(System.in);

    public StackClass(int kontenjan) {
        this.kontenjan = kontenjan;
        top = null;
    }

    public KursNode kursiyerOlustur(){
        System.out.print("Kursiyerin TC'sini giriniz: ");
        String tc = scanner.nextLine();
        System.out.print("Kursiyerin adini giriniz: ");
        String ad = scanner.nextLine();
        System.out.print("Kursiyerin soyadini giriniz: ");
        String soyad = scanner.nextLine();
        System.out.print("Kursiyerin mezun oldugu bolumu giriniz: ");
        String mezunBolum = scanner.nextLine();

        return new KursNode(tc, ad, soyad, mezunBolum);
    }

    public void push(){
        KursNode kursiyer = kursiyerOlustur();

        if(isFull()){
            System.out.println("Kontenjan dolu!");
        }
        else{
            if(isEmpty()){
                top = kursiyer;
                top.next = null;
                System.out.println(top.ad + " " + top.soyad + " kursiyer eklendi!");
            }
            else{
                kursiyer.next = top;
                top = kursiyer;
                System.out.println(top.ad + " " + top.soyad + " kursiyer eklendi!");
            }
            sayac++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Silinebilecek bir kursiyer yok!");
        } else {
            String silinenAd = top.ad;
            String silinenSoyad = top.soyad;

            if (top.next == null) {
                top = null;
                System.out.println("Silinebilecek son kursiyer de silindi. Silinen kursiyer: "
                        + silinenAd + " " + silinenSoyad);
            } else {
                top = top.next;
                System.out.println("Silinen kursiyer: " + silinenAd + " " + silinenSoyad);
            }
            sayac--;
        }
    }

    public void tumKursiyerleriGoster(){
        if(isEmpty()){
            System.out.println("Yazdirilacak bir kursiyer yok!");
        }
        else{
            KursNode temp = top;
            do{
                System.out.println("Top TC: "+top.tc);
                System.out.println("Top Ad: "+top.ad);
                System.out.println("Top Soyad: "+top.soyad);
                System.out.println("Top Mezun Oldugu Bolum: "+top.mezunBolum);
                System.out.println("*************************");
                temp = temp.next;
            }while(temp!=null);
        }
    }

    public boolean isFull(){
        return sayac == kontenjan;
    }
    public boolean isEmpty(){
        return sayac == 0;
    }
    public void topBilgileriGoster(){
        System.out.println("Top TC: "+top.tc);
        System.out.println("Top Ad: "+top.ad);
        System.out.println("Top Soyad: "+top.soyad);
        System.out.println("Top Mezun Oldugu Bolum: "+top.mezunBolum);
    }
}

