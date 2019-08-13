package com.company;

public class Pattern3 {
    public static void main( String a[]) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 0; k <= 3; k++) {
            for (int l = 2; l >= k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
