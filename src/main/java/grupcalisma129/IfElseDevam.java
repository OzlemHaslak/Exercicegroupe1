package grupcalisma129;

import java.util.Scanner;

public class IfElseDevam {
   /* EXAMPLE 8:

    Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
        - 0-4 arasi "Bebek"
            - 5-12 arasi "Cocuk"
            - 13-20 arasi "Genc"
            - 21-30 arasi "Yetiskin
    Tanimlanmamis Evre
    Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
        */

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
     /*   System.out.println("lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        if (yas >= 0 && yas < 5) {
            System.out.println("Bebek");
        } else if (yas > 4 && yas < 13) {
            System.out.println("Cocuk");
        } else if (yas > 12 && yas < 21) {
            System.out.println("Genc");
        } else if (yas > 20 && yas < 31) {
            System.out.println("Yetiskin");
        } else
            System.out.println("gecerli bir yas giriniz");

        /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */
/*
        System.out.println("lutfen kutsal gun giriniz");

        String kutsalGun = input.next().toLowerCase();

        if (kutsalGun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (kutsalGun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (kutsalGun.equals("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        } else
            System.out.println("kutsal gun degil...");

        /*
        EXAMPLE 10:

        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */
/*
        System.out.println("lutfen iki sayi giriniz");

        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println("lutfen bir islem giriniz + , -  , / , *  giriniz");

        char islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println(x + "+" + y + "=" + (x + y));
                break;
            case '-':
                System.out.println(x + "-" + y + "=" + (x - y));
                break;
            case '/':
                System.out.println(x + "/" + y + "=" + (x / y));
                break;
            case '*':
                System.out.println(x + "*" + y + "=" + (x * y));
                break;
            default:
                System.out.println("bu islem tanimlanmistir");

        }


    /*                 ********* if Else Statement *******


    EXAMPLE 11:

    Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
    kare olup olmadigini yazdiriniz
     */
/*
        System.out.println("lutfen dikdortgenin iki kenar uzunlugun veriniz");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a == b ? "bu bir karedir": "dikdortgen kara degil");
/*


    /*
    EXAMPLE 12:

    Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdiriniz
     */
/*
        System.out.println("lutfen bir karakter giriniz");

       char c = input.next().charAt(0);

        if( c >= 'a' && c <= 'z'  ||  c >= 'A' && c <= 'Z' ){
            System.out.println("karakter harfdir");
        }else System.out.println("girdiginiz harf degildir");

*/

    /*
    EXAMPLE 13:

    Kullaniciya yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, calismalisin",
    65'e esit veya buyukse "Emekli olabilisin" yazdiriniz
     */
       /* System.out.println("yasinizi giriniz");

       byte yas1 = input.nextByte();

       if(yas1<65){
           System.out.println("emekli olamazsin, calismalisin");
       }else
           System.out.println("Emekli olabilisin");

    /*
    EXAMPLE 14:

    Kullanicidan bir ucgen uc kenar uzunlugunu alin eger uc kenar uzunlugunu birbirine esit ise
    ekrana "Eskenar ucgen " yazdiriniz. diger durumlarda ekrana "Eskenar degil" yazdiriniz
     */

      /*  System.out.println("uc kenar giriniz");
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();

        if (f == g && g == h) {
            System.out.println("eskenar ucgen");
        }else
            System.out.println("eskenar degil");

       /*
        System.out.println((f==g&&g==h)? "eskenar ucgen" : "eskenar degil");
        Scanner input4 = new Scanner(System.in);
        System.out.println("lutfen ucgenun kenar uzunluklarini griiniz");

        double k1=Math.abs(input4.nextDouble());
        double k2=Math.abs(input4.nextDouble());
        double k3=Math.abs(input4.nextDouble());

        if(k1<=0 || k2<=0 || k3<=0){
            System.out.println("ucgenin kenarlari sifir ve negatif olamaz");
        }else if(k1==k2 && k2==k3){
            System.out.println("eskenar ucgendir");
        }else {
            System.out.println("eskenar ucgen degildir");
        }
    /*
    EXAMPLE 15 :

    Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun isminin 1.,2. ve 3.harflerini
   ilk harf buyuk diger ikisi kucuk olarak yazdirini, gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdiriniz
     */

     /*   System.out.println("Gun ismi giriniz");

        String gunIsmi1 = input.nextLine().toLowerCase();

        String gunIsmi2 = gunIsmi1.substring(0,1).toUpperCase();
        System.out.println(gunIsmi2);



    /*
    EXAMPLE 16 :

    Kullanicidan iki sayi isteyin, sayilarin ikisi de positif ise sayilarin toplamını yazdirin,
    sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere
    sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin, sayilardan sifira esit olan varsa
    "sifir carpmaya gore yutan elemandir" yazdirin.
    */

        //*******************************************************************************************************

    /*

   EXAMPLE 17 :

   Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
   50'den kucukse "D", 51-60 arasi "C", 60-80 arasi "B", 80'nin uzerinden ise "A"
   */
/*
        System.out.println("lutfen notunuzu giriniz");

        byte note = input.nextByte();

        if (note>=0 && note <=50){
            System.out.println("notunuz D");
        } else if (note >=51 && note <=60 ) {
            System.out.println("notunuz C");
        } else if (note >=61 && note <=80) {
            System.out.println("notunuz B");
        } else if (note >=81 && note <=100) {
            System.out.println("notunuz A");
        }else
            System.out.println("gecerli bir note giriniz");


    /* Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
            teklif 80.000 arasinda ise "Kabul ediyorum ",
            60 - 80.000 arasinda ise "Konusabiliriz"
            60.000 'nin altinda ise "Maalesef Kabul edemem" yazdirin
            */
        //************************************************************************************************

    /*
    EXAMPLE 18 :

    Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.

    Kullanicidan bir sifre girmasini isteyin

    Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin

    Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin
         */

        System.out.println("lutfen password giriniz");

        String password = input.nextLine();

       if(password.charAt(0)=='A' || password.charAt(0)=='z' ){
                   System.out.println("Gecerli Sifre");
       }else
        System.out.println("Gecersiz Sifre");
    /*
    EXAMPLE 19 :

    Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e bolunuyorsa son rakamini kontrol
    edin. Girdigi sayi 5'e bolunuyorsa son eakamini kontrol edin. Son Rakami 0 ise ekrana "5'e bolunen
    cift sayi" yazdirin . son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin.
    Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
     */
        System.out.println( "4 basamakli bir sayi giriniz");

        int i = input.nextInt();



    /*
    EXAMPLE 20 :  INTERVIEW QUESTION

    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
    Kural 2 : 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3 : 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 'un kati olan yillar artik yildir
     */
//********************************************************************************************************************************

        //  ****************************Nested If Else Statements *******************


    /*
    EXAMPLE 21 :   INTERVIEW QUESTION

    Kullanicidan artk yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
    Kural 2 : 4 'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
     */
        //********************************************************************************************************************************


        //    *****************Ternary **************

    /*
    EXAMPLE 22 :

    Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere gore dikdortgenin
    kare olup olmadigini yazdiriniz
      */

        //************************************************************************************************

    /*
    EXAMPLE 23 :

    Kullanicidan bir sayi alin ve sayi 3 basamakli ise "uc basamakli sayi " , yoksa "Uc basamakli degil " yazdiriniz

     */

    }}