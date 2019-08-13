package com.company;

public class Pattern7 {
    public static void main( String a[]){
        int k=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                k=k+1;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
