package exo01;


import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        /* Asagidaki secenekler dogrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullan- mayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre" */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Sifre Giriniz");
        String sifre= scan.nextLine();
        boolean first=sifre.replaceAll(" ","").length()>7;
        boolean second=sifre.contains(" ");
        if(second){ System.out.println("Sifrede bosluk karakteri kullan-mayin");
        } else if (first)
        { System.out.println("Gecerli sifre");
        }else
        { System.out.println("Gecersiz sifre"); } } }

