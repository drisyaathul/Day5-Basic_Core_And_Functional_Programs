package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet : ");
        //alpha = Alphabet
        char alpha = scanner.next().charAt(0);

        switch (alpha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(alpha + " is Vowel.");
                break;
            default:
                System.out.println(alpha + " is Consonent.");

        }
    }
}
