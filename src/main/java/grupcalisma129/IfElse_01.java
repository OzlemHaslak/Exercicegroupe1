package grupcalisma129;

import java.util.Scanner;

public class IfElse_01 {
    public static void main(String[] args) {


        // EXAMPLE 1: Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazan kodu olusturunuz.

        char harf = 'A';

        if (harf >= 'A' && harf <= 'Z') {
            System.out.println("Buyuk harf");
        }

        // EXAMPLE 2: Verilen sayi cift sayi ise ekrana "Cift sayi" yazdiran kodu olusturun

        int i = 8;
        if (i % 2 == 0) {
            System.out.println("Cift sayi");
        }

        // EXAMPLE 3: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "harika sayi" yazdiran kodu olusturun

        int x = 1515;

        if (x < 300 || x > 1200) {
            System.out.println("harika sayi");
        }

        // EXAMPLE 4: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        int y = 15;

        if (y % 2 == 0) {
            System.out.println("cift sayi");
        } else
            System.out.println("tek sayi");


        System.out.println(y%2==0?"cift sayi":"tek sayi");

        // EXAMPLE 5: Verilen bir sayinin negetif, pozitif yada notr oldugunu soyleyen kodu yaziniz.

           int p = 0;

           if ( p<0){
               System.out.println("negatif");
           }else if (p>0) {
               System.out.println("pozitif");
           }else
               System.out.println("notr");


        /*
        EXAMPLE 6:

         Kullanici gun numarasini girsin kod gun ismini yazsin

         ==> Pazar 2 ==> Pazartesi 3 ==> Sali 4 ==> Carsamba 5 ==> Persembe 6 ==> Cuma 7 ==> Cumartesi
         */
    Scanner input = new Scanner(System.in);

        System.out.println(" gun numarasi giriniz");

       byte gun =input.nextByte();

        if (gun == 1) {
            System.out.println("pazar");
        }else if (gun == 2) {
            System.out.println("pazartesi");
        } else if (gun == 3) {
            System.out.println("sali");
        } else if (gun == 4) {
            System.out.println("carsamba");
        } else if (gun == 5) {
            System.out.println("persembe");
        } else if (gun == 6) {
            System.out.println("cuma");
        }else if (gun == 7) {
            System.out.println("cumartesi");
        }else
            System.out.println("gecerli bir gun giriniz");


    // EXAMPLE 7: Kullanicidan gun isimlerini aliniz haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.

        System.out.println("bir gun ismi giriniz");

        String gunIsmi = input.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("hafta sonu");
        }else if (gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsambari")||gunIsmi.equals("persembe")||gunIsmi.equals("cuma")) {
            System.out.println("hafta ici");
        }else
            System.out.println("gecerli bir gun giriniz");

        /*
        EXAMPLE 8:

        Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
        - 0-4 arasi "Bebek"
        - 5-12 arasi "Cocuk"
        - 13-20 arasi "Genc"
        - 21-30 arasi "Yetiskin
        Tanimlanmamis Evre
        Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
        */
//**********************************************************************************************************************
        /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */
//**********************************************************************************************************************
        /*
        EXAMPLE 10:

        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */

}}