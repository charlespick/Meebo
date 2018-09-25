package com.PretzelStudios;

public class ServerThread extends Thread {
    TextConnection connection = null;

    public ServerThread(TextConnection connection) {
        this.connection = connection;
    }

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running!");
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            String content = connection.retreiveLastMsg();
            if (content == null) {
                System.out.println("No new messages");
            } else {
                System.out.println(connection.retreiveLastMsg());
            }
        }
    }


}
