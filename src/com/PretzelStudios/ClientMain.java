package com.PretzelStudios;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMain {

    public static void startClient() {

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
        System.out.println("  1 2 3 4 5 6 7 8 9");
        System.out.println("-------------------");
        for (int a = 1; a <= 9; a++) {
            System.out.print(a + "|");
            for (int b = 1; b <= 9; b++) {
                System.out.print(a * b + " ");
            }
            System.out.println();

        }


//      Homework 9/18
//      System.out.println(count*2);
//      System.out.println(count += 15);
//      System.out.println(30-(count*10));
//      System.out.println(-7+(4*count));
//      System.out.println(97-(count*3));


        for (int i = -4; i < 87; i += 18) {
            System.out.println(i);
        }

//      4, 2, 1

//      24 1
//      22 2
//      19 3
//      15 4
//      10 5

/*      Something like this
        +---+
        \   /
        /   \
        \   /
        /   \
        \   /
        /   \
        +---+
*/
        int lastNum = 1;
        for (int i = 3; lastNum <= 100; i += 2) {
            System.out.print(lastNum + " ");
            lastNum += i;

        }


        long firstNum = 1;
        long secondNum = 2;
        long thirdNum;
        System.out.println(firstNum);
        System.out.println(secondNum);
        int i = 0;
        while (i < 100) {
            thirdNum = firstNum + secondNum;
            System.out.println(thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
            i = i + 1;
        }

        try {
            FileWriter writer = new FileWriter("Data.txt", true);
            BufferedWriter internalWriter = new BufferedWriter(writer);
            internalWriter.write("Hello World");
            internalWriter.newLine();
            internalWriter.flush();
            System.out.println("I did it Mommy!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Starting client\nConnecting to server...");
        try{
            Socket server = new Socket("178.128.130.87", 5850);
            PrintWriter out = new PrintWriter(server.getOutputStream(), true);
            out.println("Hi, is anyone home?");
        }catch (IOException exc){
            exc.printStackTrace();
        }



    }
}
