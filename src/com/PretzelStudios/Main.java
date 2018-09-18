package com.PretzelStudios;

public class Main {

    public static void main(String[] args) {

        char[] rawString = "Hello".toUpperCase().toCharArray();
        for (int i = 0; i < rawString.length; i++) { System.out.println((int) rawString[i] - 65); }
        for (int i = 0; i < rawString.length; i++) { System.out.println((char) (rawString[i] + 3)); }


    }
}
