package exo01;

public class Exercice05 {
    //Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
    // trim() -- bir stringin basinda ve sonunda olan bosluklari siliyor

    public static void main(String[] args) {

        String str = "  Amerika  fransa  ";

        int uzunluk1 = str.replace(" ", "").length();
        int uzunluk2 = str.trim().length();
        int sonuc = uzunluk2 - uzunluk1;
        if(sonuc ==1){
            System.out.println("ortada tek bosluk var");
        }else System.out.println("ortada tek boslik yok");
    }
}
