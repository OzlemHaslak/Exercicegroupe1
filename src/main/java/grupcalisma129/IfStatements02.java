package grupcalisma129;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();
        if(sayi%2==0) {
            System.out.println("sayi cift sayidir");
        }else System.out.println("sayi tek sayidir");
    }
}
