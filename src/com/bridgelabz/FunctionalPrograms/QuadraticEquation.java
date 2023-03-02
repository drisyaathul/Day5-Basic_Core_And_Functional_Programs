package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value,a :");
        int a = scanner.nextInt();
        System.out.println("Enter the value,b :");
        int b = scanner.nextInt();
        System.out.println("Enter the value,c :");
        int c = scanner.nextInt();

        double delta = (b*b-4*a*c);
        if (delta>0){
            double r1 = (-b+Math.sqrt(delta))/(2*a);
            double r2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("The roots are "+r1+ "&" +r2);
        }else{
            System.out.println("The Roots are imaginary");
        }

    }
}
