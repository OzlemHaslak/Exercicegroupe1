package grupcalisma129;

import java.util.Scanner;

public class Q02_characters {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");

        String cumle = input.nextLine();

        System.out.println("Lutfen cumleden bir harf veriniz");

        char harf = input.next().charAt(0);

        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
            }
                System.out.println("harf = " +sayac);

        /*
 Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
 Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
 Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
 */
/*
        System.out.println("Lutfen bir sifre giriniz...");
        String pws = input.nextLine().trim().replaceAll("\\s+","");

        String tampws = pws.length()>9 ? "Geçerli Parola" : "Geçersiz Parola";

        System.out.println(tampws);

       /*
     Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
    a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "

 */
     /*   int a = 5;
        int b = 12;
        int c = 12;

        String hangiUcgen = a ==b && b ==c  ? "Eskenar": (a == b && b != c || b==c && a !=c || a==c && b!=a) ? "Ikizkener":"Cesit kenar";
        System.out.println(hangiUcgen);

/*
     Yazdırmak için switch ifadesini kullanınız.
    a) Aralık, Ocak, Şubat için "Kış"
    b) Mart, Nisan, Mayıs için "Bahar"
    c) Haziran, Temmuz, Ağustos için "Yaz"
    d) Eylül, Ekim, Kasım için "Güz"
    e) Diğerleri için "Geçersiz ay adı"

 */
        System.out.println("Bir ay ismi giriniz");
        String ay = input.next().toLowerCase();

        switch (ay){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("Gecerli bir ay giriniz");
        }
/*
     myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
     yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
     'A' ve 'a' için "İlk Karakter" yazdırınız.
     'B' ve 'b' için "İkinci Karakter" yazdırınız.
     'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
     'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
        Diğerleri için "Diğer Karakterleri" yazdırınız
 */


            }
        }


