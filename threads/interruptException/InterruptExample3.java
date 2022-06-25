package threads.interruptException;

public class InterruptExample3 {
    // прерываение потока в состоянии Runnable
    public static void main(String[] args) throws InterruptedException { // 4
        Thread threadToInterrupt = new Thread(){
            public void run(){
                while (!isInterrupted()) {
                    System.out.println("Working hard");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    //Перехватываем молча
                }
                System.out.println("All done");
            }
        };

        threadToInterrupt.start();
        Thread.currentThread().sleep(2500); // 3
        threadToInterrupt.interrupt();
        threadToInterrupt.join();                // дожидаемся окончания прерывания потока
        System.out.println("Thread finished");
    }
}
