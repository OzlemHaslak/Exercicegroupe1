package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class grupcalismasi1 {
    /*
    Soru 1:Verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun
           int arr[]={3,5,6,1,9,45,25,4,9,0};*/
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};


        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


  /*  Soru 2:Verilen array da istenen bir elelmentin var olup olamdıgını
           true false olarak yazdirarak gosteren bir method olusturun */


        System.out.println(Arrays.binarySearch(arr,3));



  /*  Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz
           int arr[][]={{3,1,7},{6,10,2}};
           */

        int arr2[][]={{3,1,7},{6,10,2}};

        int toplam = 0 ;

        for (int [] w : arr2) {
            for (int k : w) {

                toplam=toplam+k;
            }
        }
                System.out.println(toplam);


   /* Soru 4:Kullaniciya kac elementlik bir array olusturacagini sorun
           arrayi olusturup elementlei kullanicidan alip array atayin*/








   /* Soru 5:Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin*/

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle girirniz");
        String cumle = input.nextLine();
        int sayac =1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' '){
                sayac++;
            }

        }
        System.out.println("girirlen cumle "+sayac+"tane kelime vardir ");

    /*
    Soru 6:Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
           ekrana yazdiran java kodunu yaziniz. { {1,2,3}, {4,5}, {6} }




    Soru 7:Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
           int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3
           // Soru 7:Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
    //  int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3

    int arr[]={3,4,2,3,5,7,3,8,5,2,4};



    System.out.println(Arrays.toString(isteneniSil(arr)));

}


public static int[] isteneniSil(int [] arr){
    Scanner input = new Scanner(System.in);
    System.out.println("lutfen silinecek degeri giriniz");
    int silinecekElement =input.nextInt();
    int lenght = 0;

    for (int w: arr){
        if(w!=silinecekElement){
           lenght++;

        }
    }

    System.out.println(lenght);
     int [] brr = new int[lenght];
     int index = 0;
     for (int q : arr){
         if (q!=silinecekElement){
             brr [index] =q;
             index++;
         }
     }
     return brr;

   /* Soru 8:Verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir mehod olusturun
           orn: [1,3,5,3,5,6,1,7]
           output [1,3,5,6,7]
    Soru 9:Verilen bir listede istenen iki indexdeki elementlerin yerini kalici olarak degistiren bir method olusturun
    Soru10: Parametre olarak bir int ve istedigimiz kadar String alan en uzun kelimenin harf sayisi ile int parametre degerini
            carpip sonucu yazdiran bir method olusturun
    Soru11:Multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
           ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
           input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
    Soru12:Bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
           input : 1,2,-3,4,-5,-6
           output :-1,-2,3,-4,5,6
    Soru13:Verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
           yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
           int istenenToplam=9;
    Soru14:Write a java program that calculates the average value of array elements Print elements that are greater than avarage
          (dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
           input[]= {1,2,3,4,5,6,7}
           Output : 4
    Soru15: $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
           String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
    Soru16:given an int array and find the squares of the elements (Verilen bir int dizisi icin elemanlarin karelerini bulun )
           Example:{2,6,4,5,8,9}
           output:{4,36,16,25,64,81}
    Soru17:Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
           INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
           OUTPUT : [Veli,Omer]
     */
}}
