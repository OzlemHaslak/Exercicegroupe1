package exo01;

import java.util.Scanner;

public class Excercie14 {
    public static void main(String[] args) {
  //Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız. Örnek:12133455

        int sayi = 895118;
        String str = String.valueOf(sayi);
         int sum = 0;
         for ( int i=0; i<str.length(); i++ ){
            String a = str.substring(i, i+1);
             if(str.indexOf(a)==str.lastIndexOf(a)){

                 sum=sum+Integer.valueOf(a);
             }
         }
        System.out.println(sum);

        }}