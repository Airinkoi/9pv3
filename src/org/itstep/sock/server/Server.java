package org.itstep.sock.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static ArrayList<ClientSocketListener> clients = new ArrayList();

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            while(true) {
                System.out.println("Waiting for client");
                Socket clientSocket = ss.accept();
                ClientSocketListener listener = new ClientSocketListener(clientSocket);
                clients.add(listener);
                System.out.println("New user connected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendToAll(String message) {
        for(ClientSocketListener client : clients) {
            client.send(message);
        }
    }

}
