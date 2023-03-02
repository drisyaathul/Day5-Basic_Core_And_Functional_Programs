package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int limit = scan.nextInt();
        double result = 0;
        double number = 0;
        double i;

        for (i = 1; i <= limit; i++) {
            number = number + (1 / i);
            result = number;
        }
        System.out.println("The value of Harmonic no. " + limit + " is: " + result);
        }
    }