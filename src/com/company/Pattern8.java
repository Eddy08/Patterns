package com.company;

public class Pattern8 {
    public static void main( String a[]){
        int k=1;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");

            }
            for(int l=0;l<=i;l++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
