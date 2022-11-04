package exo01;

public class Exo4 {
    public static void main(String[] args) {
        // bir sayinin asal sayi olup olmadığını kontrol etmek için kod yazınız

        int sayi = 107;
        int counter = 0;

        for(int i=2; i< sayi; i++){
            if ( sayi % i == 0){
                counter++;
                System.out.print(i+ " ");
            }
        }
        if (counter == 0){
            System.out.println("asal sayidir");
        }else {
            System.out.println("asal degil");
        }
    }

}
