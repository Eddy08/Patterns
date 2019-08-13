package com.company;

public class Practice1 {
    int x = 8;
    static int s = 10;

    final synchronized strictfp public static void main ( String a[] ) {

        System.out.println ("Valid!! Main Method");
        int x=5;
        x=x/3;
        System.out.println(x);
        double d = 0134_344.1_2_3;
        double $d = 0x13d;

        System.out.println ( d );
        System.out.println ( $d );
        int array[] = new int[3];
        int array2[][] = new int[2][2];/*2147483647*/
        int array3[][] = new int[2][];
        System.out.println ( array.getClass ( ).getName ( ) );
        System.out.println ( a.length );
        System.out.println ( array2 );
        System.out.println ( array2[0] );
        System.out.println ( array2[0][0] );
        System.out.println ( array3 );
        System.out.println ( array3[0] );
        Practice1 p = new Practice1 ( );
        int y = p.x;
        y++;
        System.out.println ( "Incremented_Instance Variable:" + y );
        p.main2 ( );
        System.out.println ( "Static Variable with Object Name:" + p.s );
        s++;
        System.out.println ( "Static Variable with Class Name:" + Practice1.s );
        System.out.println ( "Static Variable :" + s );
        main3 ( 40 );
        main3 ( 10, 20, 30 );
        int arr1[]={10,20,30,80};
        int arr2[]={60,20,30};
        int arr3[][]={{1,3,5},{7,9,11}};
        main4(arr1,arr2);
        for(int [] x1:arr3){
            for(int x2:x1){
                System.out.print("\t"+x2);
            }
        }


    }

    public void main2 () {
        System.out.println ( "Instance Variable:" + x );
        s++;
        System.out.println ( "Static Variable in Second Method:" + s );
    }

    public static void main3 ( int z ) {
        System.out.print ( "hello error" );
    }
    public static void main3 ( int... z ) {

        System.out.println ( "The no. of arguments passed:" + z.length );
        System.out.println ( "The last no. is :" + z[(z.length) - 1] );
        int total=0;
        for ( int z1 : z ) {

            total=total+z1;



        }System.out.println ( "The sum of args is :" + total );
    }
    public static void main4(int[]... x){

        for(int[] x1: x){
            System.out.println ( "First Element of "+x1.length+" size array is "+x1[0] );

        }
    }
}
