package org.itstep.sock.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSocketListener extends Thread {

    private Socket serverSocket;

    public ServerSocketListener(Socket serverSocket) {
        this.serverSocket = serverSocket;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Listening for client");
            BufferedReader in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            while(true) {
                String text = in.readLine();
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
