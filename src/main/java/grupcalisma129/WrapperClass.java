package grupcalisma129;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {

     /*   Primitive             Wrapper
        byte     ==>        Byte
        short    ==>        Short
        int      ==>        Integer *****
        long     ==>        Long
        float    ==>        Float
        double   ==>        Double
        boolean  ==>        Boolean
        char     ==>        Character  *****
        18 h 45
//Ex : short data type’inin en kucuk ve en buyuk degerini ekrana yazdirin*/

        short kucukDeger = Short.MIN_VALUE;
        short buyukDeger = Short.MAX_VALUE;
        System.out.println(kucukDeger+" "+buyukDeger);



// kullanicadan iki sayi isteyin artimatih iselemi gerceklsetiriniz.

        // kullanicadan iki sayi isteyin artimatih iselemi gerceklsetiriniz.
        Scanner input =new Scanner(System.in);
        System.out.println("1. sayi giriniz");
        int sayi1=input.nextInt();
        System.out.println("2. sayi giriniz");
        int say2=input.nextInt();

        System.out.println(say2+sayi1);
        System.out.println(sayi1/say2);
        System.out.println(say2*sayi1);
        System.out.println(sayi1-say2);

        int x=5;
        int y=4;
        x=x+4;
        System.out.println(x);//9
        x=x/2;
        System.out.println(x);//4
        x=x%y;
        System.out.println(x);//0
        y=x;
        System.out.println(y);//0
        x= x*y;
        System.out.println(x-y);//0


        System.out.println(5+2==8);//false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ;
        System.out.println(sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8 ;
        System.out.println(sonuc2);//false

        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8 ;
        System.out.println(sonuc3);//false

        int mark1 =40;
        int mark2= 60;
        int mark3=30;
        System.out.println(mark1>30 && mark1<70);//
        System.out.println(mark2>=60 && mark3!=70);//
        System.out.println(mark3<100 || mark2>80);//
        System.out.println(mark3!=mark2 && mark2>mark1); //
        System.out.println(mark2<30 || mark2 >50 && mark2==70);//












    }
}
