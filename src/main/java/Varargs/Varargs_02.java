package Varargs;

public class Varargs_02 {
    //birden fazla sayilari toplayan bir method olusturun

    public static void main(String[] args) {
        toplayanMetod(5+10+15);
        int sum=0;
    }

    private static void toplayanMetod(int ...j) {
        int sum=0;
        for (int w:j ) {
            sum+=w;
        }
        System.out.println(sum);
    }
}
