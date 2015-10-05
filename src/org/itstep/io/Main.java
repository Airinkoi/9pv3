package org.itstep.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int s = sc.nextInt();
            System.out.println("Entered: " + s);
        } else {
            System.out.println("Not int!");
        }

        System.out.println("User1 message: ");
        String str1 = sc.nextLine();
        System.out.println("User2 message: ");
        String str2 = sc.nextLine();

        System.out.println("User1 said: " + str1);
        System.out.println("User2 said: " + str2);

    }
}
