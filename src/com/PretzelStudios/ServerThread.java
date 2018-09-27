package com.PretzelStudios;

public class ServerThread extends Thread {
    TextConnection connection;

    public ServerThread(TextConnection connection) {
        this.connection = connection;
    }

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running!");
        while (true) {

        }
    }


}
