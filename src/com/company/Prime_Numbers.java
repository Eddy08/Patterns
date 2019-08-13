package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_Numbers {
    public static boolean isPrime(int N)
    {
        boolean res=true;
        for(int i=2;i*i<=N;i++){
            if(N%i!=0){

                for(int j=i*i;j<=N;j+=i){
                    if(N%j==0){
                        res=false;
                    }
                }
            }
            else{
                res=false;
            }
        }
        return res;
    }




    public static void sieveOfEratosthenes(int n) {
        //Intialize all array element to true    n=6
        boolean array[]=new boolean[n+1];// 0 1 2 3 4 5 6
        for(int i=1;i<n;i++){           // t t t t f t f

            array[i]=true;
        }
        //logic
        for(int i=2;i*i<=n;i++){// 2 3 5  multiples o(n log(logn))
            if(array[i]==true) {
                for ( int j = i * i; j <= n; j += i ) {
                    array[j] = false;
                }
            }
        }
        //Print Prime No,s
        for(int i=2;i<=n;i++){
            if(array[i]==true){
                if(n%i==0){
                    System.out.println ("Factors---->" +i);
                }
                System.out.print ( i+" ");
            }
        }
    }

    public static void main(String args[]){

        //O(n2)---> Complexity
        /*for(int i=1;i<=100;i++){
            for(int j=2;j<=i;j++){
                if(i==j){
                    System.out.print(j+" ");
                }
                else if(i%j==0){
                    break;
                }
            }
        }*/
        System.out.println ("Please Enter the Number upto Which you want to find Prime NO. ..:9" );
        Scanner sc=new Scanner ( System.in );
        int n=sc.nextInt();
        sieveOfEratosthenes ( n );
        System.out.println ( );
        System.out.println (isPrime(2));



    }
}
