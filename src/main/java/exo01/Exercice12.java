package exo01;

import java.util.Arrays;

public class Exercice12 {
    public static void main(String[] args) {

        int stdAge[] =new int [4];
        System.out.println(Arrays.toString(stdAge));
        stdAge [1]=11;
        stdAge [0]=12;
        stdAge [2]=13;
        stdAge [3]=14;
        System.out.println(Arrays.toString(stdAge));

        Arrays.sort(stdAge);
        System.out.println(Arrays.toString(stdAge));
        int ilk = stdAge[0];
        int son = stdAge[stdAge.length - 1];
        System.out.println(ilk+son);
        ////////////////////
        int k = 0;
        int s = 0;
        do{
            s=s+stdAge[k];
            k++;
        }while(k<stdAge.length);
        System.out.println(s);
    }
}
