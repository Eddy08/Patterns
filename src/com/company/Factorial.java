package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(BigInteger bi){
    if(bi.compareTo ( BigInteger.ONE )==0){
        return BigInteger.ONE;
    }
   else {
        return bi.multiply ( factorial ( bi.subtract ( BigInteger.ONE ) ) );
    }
    }
    public static int digitsInFactorials(String str){
        return str.length ();
    }
    public static void main ( String[] args ) {
        System.out.println ("Enter any No. to calculate the Factorial----> :I" );
        Scanner sc=new Scanner ( System.in );
        String str=sc.nextLine ();
        BigInteger b1=new BigInteger ( str );
        BigInteger res;

        factorial ( b1 );
        String count=String.valueOf ( factorial ( b1 ) );
        System.out.println (count );
        int len=digitsInFactorials ( count );
        System.out.println ("It is "+len+" Long ....!" );
        /*1->1
2->1
3->1
4-->2
5--->3
6--->3
7---->4
8----->5
9------>6
10------>7
11------->8
12-------->9
13--------->10
14---------->11
15-->12------->13
16-->13-------->14
17-------------->15
18--------------->16
19------->17------>18
20------->18------->19
21------->19-------->20
22------->20--->21---->22
23------------->22------>23
24------------->23------->24
25------------->24--------->26
26------------->25---------->27
27------------->26----------->28
28------------->27------------->29
29------------->28---->29----------->31
30

*/

    }
}
