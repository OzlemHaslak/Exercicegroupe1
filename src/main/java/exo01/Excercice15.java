package exo01;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.*;

public class Excercice15 {
    public static void main(String[] args) {
        //Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

        String str = "yavuz ozlem cigdem irem sinem";

        str = str.replaceAll("\\s", ""). replaceAll("\\p{Punct}", "");
        System.out.println(str.length()); // 25

        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan
        //          kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        Scanner input = new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();
        String names[]= new String[numOfStd];
        for( int i=1; i<=numOfStd; i++) {
            System.out.println("lutfen " + i + " ogrencinin ismini giriniz");
            names[i - 1] = input.next();
        }
        System.out.println(Arrays.toString(names));

       }}


