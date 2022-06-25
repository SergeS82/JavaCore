package threads.addExercises.Exercise1;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Pattern;

import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

public class Main {
    private static ArrayBlockingQueue<Integer> intQueue = new ArrayBlockingQueue<>(10);
    private static Random random = new Random();
    public static void main(String[] args) {
        Runnable o1 = () -> {
            while (!interrupted()) {
                try {
                    while (intQueue.size() < 20) {
                        int i = random.nextInt(100);
                        intQueue.put(i);
                        System.out.println(Thread.currentThread().getName() + " added " + i);
                    }
                } catch (InterruptedException e) {
                    return;
                }
            }
        };
        // поток 1
        Thread thr1 = new Thread(o1);
        Thread thr12 = new Thread(o1);
        Thread thr13 = new Thread(o1);
        Thread thr14 = new Thread(o1);
        thr1.setName("th11");
        thr12.setName("th12");
        thr13.setName("th13");
        thr14.setName("th14");
        // поток 2
        Thread thr2 = new Thread(() -> {
            try {
                while (true) {
                    int i = random.nextInt(10);
                    if (i == 5) {
                        try {
                            System.out.println("deleted " + intQueue.remove());
                        } catch (NoSuchElementException e) {
                        }
                        sleep(100);
                    } else if (i == 9) {
                        if (intQueue.size() == 0) Thread.currentThread().interrupt();
                    }
                }
            } catch (InterruptedException e) {
                return;
            }
        });
        thr1.start();
        thr12.start();
        thr13.start();
        thr14.start();
        //thr2.start();
    }
}
