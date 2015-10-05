package org.itstep.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Вадим on 05.10.2015.
 */
public class IoReader {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter message1: ");
            String str1 = bf.readLine();
            System.out.println("Enter message2: ");
            String str2 = bf.readLine();
            System.out.println("Message1: " + str1);
            System.out.println("Message2: " + str2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
