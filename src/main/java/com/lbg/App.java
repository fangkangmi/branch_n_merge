package com.lbg;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VATCalculator vatMaker = new VATCalculator();
        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter the amount you want to calculate VAT for: " );
        System.out.println("The VAT will be: " + vatMaker.calculateVATToPay(scan.nextDouble(),20));
        Accumulator acc = new Accumulator();
        System.out.println("The sum of 3 and 7 is: ");
        System.out.println(acc.sum(3,7));
        System.out.println("programme has been completed");

    }
}
