package com.company;

import java.util.HashSet;

public class PermutationOfString {
    public static int count=0;

    public static void permutation(String str){
        HashSet<String> chosen=new HashSet<> (  );
         permutation ( str,"",chosen );
    }
    public static void permutation(String str,String chosen,HashSet<String> alreadyChosen ){
        //count++;

        if(str.length ()==0){
            if(!alreadyChosen.contains ( chosen )) {
                count++;
                System.out.println ( chosen );
                alreadyChosen.add ( chosen );
            }
        }
        else{
            for(int i=0;i<str.length ();i++){
                String rem=str.substring ( 0,i )+str.substring ( i+1 );
               // System.out.println ( str );
                permutation ( rem, chosen +str.charAt ( i ),alreadyChosen);
            }
        }
    }
    static String prefix="";
    public static void printBinary(int digits,String prefix){

        if(digits==1){
//            System.out.print ( 0 );
//            System.out.print ( 1);
//            System.out.println ( );
            System.out.println(prefix);
        }
        else{
        //    System.out.print ( 0);
            printBinary ( digits-1,prefix+"0" );
         //   System.out.print ( 1);
            printBinary ( digits-1,prefix+"1" );
        }
    }
    static String prefix1="";
    public static void printdecimal(int digits,String prefix1){
        if(digits==0){
//            System.out.print ( 0 );
//            System.out.print ( 1);
//            System.out.println ( );
            System.out.println(prefix1);
        }
        else{
            //    System.out.print ( 0);
            for(int i=0;i<=9;i++) {
                //String temp=prefix1+i;
                printdecimal ( digits - 1, prefix1+String.valueOf ( i ) );
                //   System.out.print ( 1);
            }
           // printBinary ( digits-1,prefix+"1" );
        }
    }
    public static void main ( String[] args ) {
       // permutation ( "GOOGLE" );
        //System.out.print ( count );
        //printBinary ( 4,"" );
        printdecimal ( 4,"" );
    }
}
