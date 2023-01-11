package Arrays;

import java.util.Arrays;

public class arrayKucukBuyukSirala {
    public static void main(String[] args) {
        /*
        soru bir array olusturunuz ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */
        int sayi[] = {5, 51, 84, 1, 55, 24, 3};

        Arrays.sort(sayi);

        System.out.println(Arrays.toString(sayi));
    }
    }