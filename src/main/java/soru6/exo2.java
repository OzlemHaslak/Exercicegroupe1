package soru6;

public class exo2 {
    public static void main(String[] args) {
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

    }
}
