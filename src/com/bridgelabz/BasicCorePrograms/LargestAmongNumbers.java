package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number, a = ");
        int a = scanner.nextInt();
        System.out.println("Enter the Number, b = ");
        int b = scanner.nextInt();
        System.out.println("Enter the Number, c = ");
        int c = scanner.nextInt();

        System.out.println();
        if (a>b && a>c) {
            System.out.println(a+ " is the Largest among the numbers.");
        } else if (b>c) {
            System.out.println(b + " is the Largest among the numbers.");
        }else
            System.out.println(c+ " is the Largest among the numbers.");
    }
}
