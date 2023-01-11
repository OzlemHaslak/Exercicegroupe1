package Arrays;


import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
          /*
            SORU 1: Verilen 3 elemanli bir array'in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
                    ORNEK ==> array[1,2,3} ise output [2,3,1}
         */
        int a[] = {1, 2, 3};
        int gecici = a[0];
        for (int o = 0; o < a.length-1; o++){
            a[o] = a[o + 1];
    }
        a[a.length - 1]= gecici;
        System.out.println(Arrays.toString(a));

/*
            SORU 2: Verilen bir array'in tum elemanlarini toplayan bir program yazin.
         */
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);




        int carpim = 1;

        for (int i = 0; i < a.length; i++) {
            carpim *= a[i];

        }
        System.out.println(carpim);

        }
}
