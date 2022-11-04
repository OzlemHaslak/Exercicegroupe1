package exo01;
    import java.util.Arrays;

public class Exercice13 {
    public static void main(String[] args) {

      //asagidaki multi dimensional array'in tum elemanlarinin carpimini ekrana
       // yazdiran bir method yaziniz (1,2,3}, {4.5.6)


        int[] x = new int[6];

        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        x[5] = 6;
        System.out.println(Arrays.toString(x));
        System.out.println(x[6]);

        int i = 1;
        while ( i<7) {
            i ++;
        }
    }

    }
