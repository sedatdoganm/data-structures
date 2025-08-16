
import java.sql.SQLOutput;
import java.util.Scanner;

public class LinkedListOtogaleri {
    OtogaleriNode head = null;
    OtogaleriNode tail = null;

    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyati;
    int satisFiyati;
    String aciklama;

    Scanner scanner = new Scanner(System.in);

    public OtogaleriNode otomobilBilgileriniGir() {
        System.out.print("Plaka: ");
        String plaka = scanner.nextLine();
        System.out.print("Marka: ");
        String marka = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Renk: ");
        String renk = scanner.nextLine();
        System.out.print("Alis Fiyati: ");
        int alisFiyati = scanner.nextInt();
        scanner.nextLine();  // Enter tuşunu temizle
        System.out.print("Aciklama: ");
        String aciklama = scanner.nextLine();

        return new OtogaleriNode(plaka, marka, model, renk, alisFiyati, aciklama);
    }
    public void basaOtomobilEkle(){
        OtogaleriNode otomobil =  otomobilBilgileriniGir();
        if(head == null){
            head = otomobil;
            tail = otomobil;
            tail.next = head;
        }
        else{
            otomobil.next = head;
            head = otomobil;
            tail.next = head;
        }
    }
    public void sonaOtomobilEkle(){
        OtogaleriNode otomobil =  otomobilBilgileriniGir();
        if(head == null){
            head = otomobil;
            tail = otomobil;
            tail.next = head;
            return;
        }
        else{
            tail.next = otomobil;
            tail = otomobil;
            tail.next = head;
        }
    }
    public void arayaOtomobilEkle(int index){
        OtogaleriNode otomobil =  otomobilBilgileriniGir();

        if(head == null){
            head = otomobil;
            tail = otomobil;
            tail.next = head;
            return;
        }

        int n = 0;
        OtogaleriNode temp = head;
        do {
            n++;
            temp = temp.next;
        } while (temp != head);

        if(index <= 0){
            otomobil.next = head;
            head = otomobil;
            tail.next = head;
        }
        else if(index >= n){
            tail.next = otomobil;
            tail = otomobil;
            tail.next = head;
        }
        else{
            OtogaleriNode temp2 = head;
            temp = head;
            for(int i = 0; i < index; i++){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = otomobil;
            otomobil.next = temp;
        }
    }
    public void bastanOtomobilSil(){;
        if(head == null){
            System.out.println("Silinecek otomobil yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Silinebilecek tek otomobil de silindi!");
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }
    public void sondanOtomobilSil(){
        if(head == null){
            System.out.println("Silinecek otomobil yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Silinebilecek tek otomobil de silindi!");
        }
        else{
            OtogaleriNode temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = head; // dairesel'de liste bos olmadigi surece null'u göstermeyecek!
            tail = temp;
        }
    }
    public void aradanOtomobilSil(int index){
        if(head == null){
            System.out.println("Silinecek otomobil yok!");
        }
        else if(head == tail){
            head = null;
            tail = null;
            System.out.println("Silinbileecek tek otomobil de silindi!");
        }
        else{

            int n = 0;
            OtogaleriNode temp = head;
            do{
                n++;
                temp = temp.next;
            }while(temp != head);

            if(index<=0){
                head = head.next;
                tail.next = head;
            }
            else if(index >= n){
                temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                temp.next = head; // dairesel'de liste bos olmadigi surece null'u göstermeyecek!
                tail = temp;
                tail.next = head;
            }
            else{
                temp = head;
                OtogaleriNode temp2 = head;
                for(int i = 0; i < index; i++){
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
                if(temp == tail){
                    tail = temp2;
                }
            }
        }
    }
    public void otomobilListele(){
        if(head == null){
            System.out.println("Listelenecek arac yok!");
        }
        else{
            OtogaleriNode temp = head;
            do{
                System.out.println("************");
                System.out.println("Plaka: "+temp.plaka);
                System.out.println("Marka: "+temp.marka);
                System.out.println("Model: "+temp.model);
                System.out.println("Renk: " +temp.renk);
                System.out.println("Alis Fiyati: "+temp.alisFiyati);
                System.out.println("Satis Fiyati: "+temp.satisFiyati);
                System.out.println("Aciklama: "+temp.aciklama);
                temp = temp.next;
            }while(temp != head);
        }
    }
    public void enPahaliOtomobiliGetir(){
        if(head == null){
            System.out.println("Listede hic arac yok!");
        }

        OtogaleriNode temp = head;
        int enPahali = head.satisFiyati;
        do {
            if(temp.satisFiyati > enPahali){
                enPahali = temp.satisFiyati;
            }
            temp = temp.next;
        } while(temp != head);
        System.out.println("En pahali aracin plakasi ve fiyati: ");
    }
    public void aracAra(String plaka){
        if(head == null){
            System.out.println("Arayabilecegin bir arac yok!");
        }
        boolean varMi = false;
        OtogaleriNode temp = head;
        do{
            if(temp.plaka.equals(plaka)){
                varMi = true;
                break;
            }
            temp = temp.next;
        }while(temp != head);

        if(!varMi){
            System.out.println("Arayabilecegin bir arac yok!");
        }
        else{
            System.out.println(plaka+ " plakali arac bulundu!");
        }
    }
}
