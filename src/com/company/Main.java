package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int highNumber = 100;
        int lowNumber = 0;
        int theNumber = 50;
        System.out.println("Guess a number between 0 and 100");
        System.out.println(theNumber);
        String input = new Scanner(System.in).next();

        while (!input.equalsIgnoreCase("Correct")) {

            if (input.equalsIgnoreCase("Higher"))
                lowNumber = theNumber;
            if (input.equalsIgnoreCase("Lower"))
                highNumber = theNumber;
            theNumber = (int) (lowNumber + (highNumber - lowNumber) / 2);
            System.out.println(theNumber);
            input = new Scanner(System.in).next();
        }
        System.out.println("Wow! The number was " + theNumber);
    }
}
