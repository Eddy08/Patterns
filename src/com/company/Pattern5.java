package com.company;

import java.util.Scanner;

public class Pattern5 {
    public static void main( String a[]){
        Scanner s=new Scanner( System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                if (i > 1 && i <= n-1 && j >1 && j <= n-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
