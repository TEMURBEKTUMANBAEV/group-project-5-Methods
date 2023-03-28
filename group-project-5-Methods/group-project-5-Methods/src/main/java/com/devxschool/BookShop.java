package com.devxschool;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        /**
         * Online Book Merchant offers premium customers 1 free book with every purchase of 5 or more books
         * and offers 2 free books with every purchase of 8 or more books.
         * It offers regular customers 1 free book with every purchase of 7 or more books
         * and offers 2 free books with every purchase of 12 or more books.
         *
         * Write a program to calculate number of free books.
         *
         *  sample output:
         * Are you a premium customer?
         * true
         * How many books for purchase?
         * 9
         * You qualify for 2 free books
         *
         */


        Scanner scanner = new Scanner(System.in);
        //TODO write your code here
        System.out.println("Are you a premium customer?");
        boolean isPremiumCustomer = scanner.nextBoolean();
        System.out.println("How many books for purchase?");
        int numberOfBooksPurchased = scanner.nextInt();
        System.out.println("You qualify for " + countFreeBooks(isPremiumCustomer, numberOfBooksPurchased) + " free books");
    }

    public static int countFreeBooks(boolean isPremiumCustomer, int numberOfBooksPurchased) {
        //TODO implement method
        int countFreeBooks=0;
        if (isPremiumCustomer) {
            if (numberOfBooksPurchased < 5) {
                return countFreeBooks = 0;
            } else if (numberOfBooksPurchased > 5 && numberOfBooksPurchased < 8) {
                return countFreeBooks = 1;
            } else {
                return countFreeBooks = 2;
            }

        } else if (numberOfBooksPurchased < 7) {
            return countFreeBooks = 0;
        } else if (numberOfBooksPurchased > 7 && numberOfBooksPurchased < 12) {
            return countFreeBooks = 1;
        } else {
            return countFreeBooks = 2;
        }


    }
}
