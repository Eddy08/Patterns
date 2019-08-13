package com.company;

public class Pattern15 {
    public static void main ( String[] args ) {

        for(int i=1;i<=5;i++){
            if(i==4){
                for(int temp=1;temp<=6;temp++){
                    System.out.print("*\t");
                }
            }
            else{
                for(int temp=1;temp<=5;temp++){
                    System.out.print("\t");
                }
                System.out.print("*");
            }
            if(i!=4){
                System.out.print("\t" );
            }

            for(int k=1;k<i;k++){

                System.out.print(" \t");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*" );
                System.out.println ( );
            }
        }




        for(int i=3;i>=0;i--){
            if(i==3){
               for(int temp=1;temp<=6;temp++){
                   System.out.print("*\t");
               }
            }
            else{
                for(int temp=1;temp<=5;temp++){
                    System.out.print("\t" );
                }
                System.out.print("*");
            }
            if(i!=3){
                System.out.print("\t" );
            }

            for(int k=i;k>0;k--){

                System.out.print(" \t");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*" );
                System.out.println ( );
            }
        }
        }
    }

