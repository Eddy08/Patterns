package com.company;

import java.util.Scanner;

public class Pattern10 {
    public static void main ( String a[] ) {
        Scanner s = new Scanner ( System.in );
        Scanner s1 = new Scanner ( System.in );
        int n = s.nextInt ( );
        int m = s1.nextInt ( );
        for ( int j = 1; j <= m + 1; j++ ) {
            for ( int i = 1; i <= n + 1; i++ ) {
                System.out.print ( " " );

            }

            System.out.print ( "|" );
        }
        System.out.println ( );
        for ( int j = 1; j <= m + 1; j++ ) {
            for ( int i = 1; i <= n + 1; i++ ) {
                System.out.print ( i );
            }
            System.out.print ( "0" );
        }
    }
}
