package com.PretzelStudios;

import java.net.ServerSocket;

public class ServerMain {


    public static void startServer() {
        System.out.println("Starting server");
        try {
            ServerSocket socket = new ServerSocket(5850);
            System.out.println("Waiting for client to connect");
            TextConnection connection = new TextConnection(socket.accept());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
