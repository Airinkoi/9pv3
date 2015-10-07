package org.itstep.sock.client;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket server = new Socket("localhost", 5555);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String text = "";
            while(!text.equals("-close")) {
                text = console.readLine();
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
                out.write(text);
            }
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
