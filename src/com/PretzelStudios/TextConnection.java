package com.PretzelStudios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TextConnection {
    private Socket server = null;
    private PrintWriter out = null;
    private BufferedReader in = null;

    public TextConnection(Socket endpoint) {
        server = endpoint;
        System.out.println("Connected to " + server.getInetAddress());
    }

    public TextConnection(String host, int port) {
        try {
            server = new Socket(host, port);
            System.out.println("Connected to " + server.getInetAddress());
            out = new PrintWriter(server.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        } catch (IOException ioe) {
            System.out.println("Connection refused!");
            ioe.printStackTrace();
        }
    }

    public InetAddress getAddress() {
        return server.getInetAddress();
    }

    public void sendMsg(String msg) {
        out.println();
    }

    public String retreiveLastMsg() {
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "No message available";
        }
    }
}
