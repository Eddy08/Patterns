package com.company;

import java.math.BigInteger;

public class StoringLargeData {
    public static void main ( String[] args ) {
            StringBuilder sb=new StringBuilder (  );
           // sb.ensureCapacity ( Integer.MAX_VALUE-100 );
            StringBuffer sb1=new StringBuffer();
            String sb2="";
        BigInteger sb3=BigInteger.ZERO;
        int largeNumber = Integer.MAX_VALUE;
        for(int i=0;i<(int)Math.sqrt (  Integer.MAX_VALUE);i++){
            //sb3.add ( BigInteger.valueOf ( i ) );
                sb.append ( i );
                sb.append ( " " );
        }
        System.out.println(sb.toString ());
        //System.out.println (sb2+String.valueOf ( 100000000 ) );

    }
}
