package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryDigits {
    public static void main ( String[] args ) {
        int a=889;
        int b= 0xa;
        System.out.println (a+" "+Integer.toBinaryString ( a ) );
        List<Integer> list=new ArrayList<Integer> (  );
        while(a>0){
            int remainder=a%2;
            list.add (remainder );
            a =a/2;
        }
        System.out.println (list.toString ());
        int n=889;
        String str ="";
        str=Integer.toBinaryString ( n );
        System.out.println (str );
        int count=1;

        for(int i=0;i<str.length ()-1;i++){
            if(Character.toString ( str.charAt ( i ) ).equals ( "1" )&& Character.toString ( str.charAt ( i+1 ) ).equals ( "1" )){
                count++;
            }
        }
        System.out.println(count+" ");

        String regEx="([1]+)+";
        Pattern pattern1=Pattern.compile ( regEx );
        Matcher matcher1=pattern1.matcher ( str );
        int max=0;
        while(matcher1.find ()){
            String temp1="";
            temp1=String.valueOf ( matcher1.group ());
            int length1=temp1.length ();
            if(length1>max){
                max=length1;
            }
        }
        System.out.println ( max );
    }
}
