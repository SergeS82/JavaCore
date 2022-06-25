package threads.interruptException;

public class InterruptExample2 {
    public static void main(String[] args) throws InterruptedException { // 4
        Thread threadToInterrupt = new Thread(){
            public void run(){
                while (true) {
                    System.out.println("Working hard");
                    try {
                        // переводим поток в состояние waiting
                        Thread.sleep(1000); // 1 - замораживаем птоток на 1 сек.
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted!");
                        break; // 2
                    }
                }
            }
        };
        threadToInterrupt.start();
        Thread.currentThread().sleep(2500); // 3 - т.к. строка вызвана, то нужно обрабатывать исключение InterruptedException
        threadToInterrupt.interrupt(); // 5 - метод для прерывания пользовательского потока
    }
}
