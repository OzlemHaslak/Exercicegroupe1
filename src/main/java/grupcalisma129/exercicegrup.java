package grupcalisma129;

import java.util.Scanner;

public class exercicegrup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* TASK:
     tas >makas
     makas >kagit
     kagit >tas
Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
 */


        int sibelPuani = 0;
        int RakipPuani = 0;

        while (true) {//sart olana kadar devam ediyor
            System.out.println("Lütfen seçiminizi yapın: tas, kagit, makas");//kullanicidan secim istiyor
            String sibelSecimi = sc.nextLine();//isim girecegi icin String konteyner actik
            double rakipSecimSayisi = Math.random() * 3;

            /*
            Math.random() methodu 0 ile 1 arasında bir sayı döndürür (dahil değil).
             Bu sayının 3 ile çarpımı ise 0 ile 3 arasında bir sayı döndürecektir (dahil değil).
             Örneğin, Math.random() methodu 0.7 gibi bir sayı döndürdüğünde
            , Math.random() * 3 0.7 * 3 = 2.1 gibi bir sayı döndürecektir.
             Bu sayıyı kullanarak rakibin rastgele bir seçim yapması sağlanmak istenmiş.
             */

            String bilgisayarSecimi;
            if (rakipSecimSayisi < 1) {
                bilgisayarSecimi = "tas";
            } else if (rakipSecimSayisi < 2) {
                bilgisayarSecimi = "kagit";
            } else {
                bilgisayarSecimi = "makas";
            }

            if (sibelSecimi.equals(bilgisayarSecimi)) {
                System.out.println("Berabere kaldınız!");
            } else if (sibelSecimi.equals("tas")) {
                if (bilgisayarSecimi.equals("makas")) {
                    System.out.println("sibel Kazandı!");
                    sibelPuani++;
                } else {
                    System.out.println("rakip kazandı!");
                    RakipPuani++;
                }
            } else if (sibelSecimi.equals("kagit")) {
                if (bilgisayarSecimi.equals("tas")) {
                    System.out.println("sibel Kazandı!");
                    sibelPuani++;
                } else {
                    System.out.println("rakipkazandı!");
                    RakipPuani++;
                }
            } else if (sibelSecimi.equals("makas")) {
                if (bilgisayarSecimi.equals("kagit")) {
                    System.out.println("sibel kazandi!");
                    sibelPuani++;
                } else {
                    System.out.println("rakip kazandı!");
                    RakipPuani++;
                }
            }

            System.out.println("Tekrar oynamak ister misiniz? (evet/hayır)");
            String tekrarOyna = sc.nextLine();
            if (!tekrarOyna.equals("evet")) {
                break;
            }
        }

        System.out.println("Oyun bitti. Son puan: Siz - " + sibelPuani + "rakip - " + RakipPuani);
    }
}
