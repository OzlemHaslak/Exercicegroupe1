package exo01;

public class Exo2 {
    public static void main(String[] args) {
        //while loop ile 3 ten 13 e kadar tek sayilari yazdirin
        int sum = 0;
        int i = 3;
        while (i <= 13) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum= sum+ i;
            }
            i++;
        }
        System.out.println();
        System.out.println(sum);
    }
}
