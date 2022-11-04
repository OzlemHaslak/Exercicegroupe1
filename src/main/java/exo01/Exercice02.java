package exo01;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {
       /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
    c) Haziran, Temmuz, Ağustos için "Yaz"
    d) Eylül, Ekim, Kasım için "Sonbahar"
    e) Diğerleri için "Geçersiz ay adı"
        */
        String ay="suBat";
        String a=ay.toLowerCase();
        if (a.equals("ocak")||a.equals("subat")||a.equals("aralik")){
            System.out.println("kis");
        } else if (a.equals("mart")||a.equals("nisan")||a.equals("mayis")) {
            System.out.println("bahar");

        }else if (a.equals("haziran ")||a.equals("temmuz")||a.equals("agustos")) {
            System.out.println("yaz");

        }else if (a.equals("eylul")||a.equals("ekim")||a.equals("kasim")) {
            System.out.println("sonbahar");

        }else {
            System.out.println("gecersiz ay");
        }}}


