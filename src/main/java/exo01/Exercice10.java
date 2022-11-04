package exo01;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println("java guzeldir");
        }
        for (int i = 10; i < 31; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 100; i > 49; i--) {
            System.out.print(i + ",");
        }
        System.out.println();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {

                System.out.print(i + ",");
            }
        }
        System.out.println();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {

                System.out.print(i + ",");
            }
        }
        System.out.println();
//hem5 hemde 3 nasil bolunur
        for (int i = 1; i < 100; i++) {
            if(i%3==0&&i%5==0) {
                System.out.println("Java guzeldir");
            }else if(i%3==0) {
                System.out.println("Java");
            }else if(i%5==0) {
                System.out.println("Guzeldir");
            }else System.out.println(i);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir isim girdiniz");

        String t="sinem";
        StringBuilder sb=new StringBuilder(t);
        System.out.println(sb.reverse());

        String s ="runnur";
        String r = "";
        Integer i=s.length()-1;
        do {
            String c = s.substring(i, i + 1);
            r = r + c;
            i--;
        }while (i>-1);
        if(r.equals(r)) {
            System.out.println(s + " palindromdur");
        }else{
            System.out.println(s+" palindrom degildir");

        }
        System.out.println("lutfen sayi giriniz");

        
        }

    }