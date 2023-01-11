package soru6;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
         /*
            SORU 6:

            Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz...");

        String str = input.nextLine();

        System.out.println("lutfen bir harf giriniz...");

        char ch = input.next().charAt(0);

        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {
           if ( str.charAt(i)==ch) {
               sayac++;
           }
        }
        System.out.println(ch +" " + sayac);
    }
}
