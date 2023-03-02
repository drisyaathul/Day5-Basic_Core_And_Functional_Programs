package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Dividend = ");
        int dividend = scanner.nextInt();
        System.out.println("Enter the Divisor = ");
        int divisor = scanner.nextInt();
        int quotient;
        int reminder;

        quotient = dividend / divisor;
        reminder = dividend% divisor;

        System.out.println("The Quotient Value is "+quotient);
        System.out.println("The Reminder Value is "+reminder);

    }
}
