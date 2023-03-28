package com.devxschool;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        /**
         *
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54cm
         *
         * C = (F - 32) × 5/9
         *
         *
         * Example output:
         * Enter amount:
         * 1
         * Enter type:
         * in
         * To:
         * cm
         * Result: 2.54
         *
         */

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        //TODO write your code here
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter type:");
        String type = scanner.next();

        System.out.println("To:");
        String to = scanner.next();

        double result = -1;
        if (isWeight(type)) {
            result = calculateWeight(type, to, amount);
        } else if (isLength(type)) {
            result  = calculateLength(type, to , amount);
        } else if (isTemperature(type)) {
            result = calculateTemperature(type, to, amount);
        }
        printResult(result);

    }


    public static boolean isWeight(String type) {
        //TODO IMPLEMENT METHOD
      return  type.equalsIgnoreCase("lb") || type.equalsIgnoreCase("oz");
    }

    public static boolean isLength(String type) {
        //TODO IMPLEMENT METHOD
        return  type.equalsIgnoreCase("ft") || type.equalsIgnoreCase("in");
    }

    public static boolean isTemperature(String type) {
        //TODO IMPLEMENT METHOD
        return  type.equalsIgnoreCase("f") || type.equalsIgnoreCase("c");
    }

    public static double calculateWeight(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        if (type.equalsIgnoreCase("lb")) {
            if (to.equalsIgnoreCase("kg")) {
                return amount * 0.45359237;
            } else if (to.equalsIgnoreCase("g")) {
                return amount * 453.59237;
            }
        } else if (type.equalsIgnoreCase("oz")) {
            if (to.equalsIgnoreCase("g")) {
                return amount * 28.34952;
            } else if (to.equalsIgnoreCase("kg")) {
                return amount * 0.02834952;
            }
        }
        return -1;
    }

    public static double calculateLength(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        if (type.equalsIgnoreCase("ft")) {
            if (to.equalsIgnoreCase("m")) {
                return amount * 0.3048;
            } else if (to.equalsIgnoreCase("cm")) {
                return amount * 30.48;
            }
        } else if (type.equalsIgnoreCase("in")) {
            if (to.equalsIgnoreCase("cm")) {
                return amount * 2.54;
            } else if (to.equalsIgnoreCase("m")) {
                return amount * 0.0254;
            }
        }
        return -1;
    }

    public static double calculateTemperature(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        if (type.equalsIgnoreCase("f")) {
            if (to.equalsIgnoreCase("c")) {
                return (amount - 32) * (5/9);
            }
        }
        return -1;
    }

    public static void printResult(double result) {
        // TODO IMPLEMENT METHOD
        System.out.println("Result: " + result);
    }
}
