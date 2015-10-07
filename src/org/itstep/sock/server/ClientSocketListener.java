package org.itstep.sock.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocketListener extends Thread {
    private Socket clientSocket;

    public ClientSocketListener(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Listening for client");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while(true) {
                String text = in.readLine();
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
