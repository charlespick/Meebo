package com.PretzelStudios;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {


    public static void startServer() {
        System.out.println("Starting server");
        try {
            ServerSocket socket = new ServerSocket(5850);
            System.out.println("Waiting for client to connect");
            Socket client = socket.accept();
            System.out.println("Client connecting");
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Connected to " + client.getInetAddress());
            System.out.println(in.readLine());
            out.println("Someone is home");


            while (true){
                System.out.println("Waiting for num+1");
                String recived = in.readLine();
                System.out.println("recived " + recived);
                int b = Integer.parseInt(recived) + 1;


                Thread.sleep(1000);
                out.println(b);
                System.out.println("Sent " + b);
//                System.out.println(b);

            }



        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
