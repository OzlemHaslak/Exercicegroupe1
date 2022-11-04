package exo01;

public class Exo6 {
    public static void main(String[] args) {
        // 10 dan kucuk bir sayi gir ve faktoriyelini bul

        int sayi = 12345;
        int ters = 0;
        int kasa = 0;

       while (sayi>0){
           kasa =sayi%10;
           ters = ters*10 + kasa;
           sayi /= 10;
        }
        System.out.println(ters);
    }
}
