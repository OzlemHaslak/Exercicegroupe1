package grupcalisma129;

public class exoForPalindrom {
    public static void main(String[] args) {
        /*
120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız.

 */
//        int i=120;
//        while(i>10) {
//            if (i % 4 == 0 && i % 6 == 0) {
//                System.out.print(i + " ");//120 108 96 84 72 60 48 36 24 12
//            }
//            i--;
//        }

        String str1 ="Java";
        String str2 ="Java";
        System.out.println(str1==str2);

          //  Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız. Örneğin; accessories ´ ces

//        String s = "accessories";
//        String d = "";
//        for(Integer i=0; i<s.length(); i++){
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c)!=s.lastIndexOf(c)){
//                if(!d.contains(c)){
//                    d = d + c;
//                }
//            }
//        }
//        System.out.println(d);

        //Exemple: Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
// Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.

        String str3 ="anna";
        String str4 = "";

        for (int i = str3.length()-1 ; i>-1 ; i--){

            String ch =str3.substring(i, i+1);

            str4 = str4 + ch ;

        }
if (str3.equals(str4)){
    System.out.println("polindromdur");
}else System.out.println("polindrom degildir");



    }


}
