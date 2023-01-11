package grupcalisma129;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        /*
        1.replaceAll(): bir grup datayi degistirmek icin
        2.replace (): grup olmasan tek bir harf ya da kelimeyi degistirmeyi aglar
        3.toLowerCase()
        4.contains
        5.charAt(
        6.startsWith()
        7.endsWith()
        8.trim()
        9.lenght()
        10.valueOf():
        11.substring()
        12.indexOf():
        13.lastIndexOf():
        14.isEmpty():
        15.split():
        16.isblank():
        17.equals()
        18.equalsIgnoreCase():
        19.concat():

        ASCII table :

         */
        //soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız




      /*  Soru 2) Kullanicidan email adresini girmesini isteyin,
                mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
                @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin



       */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen mail ardesinizi giriniz");
        String mail = input.nextLine();

        if(!mail.contains("gmail.com")){
            System.out.println("lutfen mail adresini giriniz");
        }else if(mail.endsWith("gmail.com")){
            System.out.println("mail adresiniz kaydedildi");
        }else System.out.println("lutfen yazimini kotrol edin");

       /* Soru 3)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
                "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.*/

        String str2 = "Java buyuk dunya kucuk";
        
        if(str2.contains("buyuk")){
            System.out.println(str2.toUpperCase());
        } else if (str2.contains("kucuk")) {
            
        }
            
        }


    }

