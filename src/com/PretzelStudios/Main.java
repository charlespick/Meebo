package com.PretzelStudios;

public class Main {

    public static void main(String[] args) {

        char[] rawString = "Hello".toUpperCase().toCharArray();
        for (int i = 0; i < rawString.length; i++) {
            System.out.println((int) rawString[i] - 65);
        }
        for (int i = 0; i < rawString.length; i++) {
            System.out.println((char) (rawString[i] + 3));
        }

        double iPhoneXSMaxPrice = 1449.00;
        double appleCarePlus = 199.00;
        double xscase = 39.00;
        double powerAdapter = 19.00;
        double adapter = 49.00;

        double subTotal = iPhoneXSMaxPrice + appleCarePlus + xscase + powerAdapter + adapter;
        subTotal *= 1.1;
        subTotal += 7.95;
        System.out.println(subTotal);


    }
}
