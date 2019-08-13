package com.company;

public class TrapRainWater {
    public static int RainWater(int[] height){
        int left=0;
        int right=0;
        int areaOfWater=0;
        for(int i=0;i<height.length;i++){
            for(int j=i;j<height.length;j++){
                left=Math.max(height[j],left);
            }
            for(int j=i;j>=0;j--){
                right=Math.max(height[j],right);
            }
            areaOfWater+=Math.min(left,right)-height[i];
        }
        return areaOfWater;
    }
    public static void main ( String[] args ) {
        int arr[]={1,0,2,1,5,4,3};
        System.out.println ( RainWater ( arr ));
    }
}