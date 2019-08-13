package com.company;

import java.util.Scanner;

class Solution2 {
    public void Solution2(int N) {
        int a;
        a = (N * 2) - 1;
        int b;
        b=a-2;
        for (int i = 1; i <= a; i++) {
            if (i == 1 || i == a) {
                for (int j = 1; j <= a; j++) {
                    System.out.print(N);
                }
                System.out.println();

            }





            else if (i > 1 && i <N) {

                for(int k=N;k>N-i;k--){
                    System.out.print(k);
                }
                for(int j=N-i;j>=1;j--){

                    System.out.print(N-i);
                }
                for(int j=N-i;j>1;j--){

                    System.out.print(N-i);
                }
                for(int k=N-i+1;k<=N;k++){
                    System.out.print(k);
                }
                System.out.println();

            }

            else if (i > N && i <a) {
                for(int j=a-N+1;j>i-N;j--){
                    System.out.print(j);
                }
                for(int k=i-N;k>1;k--){
                    System.out.print (i-N+1);
                }
                for(int k=i-N;k>=1;k--){
                    System.out.print (i-N+1);
                }
                for(int j=i-N+1;j<=N;j++){
                    System.out.print(j);
                }
                System.out.println();

            }

        }
    }
}
class Main2{
    public static void main( String a[]) {
        System.out.println("Please Enter No.");
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        Solution2 sol=new Solution2();
        sol.Solution2(N);
    }
}