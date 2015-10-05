package org.itstep.threading;

/**
 * Created by Вадим on 05.10.2015.
 */
public class Synch {
    private String string = "";

    public static void main(String[] args) {

    }

    public static synchronized void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void concat(String str) {

        synchronized (string) {
            string += str;
        }

    }
}
