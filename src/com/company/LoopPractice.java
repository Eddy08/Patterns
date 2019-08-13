package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LoopPractice {
    public static void practiceWhileLoop () {
        int x = 0;

        while (x < 10) {
            System.out.println ( "The value is :) " + x );
            x++;
        }
    }

    int x = 4;

    public static void practiceDoWhileLoop () {
        int x = 0;
        do {
            System.out.println ( "The value is :) " + x );
            x++;
        }
        while (x < 10);
    }

    public static void practiceForLoop () {
        for ( int i = 0; i < 10; i++ ) {
            /*System.out.println("The value is :_ "+i);*/
            for ( int j = 0; j < 10; j++ ) {
                System.out.print ( "(" + i + "," + j + ")" );
            }
            System.out.println ( );
        }
    }


    public static void main ( String args[] ) {
        practiceForLoop ( );
        String S = "Harsh";
        S.toUpperCase ( );
        char temp = S.charAt ( 0 );
        System.out.println ( temp + " " + (int) temp );
        String S1 = "Arsh";
        char temp1 = S1.charAt ( 0 );
        System.out.println ( temp1 + " " + (int) temp1 );
        if (temp1 < temp) {
            System.out.println ( "Yes" );
        }
        char temp3 = 'a';
        System.out.println ( (int) temp3 );
        String aa = "Harsh";
        char aab = aa.charAt ( 0 );
        String aaa = String.valueOf ( aab );
        if (aaa.equals ( "H" )) {
            aa = "Bhardwaj";


        }
        System.out.println ( aa );
        String abc = "";
        String abd = "H";
        abc = abd;
        System.out.println ( abc );

        String har = "harah";
        String res = har.substring ( 1 );
        System.out.println ( res );
        int arr[] = {1, 3, 4, 5};
        int arr22[] = {1, 3, 4, 5};
        String array_of_string[] = new String[2];
        for ( String x : array_of_string ) {
            System.out.println ( x );
        }
        array_of_string[1] = array_of_string[1] + String.valueOf ( 1 );
        for ( String x : array_of_string ) {
            System.out.println ( x );
        }
        String arrs = Arrays.toString ( arr );
        String arrs22 = Arrays.toString ( arr22 );
        if (arrs.equals ( arrs22 )) System.out.println ( "Yesss" );
        String arrs2 = String.join ( ",", arrs );
        System.out.println ( arrs2 );
        String arrs1 = "1345";
        if (arrs.equals ( arrs1 )) {
            System.out.println ( "Yes" );
        }

       /* BigInteger ag=new BigInteger ( "1" );
        BigInteger bg=new BigInteger ( "1" );
        Scanner s=new Scanner (System.in);
        bg=s.nextBigInteger ();*/

        long lg = 1341324;
        long l1 = (long) Math.sqrt ( lg );
        String strin = "Hey ,What are you doing! ";
        if (strin.contains ( "," )) System.out.println ( "yes" );

        String reg = "[A-z a-z]()";
        Pattern ress = Pattern.compile ( reg );
        System.out.println ( ress );
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
        System.out.println ( "123.156.168.156".matches ( pattern ) );
        String str="Harsh";
        String str1[]=str.split ( "" );
        System.out.println(str1[0]);
        StringBuffer sb = new StringBuffer("Fork Java");
        char ch[] = {'O', 'n', 'l', 'i', 'n','e', ' ', 'C', 'o', 'u', 'r', 's', 'e'};
        sb.append(ch, 5, 8);
        System.out.print(sb);
        int x = 5, y = 10;
        while(y != 0)
        {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print(x);
    }
}
