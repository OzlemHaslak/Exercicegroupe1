package grupcalisma129;

public class IfStatements01 {
    public static void main(String[] args) {

       /* int a = 120;
        int b = 12;

        if (a == b) {
            System.out.println("verilen sayilar esitir");
        }
            if (a > 100) {
                System.out.println("a yuzden buyuk");
                System.out.println("body icinde tum kodlar calisir");

                if (a * b > 5) {
                    System.out.println("verilen sayilarin carpimi 5 den buyuk");
                }
            }*/


        int arr[][] = {{9, 14, 1}, {16, -22, 3}};

        System.out.println(m(arr));

    }

        public static int m(int[][] m) {

            int result = 3;

            for (int i = 1;     i < m.length;                              i++) {







                for (int k = 0;      k <  m[i].length;                       k++) {



                    result   +=    m [i]  [k] ;

                }

            }

            return result;



    }}