package com.PretzelStudios;

public class ClientMain {


    public static void startClient() {
        System.out.println("Starting client\nConnecting to server...");
        TextConnection connection = new TextConnection("resource.xijx.xyz", 5850);
        try {
            Thread.sleep(3000);
            connection.sendMsg("This is the only message");
            Thread.sleep(1000);
            connection.sendMsg("This is another message");
            connection.sendMsg("This is another message sent right after the last one");
            Thread.sleep(1000);
            connection.sendMsg("I took a nap");
            connection.close();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }


}
