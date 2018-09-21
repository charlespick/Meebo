package com.PretzelStudios;

public class StartMain {

    public static void main(String[] args) {
        if (args[0].toUpperCase().equals("SERVER")) {
            ServerMain.startServer();
        } else {
            ClientMain.startClient();
        }
    }

}
