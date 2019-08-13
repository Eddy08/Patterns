package com.company;

import java.util.Random;
import java.util.Scanner;
public class guessTheNumber {

    int theNumber;
    int max;
    Scanner s=new Scanner ( System.in );
    public guessTheNumber(){
        Random rand=new Random (  );
        max=100;
        theNumber=Math.abs(rand.nextInt ())% (max+1);
    }
    public void play(){
        while(true) {
            int move = s.nextInt ( );
            if (move > theNumber) {
                System.out.println ( "Your input is too large" );
            } else if (move < theNumber) {
                System.out.println ( "Your input is too small" );
            } else {
                System.out.println ( "YOUR Guess is Right :)" );
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x){
        if((1<=x) && (x<=1000)){
            System.out.println("Our Number is pretty small");
        }
        else if(((int)Math.pow(-2,31)<=x)&&(x<=(int)Math.pow(2,31))){
            System.out.println("Our Number is large");
        }
        else{
            System.out.println("Its out of Range");
        }

    }
    public static void main(String args[]){
      guessTheNumber guess=new guessTheNumber ();
      System.out.println("Greetings :)");
      System.out.println("Help Me! I have Forget My Number :(");
      System.out.println("Just Type the nuumber");
      guess.play ();


    }
}
