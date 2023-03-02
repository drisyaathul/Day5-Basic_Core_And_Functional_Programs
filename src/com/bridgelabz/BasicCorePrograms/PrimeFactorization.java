package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();

        System.out.println("Prime Factors of given number : ");
        for (int i=2; i<=number; i++){
            while (number% i == 0){
                number = number/i;
                System.out.println(i);
            }
        }
       if (number!=1){
            System.out.println(number);
        }
    }

}
