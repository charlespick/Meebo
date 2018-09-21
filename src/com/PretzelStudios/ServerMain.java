package com.PretzelStudios;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {


    public static void startServer() {
        System.out.println("Starting server");
        try {
            ServerSocket socket = new ServerSocket(580);
            System.out.println("Waiting for client to connect");
            Socket client = socket.accept();
            System.out.println("Client connecting");
            PrintWriter out = new PrintWriter(client.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Connected to " + client.getInetAddress());
            System.out.println(in.readLine());

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
