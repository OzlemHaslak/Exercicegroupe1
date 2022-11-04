package exo01;

public class Exercice04 {
    public static void main(String[] args) {


        //Ayın numarasını girdiğinizde ayın adın
        // ı yazdırmak için gereken kodu yazınız. Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb
        int ayNo = 2;

        switch (ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ocaagustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 20:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecerli bir deger yaziniz");
        }
    }}