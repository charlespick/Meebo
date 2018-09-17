package com.PretzelStudios;

public class Main {

    public static void main(String[] args) {

        String targetString = "Hello";
        char[] rawString = targetString.toUpperCase().toCharArray();

        for (int i = 0; i<targetString.length(); i++) {
            System.out.println((int)rawString[i]-65);
        }

        System.out.println();

        for (int i = 0; i<targetString.length(); i++){
            System.out.println((char)(rawString[i]+3));
        }








    }
}
