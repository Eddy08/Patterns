package com.company;

public class Pattern11 {
    public static void main( String a[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(j);
            }
            for(int k=1+1;k<=i;k++){
                System.out.print("*");
            }for(int q=1+1;q<=i;q++)
            {
                System.out.print("*");
            }
            for(int p=4;p>=i;p--){
                System.out.print(p-i+1);
            }
            System.out.println();
        }
    }
}
