package threads.interruptException;

public class JoinExample {

    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run(){
                for (int i = 0; i < 1000000000; i++) {
                    JoinExample.counter++;
                }
            }
        };
        thread.start(); // запуск программного потока
        //thread.join();  // ожидание завершения программного потока
        thread.join(1); //ожидание в милисекундах
        //thread.interrupt(); // прерывание потока
        System.out.println("Counter value: " + counter); // Counter value: 0
    }

}
