package com.company;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;

/*import java.util.*;*/

public class CalanderPractice {
    public static void main ( String[] args ) {

        Calendar cal=Calendar.getInstance();
        cal.add ( Calendar.DATE,0 );
        System.out.println (cal.getTime () );
        SimpleDateFormat format=new SimpleDateFormat ( "dd-MM-yyyy" );
        String formateed=format.format ( cal.getTime () );
        System.out.println (formateed );
        /*String str="7";
        BigInteger bi=new BigInteger ( str );

        if(bi.isProbablePrime ( 1 )){
            System.out.println ("Prime" );
        }*/
    }
}
