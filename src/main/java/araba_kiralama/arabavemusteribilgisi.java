package araba_kiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arabavemusteribilgisi extends aracListesi {

    static List<aracListesi> aracTalepListesi = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int kiralanacakGunSayisi;

    private static void getAraba(String mercedes, String maybach, String diesel, String automatic, int i) {
    }

    public static void aracTalepEt() {
        System.out.println("Lutfen araci alacaginiz sehri yaziniz");
        String alinacakSehir = scanner.nextLine();

        System.out.println("Lutfen araci alacaginiz gunu yaziniz (Ornek 12.05): ");
        String alinacakGun = scanner.nextLine();

        System.out.println("Lutfen alis saatini yaziniz (Ornek 15:00): ");
        String alisSaati = scanner.next();

        System.out.println("Lutfen araci teslim edeceginiz gunu yaziniz (Ornek 12.05): ");
        String teslimGunu = scanner.nextLine();

        System.out.println("Lutfen araci teslim edeceginiz saati yaziniz (Ornek 12:05): ");
        String teslimSaati = scanner.nextLine();

        //burada bilgileri vercegimiz ekrani hazirliyoruz

        System.out.println("\033[33m \n********************************************** \033[0m");

        String aGun = alinacakGun.substring(0,2); //12.05
        int intAGun = Integer.parseInt(aGun);

        String aAy = alinacakGun.substring(3);
        int intAAy = Integer.parseInt(aAy);
        System.out.println("alis tarihi : "+intAAy+"."+intAAy);

        String tGun = alinacakGun.substring(0,2); //15.05
        int inttGun = Integer.parseInt(aGun);

        String tAy = alinacakGun.substring(3);
        int inttAy = Integer.parseInt(aAy);
        System.out.println("Teslim tarihi : "+inttGun+"."+inttAy);

        //simdi alis tarhini teslim gununden once olmesini engelliyoruz

        if (( intAAy>inttAy)){
            System.out.println("araci aldiginiz ay teslim tarihinden sonra olamaz");
            aracTalepEt();//burada kullanicin tekrar giris yapmasini sagliyoruz


        } else if (intAGun>inttGun) {
            System.out.println("Araci aldiginiz gun teslim tarihinden sonra olamaz");


        }else {

        }
        kiralanacakGunSayisi=(inttAy-intAAy)*30 + (inttGun-intAGun);
        System.out.println("\033[36m Arac toplam " + kiralanacakGunSayisi + " gün kiralanmistir. \033[0m");

        System.out.println("\033[33m ********************************************** \033[0m");



    }
    // Simdi arabalari isteyecegiz
    public static void arabaOzellikleri(){

        aracListesi mercedesMaybach=new aracListesi("MERCEDES", "maybach", "Diesel", "Automatic",250);
        aracListesi audi           =new  aracListesi("AUDI", "R8", "Diesel", "Automatic",350);
        aracListesi teslaModelY    =new aracListesi("TESLA", "Model Y", "Electric", "Automatic",150);
        aracListesi bmwX5          =new aracListesi("BMW", "X5", "Essence", "Manuel",100);
        aracListesi bmwI3          =new aracListesi("BMW", "I3", "Electric", "Automatic",150);
        aracListesi renaultZOE     =new aracListesi("RENAULT", "ZOE", "Electric", "Automatic",75);
        aracListesi citroenC5      =new aracListesi("Citroen", "C5", "Essence", "Manuel",100);


        System.out.println("\033[34m \n***** **** *** ** * Arac talep listesi * ** *** **** ***** \033[0m");
        System.out.println("Lutfen talep ettiginiz araci seciniz" +
                "\n 1. MERCEDES - MayBach - Diesel - Automatic - €250" +
                "\n 2. AUDI R8 - R8 - Diesel - Automatic - €350" +
                "\n 3. TESLA -  Model Y - Electric - Automatic- €150" +
                "\n 4. BMW - X5 - Essence - Manuel - €100" +
                "\n 5. BMW - I3 - Electric - Automatic - €150" +
                "\n 6. RENAULT - ZOE - Electric - Automatic - €75" +
                "\n 7. CITROEN - C5 - Essnce - Manuel - 100");

        int secim=0;
        try {
            secim = scanner.nextInt();

        }catch (Exception e) {
            e.printStackTrace();
        }
        switch (secim){

            case 1:
                getAraba("MERCEDES","MAYBACH","DIESEL","AUTOMATIC",250);
                int odenecekMiktar1 = kiralanacakGunSayisi*250;
                System.out.println("odenecek miktar E"+ odenecekMiktar1);
                islemDevamEt();
                break;




    }
}

    private static void islemDevamEt() {
    }


    private static void getAraba() {
    }}