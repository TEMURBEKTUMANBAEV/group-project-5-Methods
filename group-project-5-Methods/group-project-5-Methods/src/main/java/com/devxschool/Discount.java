package com.devxschool;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {


        /**
         * Write a java program to calculate discount for a product
         *
         *  sample output:
         * Marked price:
         * 100
         * Discount rate:
         * 25
         * Amount after discount: 75.0
         */

        Scanner scanner = new Scanner(System.in);

        //TODO WRITE YOUR CODE HERE
        System.out.println("Marked price:");
        int markedPrice = scanner.nextInt();
        System.out.println("Discount rate:");
        int discount = scanner.nextInt();

        String message = "";
        System.out.print(printMessage(message) + (markedPrice - calculateDiscount(markedPrice, discount)));


    }

    public static double calculateDiscount(double markedPrice, double discount) {
        //TODO IMPLEMENT METHOD
        return  markedPrice * discount / 100;
    }

    public static String printMessage(String message) {
        //TODO IMPLEMENT METHOD
        message = "Amount after discount";

        return message;
    }
}
