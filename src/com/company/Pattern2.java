package com.company;

public class Pattern2 {
    public static void main( String a[]){
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
