package okul_projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulSistemi {
    /*2. Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
    aşağıdaki gibi bir menü gösterilsin.
    ====================================
     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
    ====================================
     1- ÖĞRENCİ İŞLEMLERİ
     2- ÖĞRETMEN İŞLEMLERİ
     Q- ÇIKIŞ


     */
    static Scanner scanner = new Scanner(System.in);

    static List<Ogrenci> ogrenci = new ArrayList<>();


    public static void yonetimPaneli(){
        System.out.println("====================================\n" +
                " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n" +
                " 1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ");
    }

    public static void islemSec() {
        System.out.println("Yapacaginiz islemi seciniz lutfen..");

        String secim = scanner.nextLine();

        if (secim.equalsIgnoreCase("1")) {
            ogrenciIslemleri();

        } else if (secim.equalsIgnoreCase("2")) {

        } else if (secim.equalsIgnoreCase("Q")) {

        } else {
            System.out.println("Lutfen gecerli bir giris yapiniz..");
            islemSec();
        }
    }
        public static void cikisIslemi(){
            System.out.println("Cikisiniz basarili bir sekilde gerceklestirilmistir");
            System.exit(0);
        }
public static void ogrenciIslemleri(){
    System.out.println("============= İŞLEMLER =============\n" +
            " 1-EKLEME\n" +
            " 2-ARAMA\n" +
            " 3-LİSTELEME\n" +
            " 4-SİLME\n" +
            " 5-ANA MENÜ\n" +
            " Q-ÇIKIŞ\n" +
            "SEÇİMİNİZ:");

//    }public void register() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ad-Soyad:");
//        String name = scanner.nextLine();
//
//        String username;
//        boolean existUsername;
//        do {
//            System.out.println("Kullanici adini giriniz");
//            username = scanner.nextLine();
//            existUsername = usernameList.contains(username);
//            if (existUsername) {
//                System.out.println("Bu username daha once kullanilmistir. Yeni bir username deneyiniz.");
//            }
//        } while (existUsername);

}

    }










