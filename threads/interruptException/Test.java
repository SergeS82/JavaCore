package threads.interruptException;

public class Test extends Thread{

        @Override
        public void run() {
            try {
                System.out.println("Thread started");
            } catch (Exception exception) {
                System.out.println("Thread interrupted");
            }
        }

        public static void main(String[] args) {
            Thread thread = new Test();
            thread.start();
//            thread.interrupt();
        }
    }

