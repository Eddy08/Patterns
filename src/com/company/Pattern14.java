package com.company;

import java.util.Scanner;

public class Pattern14 {
    public static void main( String[] a){
        System.out.println("Please Enter a Number");
        Scanner s=new Scanner ( System.in );
        int constant= s.nextInt ();

        for(int l=0;l<constant;l++){
            for(int i=((constant-1)*4);i>l*4;i--){
                System.out.print("/");
            }
            for(int k=0;k<l*8;k++){
                System.out.print("*");
            }
            for(int j=((constant-1)*4);j>l*4;j--){
                System.out.print("\\");
            }
            System.out.println( );
        }
    }

}