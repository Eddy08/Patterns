package com.company;

public class Pattern6 {
    public static void main( String a[]) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {

                if(i==1 && (j==1 || j==3)){

                    System.out.print(" ");
                }
                if (i > 1 && i < 3 && j >= 2 && j < 3) {
                    System.out.print(" ");
                }
                if (!(i == 1 && j >= 2 && j < 3) ){
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int k = 1; k <= 2; k++) {
            for (int l = 1; l <= 3; l++) {
                if (l > 1 && l < 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
