package com.devxschool;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /**
         * Write a java program to find out if the given year is leap or not
         *
         *  sample output:
         * Enter any calendar year : 2000
         * 2000 is a leap year
         */

        Scanner scanner = new Scanner(System.in);

        //TODO write your code here
        System.out.println("Enter any calendar year :");
        int year = scanner.nextInt();
        if (leapOrNot(year)){
            System.out.println("Year "+year+" is a leap year");
        } else {
            System.out.println("Year "+year+" is not a leap year");
        }

    }

    public static boolean leapOrNot(int year) {
        //TODO IMPLEMENT METHOD
        return (year%400==0 ||year%4==0&&year%100!=0);
    }
}
