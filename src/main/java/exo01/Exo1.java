package exo01;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        //        1 2 3 4 5 6
        //         2 3 4 5 6
        //          3 4 5 6
        //           4 5 6
        //            5 6
        //             6

// yukaridaki sekli yazdiran kodu yaziniz

        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");

            }
            for (int j=i; j<7; j++){
                System.out.print(j+ " ");
        }
            System.out.println();

    }}}