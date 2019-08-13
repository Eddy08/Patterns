package com.company;

import java.util.Scanner;
class Solution {
    public void solution(int N) {
        int c = 1;



        for (int j = 1; j <= N; j++) {
            System.out.print(j);
        }
        for (int k = N; k >= 1; k--) {
            System.out.print(k);
        }
        System.out.println();



        for (int l = N - 1; l >= 1; l--) {

            for (int m = 1; m <= l; m++) {
                System.out.print(m);
            }
            for(int n=1;n<=N-l;n++){
                System.out.print("*");
            }

            for(int n=1;n<=N-l;n++){
                System.out.print("*");
            }
            for (int m = l; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }

    }
}


class Main {
    public static void main ( String a[] ) {
        System.out.println ( "Please Enter the No." );
        Scanner s = new Scanner ( System.in );
        int N = s.nextInt ( );
        Solution sol = new Solution ( );
        sol.solution ( N );
    }
}