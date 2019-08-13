package com.company;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

class object{
    int a=0;
    String str="";
    char ch='\0';
}

public class MD5Practice {
    private static Scanner sc;

    public static void main ( String[] args ) {
        System.out.println ("Please Enter the Text to be Encrypted" );
        String total_message="";
         sc=new Scanner ( System.in );

        System.out.println (total_message );
       String str="1324123141342131243124312432121341324123";
        BigInteger bi=new BigInteger ( str);
        bi.bitLength ();
        String.valueOf ( bi ).length ();
        object ob=new object ();
        ob.a=100;
        ob.str="Harsh";
        ob.ch='A';
        System.out.println ( ob.a+" "+ob.str+" "+ob.ch);


    }
}