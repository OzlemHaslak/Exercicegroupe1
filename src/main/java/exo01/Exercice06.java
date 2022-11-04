package exo01;

public class Exercice06 {
    //Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız

    public static void main(String[] args) {

        String str2 = " Melek Line  ";
        int bosluksuz = str2.trim().length();
        int result = str2.length()-bosluksuz;
        if(result>0){
            System.out.println("basinda ya da sonunda bosluk var");
        }else
            System.out.println("basinda ya da sonunda bosluk yok");
    }
}
