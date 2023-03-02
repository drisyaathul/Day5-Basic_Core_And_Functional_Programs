package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Power Value, p :");
        int p = scanner.nextInt();
        int n = 2;
        int result=1;

        System.out.println("Table of Power of 2 :");
        for (int i=1; i<=p; i++) {
            result = result*n;
            System.out.println(result);
        }
    }
}
