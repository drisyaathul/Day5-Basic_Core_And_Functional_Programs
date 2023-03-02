package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swapping:");
        System.out.println("Enter the First Number, n1:");
        System.out.println("Enter the Second Number, n2:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping:");
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);

    }
}
