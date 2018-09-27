package com.PretzelStudios;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerMain {


    public static void startServer() {
        System.out.println("Starting server");
        try {
            connectClient();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }


    public static void connectClient() throws IOException {
        ServerSocket socket = new ServerSocket(5850);
        System.out.println("Waiting for client to connect");
        ServerThread thread1 = new ServerThread(new TextConnection(socket.accept()));
        thread1.start();

    }

}
