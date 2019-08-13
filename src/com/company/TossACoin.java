package com.company;

import java.math.BigInteger;
import java.util.Random;

public class TossACoin {
    public int coinToss(){
        Random rand=new Random();
        int result=Math.abs ( rand.nextInt () )%2;
        if(result==0){
            System.out.println("It's Head  (-_-)");
        }
        else{
            System.out.println("It's Tail ('.')----");
        }
        return result;
    }

    public long factorial(int a){
        int num=a;
        if(num!=0){
            int number=a;
            long i=1;
            long fact=1;
            while(i<=number){
                fact=fact*i;
                i++;
            }
            return fact;
        }
        else{
            long fact=1;
            return fact;
        }
    }



    public static void main(String args[]){
        TossACoin tc=new TossACoin ();
       tc.coinToss ();
       tc.coinToss ();
       double pay=1234.3434;
       String res=String.valueOf(pay);
        int temp=res.indexOf ( "." );
        System.out.println(temp);
       String res1=res.substring ( 0,temp+3 );
       System.out.println(res);
       System.out.println(res1);

       int number=13;
       String num="254678945";
       int num1=Integer.parseInt ( num );
       System.out.println(number);
        int a=737;//3
        int b=4089173;//1000
        double c=Math.pow(b,1/(double)a);// 8^1/3
        System.out.println(c);
        double d=9.999999999999998;
        System.out.println(Math.ceil ( d ));
        System.out.println(Math.ceil ( 3.333));

       int i=1;
       int number1=5;
        int fact=1;
        while(i<=number1){

            fact =fact*i;
            i++;

        }
        TossACoin tc2=new TossACoin ();
        int n=778;
        int r=116;

        long fact1=tc2.factorial(n);
        System.out.println(fact1);
        long fact2=tc2.factorial(n-r);

        System.out.println(fact2);
        long fact3=tc2.factorial(r);



        int temp2=123456;
        String str=String.valueOf ( temp2 );
        System.out.println();
        int len=str.length();
        int count4=0;
        while(len!=0){
            String sub=str.substring ( len-1 );
            if(sub.length ()>1){

            }
            System.out.println(sub);
            len--;
            count4++;
        }

        int array[][]=new int[3][4];
        int array2[][]={{1,3,4,5},{2,4,5,5},{2,4,4,5}};



        for(int i1=0;i1<3;i1++){


                int temp1=array2[i1][0];
                System.out.println(temp);
                array2[i1][0]=array2[i1][3];
                array2[i1][3]=temp1;

        }

        for(int o[]:array2){
            for(int o1:o){
                System.out.print(o1+" ");
            }
            System.out.println();
        }

        String str1="abc";
        int vowel=0;
        int consonant=0;
        for(int k=0;k<str1.length();k++){
            char temp3=str1.charAt ( k );
            if(temp3=='a'|| temp3=='e'|| temp3=='i' || temp3=='o' || temp3=='u'  ){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        int len1=0;
        int len2=1;
        int final_len=len1 > len2 ? len1 : len2;
        System.out.println(consonant+" "+vowel);
        String string="Harsh";
        String string1="Ha";
        if(string1.contains ( string1 )){
            System.out.println("Yes");
        }

        System.out.println (Math.ceil ( 2.7+5 ) );
    }

}
