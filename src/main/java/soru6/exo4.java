package soru6;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
         /*
            SORU 4:

            Create a program checks if a String is PALINDROME or not.
            If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
            For Example : "madam" or "nursesrun".

            Kullanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
            polindrome :tersten okunuşu da aynı olan ifadeierdir.
            ornek : Ey edip Adanada pide ye,  Traş niçin şart
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");

        String cumle = input.nextLine().toLowerCase();

        String yeniCumle = "";

        for (int i = cumle.length()-1; i >=0; i--) {
            yeniCumle = yeniCumle+cumle.charAt(i);

        }
        if (cumle.equals(yeniCumle)){
            System.out.println("cumle palindromdur");
        }else
            System.out.println("cumle palindrom degildir");
    }
}
