package com.PretzelStudios;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerMain {


    public static void startServer() {
        System.out.println("Starting server");

        try {
            ServerSocket socket = new ServerSocket(5850);
            System.out.println("Waiting for client to connect");
            ServerThread thread1 = new ServerThread(new TextConnection(socket.accept()));
            thread1.start();
            ServerThread thread2 = new ServerThread((new TextConnection(socket.accept())));
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Thread 1 is still running!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
