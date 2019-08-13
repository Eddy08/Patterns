package com.company;

public class KadenesAlgorithm {
    public static int kadanesSum(int a[]){
        int max_global=a[0];
        int max_current=a[0];
        for(int i=0;i<a.length;i++){
                max_current= Math.max(a[i],a[i]+max_current);
            if(max_current > max_global){
                max_global=max_current;
            }
        }
        return max_global;

    }
    public static void main ( String[] args ) {
        System.out.println (kadanesSum ( new int[]{-1,-2,-3,-4} ));

    }

}
