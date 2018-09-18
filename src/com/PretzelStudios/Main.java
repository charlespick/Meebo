package com.PretzelStudios;

public class Main {

    public static void main(String[] args) {

        //Alpha positions
        char[] rawString = "Hello".toUpperCase().toCharArray();
        for (int i = 0; i < rawString.length; i++) {
            System.out.print((int) rawString[i] - 65 + " ");
        }
        System.out.println(" ");

        //Ceasar shift
        for (int i = 0; i < rawString.length; i++) {
            System.out.print((char) (rawString[i] + 3) + " ");
        }
        System.out.println(" ");

        //Shopping cart
        double iPhoneXSMaxPrice = 1449.00;
        double appleCarePlus = 199.00;
        double xscase = 39.00;
        double powerAdapter = 19.00;
        double adapter = 49.00;

        double subTotal = iPhoneXSMaxPrice + appleCarePlus + xscase + powerAdapter + adapter;
        subTotal *= 1.1;
        subTotal += 7.95;
        System.out.println(subTotal);

        //A true fact
        for (int i = 0; i < 1000; i++) {
            System.out.println("All work and no play makes Jack a dull boy");
        }

        //Prints numbers
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        //Prints sum of numbers 1 - 1000
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            count += i;
        }
        System.out.println(count);

        //120 factorial
        int factorial = 1;
        for (int i = 5; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);

        //Multiplication table
        System.out.println("  1 2 3 4 5");
        for (int a = 1; a <= 5; a++) {
            System.out.print(a + ":");
            for (int b = 1; b <= 5; b++) {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }




    }
}
