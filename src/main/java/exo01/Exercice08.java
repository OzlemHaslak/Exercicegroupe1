package exo01;

public class Exercice08 {
    public static void main(String[] args) {
        //Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız
        //indexOf("a"), indexOf("a","5")
        //lastIndexOf("a"), lastIndexOf("a",17)
        String str="Java calismaya";
        boolean buyukHarfMi=str.charAt(0)>='A'&&str.charAt(0)<='Z';
        int sonIndex=str.length()-1;
        boolean noktaMi= str.charAt(sonIndex)=='.';
        if(buyukHarfMi&&noktaMi) {
            System.out.println("gecerli");
        }else
            System.out.println("gecersiz");

        boolean buyukMu =str.substring(0,1).equals(str.substring(0,1).replaceAll("[^A-Z]",""));
        boolean son = str.lastIndexOf('.')== sonIndex;
        if(buyukMu&&son) {
            System.out.println("gecerli");
        }else{
            System.out.println("gecersiz");
        }
    }

}
