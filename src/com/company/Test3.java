package com.company;

import java.util.Scanner;

class Solution3 {
    public void solution3(int N,int M) {

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(" ");
            }

            System.out.print("|");
        }
        System.out.println();
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(j);
            }
            System.out.print(0);

        }
    }
}

class Main3{
    public static void main( String a[]){
        System.out.println("Please Enter the No.");
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        System.out.println("Please Enter the width");
        Scanner s1=new Scanner(System.in);
        int M=s1.nextInt();

        Solution3 sol= new Solution3();
        sol.solution3(N,M);
    }
}