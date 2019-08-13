package com.company;

import java.util.Scanner;

class Solution5 {
    public static void solution ( int n ) {

        for ( int w = 1; w <= n; w++ ) {
            for ( int i = 1; i <= n-1; i++ ) {
                System.out.print ( "+" );
                for ( int j = 1; j <= n; j++ ) {
                    System.out.print ( "=" );
                }

            } System.out.print ( "+" );
            for(int l=1;l<=n;l++){
                System.out.println("|" +"\t"+"|"+"\t"+"|");
            }
            System.out.println();
        }
    }
}
class Main5{
    public static void main( StringPractice a[]){
        System.out.println("Please Enter the size");
        Scanner s=new Scanner ( System.in );
        int n=s.nextInt ();

        Solution5 sol= new Solution5 ();
        sol.solution ( n );


    }
}