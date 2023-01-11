package grupcalisma129;

import java.util.Arrays;
import java.util.Scanner;

public class Qa11_211220022 {

    public static void main(String[] args) {
          /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
           */
        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen bir kelime giriniz");
//
//        String str = input.nextLine();
//
//       String arr [] = str.split("");
//
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        int sayac = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i-1].equals(arr[i])){
//                sayac++;
//            }else {
//                System.out.println(arr[i-1]+" = "+(sayac+1));
//                sayac=0;
//            }
//            if (i==arr.length-1) {
//            System.out.println(arr[i]+ " = "+(sayac+1));
//
//        }
//        }


    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370 */

        int sayi = 153;

        int sonsayi = sayi % 10;
        System.out.println(sonsayi);

        int sayi2 = sayi /10;
        System.out.println(sayi2);

        int ortaSayi = sayi2 % 10;
        System.out.println(ortaSayi);

        int ilkSayi = sayi / 100;
        System.out.println(ilkSayi);

       int toplam = (ilkSayi * ilkSayi * ilkSayi) + (ortaSayi * ortaSayi * ortaSayi) + (sonsayi * sonsayi * sonsayi);
        System.out.println(toplam);



//     soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
//          gösteren program yazınız

        if (toplam == sayi ){
            System.out.println("Amstrong sayidir");
        }else
            System.out.println("Sayi Amstrong degildir");


    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */


    /*  Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".. adet sayi girdin, toplami..." yazdirin
    */


     /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3
     */
    }
}