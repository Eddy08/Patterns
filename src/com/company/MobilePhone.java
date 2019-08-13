package com.company;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;

public class MobilePhone {
    static ArrayList<String> time=new ArrayList<String> ();
    static ArrayList<String> date=new ArrayList<String> ();
    static ArrayList<String> Window=new ArrayList<String>();
    static ArrayList<String> Buttons=new ArrayList<String>();
    static ArrayList<String> mainArray=new ArrayList<String> (  );
    /*static ArrayList<ArrayList,ArrayList,ArrayList,ArrayList<String>> mainArray2=new ArrayList<> (  )*/
    static Calendar cal=Calendar.getInstance ();

    static int count=0;
    static int count1,count2,count3,count4,count5,count6,count7,count8,count9,count0=0;


    static boolean alreadyExecuted=false;
    static String wall="   Life \n         is\n        Worth\n         Living !!" ;


    public static void printInstructions(){
        System.out.println ("Enter 1 2 \n       5\n"
                    + "      3 4\n      *" );
    }
    public static void mainScreen(){
        System.out.println ("--------------------------" );
        System.out.print ("|"+time.toString ().replaceAll ( "\\[","" ).replaceAll ( "\\]","" ) );
        System.out.println ("     "+date.toString ().replaceAll ( "\\[","" ).replaceAll ( "\\]","" )+"|");
        System.out.println ( "|            "+"            |");
        System.out.println ( "|            "+"            |");
        //System.out.println (" |   "+Window.toString ().replaceAll ( "\\[","" ).replaceAll ( "\\]","" )+"  |" );
        System.out.println (showWindow () );
        System.out.println ( "|            "+"            |");
        System.out.println ( "|            "+"            |");
        System.out.println ( "|            "+"            |");
        //System.out.println (" |   "+Buttons.toString ().replaceAll ( "\\[","" ).replaceAll ( "\\]","" )+" |");
        System.out.println ("--------------------------" );

    }
public static void getTime(){
    Date date=cal.getTime ();
    DateFormat format=new SimpleDateFormat ( "hh:mm:ss" );
    String formatedtime=format.format ( date );
       if(time.isEmpty()) {

           time.add ( formatedtime );
       }
    if(time.get ( 0 )!=null) {
        time.set ( 0,java.time.LocalTime.now ().toString ().substring ( 0,8 ));
    }


    }
    public static void getDate(){
        Date date1=cal.getTime ();
        DateFormat format1=DateFormat.getDateInstance (DateFormat.MEDIUM,Locale.ENGLISH);
        String formatteddate=format1.format ( date1 );
            if(date.isEmpty ()){
                date1=cal.getTime ();
                formatteddate=format1.format ( date1 );
                date.add(formatteddate);
            }
        if(date.get ( 0 )!=null) {
            date.set (  0,formatteddate);
        }


    }

    public static String showWindow(){
        String result="|";
        String result1="|";
        String resultFinal=new String();
        if(count==1){
            resultFinal="Contacts";
        }
        else{
            resultFinal=Window.toString ().replaceAll ( "\\[","" ).replaceAll ( "\\]","" );
        }
        return result+resultFinal+result1;
    }


    public static void getDialPad(){
        count=1;
        System.out.println ("----------------------------" );
        System.out.println ("|"+get1 ()+"          "+get2() +"            "+get3 ()+"|" );
        System.out.println ("|"+get4 ()+"          "+get5 ()+"            "+get6 ()+"|" );
        System.out.println ("|"+get7 ()+"          "+get8 ()+"            "+get9 ()+"|" );
        System.out.println ("|"+"*          "+get0 ()+"           #"+" |" );
        System.out.println ("---------------------------" );

    }

    public static Character get1(){
        if(count1==1){
            count1--;
            return '①';
        }
        return '1';
    }
    public static Character get2(){
        if(count2==1){
            count2--;
            return '②';
        }
        return '2';
    }
    public static Character get3(){
        if(count3==1){
            count3--;
            return '③';
        }
        return '3';
    }
    public static Character get4(){
        if(count4==1){
            count4--;
            return '④';
        }
        return '4';
    }
    public static Character get5(){
        if(count5==1){
            count5--;
            return '⑤';
        }
        return '5';
    }
    public static Character get6(){
        if(count6==1){
            count6--;
            return '⑥';
        }
        return '6';
    }
    public static Character get7(){
        if(count7==1){
            count7--;
            return '⑦';
        }
        return '7';
    }
    public static Character get8(){
        if(count8==1){
            count8--;
            return '⑧';
        }
        return '8';
    }
    public static Character get9(){
        if(count9==1){
            count9--;
            return '⑨';
        }
        return '9';
    }
    /*public static Character gethash(){

    }
    public static Character getStar(){

    } */
    public static Character get0(){
        if(count0==1){
            count0--;
            return 'Ⓞ';
        }
        return '0';
    }

    public static void Wallpaper(){
        while(!alreadyExecuted){
        Window.add ( wall );
        alreadyExecuted=true;
        }

    }



    public static void main ( String[] args ) {
        Scanner sc=new Scanner ( System.in );
        printInstructions ();
        System.out.println ( );
        //mainScreen ();
        //System.out.println ("--->" );
        //String input1=sc.nextLine ().trim();
        boolean exit=true;
        while(exit) {
            System.out.println ( );
            Wallpaper ();
                    getTime ( );
                    getDate ( );
            mainScreen ();
            if(count==1){
                getDialPad ();
            }
            switch (sc.nextLine ().trim()) {
                case "0":
                    count0++;
                    break;
                case "1":
                    // System.out.println ("Show Time" );
                    count1++;
                    break;
                case "2":
                    // System.out.println ("Show Date" );
                    count2++;
                    break;
                case "3":
                    //System.out.println ( "Show PhoneBook" );
                    count3++;
                    break;
                case "4":
                    System.out.println ( "Show MainScreen" );
                    count4++;
                    break;
                case "5":
                    getDialPad();
                    System.out.println ( "Show Dialpad" );
                    count5++;
                    break;
                case "6":
                    count6++;
                    break;
                case "7":
                    count7++;
                    break;
                case "8":
                    count8++;
                    break;
                case "9":
                    count9++;
                    break;

                case "*":
                    System.out.println ( "Exit!!" );
                    exit=false;
                    break;
            }

        }

    }
}
class Contacts{
    private String name;
    private String phoneNumber;

    public Contacts ( String name, String phoneNumber ) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName () {
        return name;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }
}
class MobilePhoneContactsDisplay{
    private static ArrayList<Contacts> ContactBook=new ArrayList<Contacts> (  );

}
