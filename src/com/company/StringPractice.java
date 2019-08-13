package com.company;

import java.util.Arrays;

public class StringPractice {
    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,3);
        largest=s.substring(0,3);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        char max1=122;//z
        char min1=97;//a
        char max=90;//Z
        char min=65;//A
        for(int i=0;i<s.length()-(k-1);i++){

            String tempmax=s.substring(i,i+k);
            String tempmin=s.substring(i,i+k);
            System.out.println(smallest+" "+largest);
            char chmax=tempmax.charAt(0);
            char chmin=tempmin.charAt(0);
            if(min1<=(int)chmax && (int)chmax<=max1){
                //max
                if((int)chmax>=(int)largest.charAt(0)){
                    largest=tempmax;
                }

            }
            if(min1<=(int)chmin && (int)chmin<=max1){
                if((int)chmin<=(int)largest.charAt(0)){
                    smallest = tempmin;
                }
            }

            if(min<=(int)chmin && (int)chmin<=max){
                //min
                System.out.println("yes");
                if((int)chmin<=(int)smallest.charAt(0)){
                    smallest=tempmin;
                }
            }
            if(min<=(int)chmax && (int)chmax<=max){
                System.out.println("no");
                if((int)chmax>=(int)largest.charAt(0)){
                    largest=tempmax;
                }
            }
        }
        System.out.println( smallest + " " + largest);
    }

    public static void main( String args[]){
        String s="welCometojava";
        int k=3;
        getSmallestAndLargest ( s,k );
        System.out.println ( s );
        String str="Harsh";
        System.out.println (str.substring ( str.length ()-3 ));
        System.out.println ( Arrays.toString ( str.split ( "" )));

    }
}
