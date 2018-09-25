package com.PretzelStudios;

public class ClientMain {


    public static void startClient() {
        System.out.println("Starting client\nConnecting to server...");
        TextConnection connection = new TextConnection("178.128.130.87", 5850);
    }


}
