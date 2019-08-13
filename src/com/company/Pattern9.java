package com.company;

public class Pattern9 {
    public static void main( String a[]) {

        for (int i = 1; i <= 2; i++) {

            for(int k=i-2;k<=2;k++) {
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--) {
                System.out.print("* ");
            }
            for(int k=i-1;k<=2;k++) {
                System.out.print(" ");
            }System.out.println();
        }

        for(int m = 1; m <= 3; m++) {

            for(int k=m+1;k>=1;k--) {
                System.out.print(" ");
            }
            for(int l=m;l<=3;l++) {
                System.out.print("* ");
            }
            for(int k=m+1;k>=1;k--) {
                System.out.print(" ");
            }System.out.println();
        }System.out.println();
    }
}
