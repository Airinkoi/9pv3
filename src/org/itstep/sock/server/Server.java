package org.itstep.sock.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            while(true) {
                System.out.println("Waiting for client");
                Socket clientSocket = ss.accept();
                ClientSocketListener listener = new ClientSocketListener(clientSocket);
                System.out.println("New user connected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
