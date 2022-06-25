package threads.interruptException;

public class InterruptExample {

    public static void main(String[] args) throws InterruptedException { // 4
        Thread threadToInterrupt = new Thread(){
            public void run(){
                while (true) {
                    System.out.println("Working hard");
                    try {
                        Thread.sleep(1000); // 1 - переводим поток в состояние waiting
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted!");
                        break; // 2
                    }
                }
            }
        };
        //Thread.currentThread() // Текущий поток запустивший public static void main(String[] args)
        threadToInterrupt.start();
        Thread.currentThread().sleep(2500); // 3
        threadToInterrupt.interrupt(); // 5
    }
}
