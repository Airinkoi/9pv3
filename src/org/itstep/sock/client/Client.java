package org.itstep.sock.client;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Вадим on 07.10.2015.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket server = new Socket("localhost", 5555);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
