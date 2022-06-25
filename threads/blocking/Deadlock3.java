package threads.blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Deadlock3 {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    private void work1(){
        synchronized (lock1){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("Работа 1");
            }
        }
    }
    private void work2(){
        synchronized (lock2){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1){
                System.out.println("Работа 2");
            }
        }
    }

    public static void main(String[] args) {
        Deadlock3 deadlock3 = new Deadlock3();
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(()->deadlock3.work1());
        service.execute(()->deadlock3.work2());
        service.shutdown();
    }
}
