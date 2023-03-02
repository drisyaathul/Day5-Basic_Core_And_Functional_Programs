package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times to Flip Coin : ");
        //fc=FlipCoin
        int fc = scanner.nextInt();
        int tails=0;
        int heads=0;

        for (int i=0; i<fc; i++){

            if (Math.random() <0.5){
                tails++;
            }else {
                heads++;
            }
        }
        double percentageTail = tails/(double)fc * 100;
        double percentageHead = heads/(double)fc * 100;

        System.out.println("Number of Heads: " +heads);
        System.out.println(("Number of Tails: " +tails));
        System.out.println("The Percentage of Head is " +percentageHead + " %");
        System.out.println("The Percentage of Tail is " +percentageTail + " %");
    }
}

