package soru6;

public class exo3 {
    public static void main(String[] args) {
         /*
            SORU 3:

            Perfect Number (Mukemmel sayi)
            Kullanici tarafindan bir sayiya kadar olan sayilarin,
            mukemmel olup olmadigini bulan method yaziniz.
            Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
            kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))

            ORNEK: (6, 28, 496, 8128)
            INPUT      : 6
            OUTPUT     :  1,2,3
        */


        int num = 7;
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
    public static boolean isPerfect(int num) {
        int sum = 0; // rakamlarin toplamini almak icin konteyner
        for (int i = 1; i < num; i++) { // dongu ile rakamlarin bolenlerini buluyoruz
            if (num % i == 0) { // eger bolenlerini bulduysak sum koteyner ina atyoruz
                sum += i;
            }
        }
        return sum == num; // sum dakilerin toplami ile sayi esit ise perfect num diyoruz sartimizi yukari yaziyoruz
    }
  }