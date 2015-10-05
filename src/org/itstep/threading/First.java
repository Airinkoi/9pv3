package org.itstep.threading;

public class First {
    public static void main(String[] args) throws InterruptedException {
        // Runnable
        Thread thread = new Thread(new CounterRunnable());

        // Thread
        CounterThread thread2 = new CounterThread(10, 20);

        thread.start();
        thread.join();
        thread2.start();
    }
}

class CounterRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.currentThread().sleep(100);
                System.out.println("Runnable counter: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CounterThread extends Thread {
    private int from, to;

    CounterThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = this.from; i < this.to; i++) {
            try {
                Thread.currentThread().sleep(100);
                System.out.println("Thread counter: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}