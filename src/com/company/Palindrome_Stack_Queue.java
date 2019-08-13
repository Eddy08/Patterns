package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome_Stack_Queue {
    LinkedList<Character> Queue=new LinkedList<>();
    Stack<Character> Stack=new Stack<>();
    public void pushCharacter(char ch){
        Stack.push(ch);
    }
    public void enqueueCharacter(char ch){
        Queue.addLast( ch );
    }
    public char popCharacter(){
        return (char)Stack.pop ();
    }
    public char dequeueCharacter(){
        return (char)Queue.remove();
    }
    public static void main ( String[] args ) {

        // Stack and Queue is created
        Palindrome_Stack_Queue p=new Palindrome_Stack_Queue ();
        // Enter the String from User
        System.out.println ("I am Very Happy that i Learnt Queue and Stack :)" );
        System.out.println ("Please Enter any String which you want to Test" );
        Scanner sc=new Scanner ( System.in );
        char array[]=sc.next ().toLowerCase ().toCharArray ();

        //Enter is stack and queue together
        for(char ch:array){
            p.pushCharacter ( ch );
            p.enqueueCharacter ( ch );
        }
        boolean isPalindromer=true;
        for(int i=0;i<array.length/2;i++){
            if(p.popCharacter ()!=p.dequeueCharacter ()){
                isPalindromer=false;
                break;
            }
        }

        System.out.println ("The word is "+String.valueOf ( array )+" and it is "+((!isPalindromer ? "not a Palindrome." : "a Palindrome" )) );

    }
}
