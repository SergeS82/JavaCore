package threads.blocking;

import static java.lang.Thread.sleep;

public class Deadlock implements Runnable {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        new Thread(deadlock).start();
        new Thread(deadlock).start();
    }

    @Override
    public void run() {
        try {
            doTask1();
            doTask2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doTask1() throws InterruptedException {
        synchronized (lock1) {
            sleep(100);
            synchronized (lock2) {
                System.out.println("Doing task 1");
            }
        }
    }

    private void doTask2() throws InterruptedException {
        synchronized (lock2) {
            sleep(100);
            synchronized (lock1) {
                System.out.println("Doing task 2");
            }
        }
    }
}