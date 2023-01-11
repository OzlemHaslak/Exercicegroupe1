package soru6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {


 /*
            SORU 5:

            Kullanicidan toplanmak uzere sayilar isteyin
            sayi adedi 10'u gecerse veya toplam 500 'u gecerse
            bu kadar sayi yeter
            ".. adet sayi girdin, toplami..." yazdirin
         */

        Scanner input = new Scanner(System.in);

        int sum=0; //toplam konteyner

        for (int i = 1; i < 100; i++) { //Sayaci burda olusturmus oluyoruz
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = input.nextInt();
            sum+=sayi;

            if(sum>500 || i>10){
                System.out.println("Bu kadar sayi yeter \n"+i+" adet sayi girdin, toplami = "+sum);
                break;
            }
        }
    }
    }

