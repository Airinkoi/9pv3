package org.itstep.threading;

import java.util.ArrayList;

/**
 * Created by Вадим on 05.10.2015.
 */
public class DataManager {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DataManager.prepareData();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DataManager.sendData();
            }
        });

        thread1.start();
        thread2.start();
    }

    private volatile static ArrayList<Integer> list = new ArrayList();

    public static void sendData() {
        synchronized (list) {
            System.out.println("Waiting for prepared data...");

            try {
                list.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Data sending...");
            System.out.println(list.toString());
        }
    }

    public static void prepareData() {
        synchronized (list) {
            for (int i = 0; i < 100000; i++) {
                list.add(i);
            }
            System.out.println("Data prepared.");
            list.notifyAll();
        }
    }
}
