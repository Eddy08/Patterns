package com.company;

import java.util.Scanner;
class Solution4 {

    public static void solution4 ( int n ) {
     /*   *//*int a = n /10;
        int b = 2 * a;
        int c=50;*//*
        int i;
        int k=1;
        int m=1;
        int l;
       *//* for ( int j = 1; j <= 10; j++ ) {

            for ( i = k; i <= 10; i++ ) {

                System.out.print ( "\t"+i );


            }
            k=k+1;
            *//**//*for(l=i;l<=c;l=l*2){
                System.out.print ("\t"+l);

            }*//**//*

            System.out.println (  );


        }*//*
        for(int a=1,b=10,c=11,d=20,e=21,f=30;a<=10;a++,b--,c++,d--,e++,f--){
            System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f);
            System.out.println();
        }*/

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                System.out.print(i*j +"\t");
            }

        }
    }
}
class Main4 {
    public static void main ( String a[] ) {
        System.out.println("Please Enter a number");
        Scanner s= new Scanner ( System.in );
        int n=s.nextInt ();
        Solution4 sol=new Solution4();
        sol.solution4 ( n );

    }
}