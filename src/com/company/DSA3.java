package com.company;

public class DSA3 {
    public static void main ( String[] args ) {

        // Loops with log(n) complexity
        for(int i=1;i<=1000000;i=i*2){
            System.out.println (i );
        }

        for(int j=524288;j>=1;j=j/2){
            System.out.println (j );
        }
        //Loops with log(logn) complexity
        for(int k=2 ;k<=1000000;k=(int)Math.pow(k,2)){
            System.out.println (k );
        }
     }
}
