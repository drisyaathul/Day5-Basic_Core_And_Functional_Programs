package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of y: ");
        int y = scanner.nextInt();

        double distance = Math.sqrt(x*x + y*y);
        System.out.println("distance from ("+x+","+y+") to the origin (0,0) is "+ distance);

    }
}
