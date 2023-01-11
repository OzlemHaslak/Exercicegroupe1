package grupcalisma129;

import java.util.Scanner;

public class qa11exo01 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = input.next();

        System.out.println("lutfen bir sayi giriniz");
        byte sayi = input.nextByte();




       /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        System.out.println("Pozitif sayi giriniz");

        int num1 = input.nextInt();

        if (num1 >0){
            if ((num1% 2 != 0)&&(num1%3 != 0)&&(num1%5 != 0)&&(num1%7 != 0)){
                System.out.println("asal sayi " + num1);
            }else
                System.out.println("asil degildir");
        }else System.out.println("positif sayi giriniz");

        System.out.println(" Pozitif sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi2 = scan.nextInt();

        int sayac = 0;
        int i;

        if (sayi>0) {

            for (i = 1; i <= sayi2; i++) {
                if (sayi % i == 0)
                    sayac++;
            }
            if (sayac == 2) {
                System.out.println("Asal");
            } else {
                System.out.println("Asal Değil");
            }
        }else System.out.println("Pozitif sayi giriniz");

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        System.out.println("Cumle giriniz");
        String cumle1 = input.nextLine();
        System.out.println("Hangi harfe bakacaksiniz");
        char ch = input.next().charAt(0); //tek bir karakter aliyoruz
        int sayac1 = 0;

        for (int i1 = 0; i1 < cumle1.length(); i1++) {

            if (cumle1.charAt(i1) == ch) {
                sayac++;
            }
        }
        System.out.println(ch + " harfi " + sayac + " kere var");
          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    }
}
