package threads.blocking;

public class BankStatic {

    private static int money = 10000;

    static int getMoney() {
        return money;
    }

    static synchronized void take(int money) {
        BankStatic.money -= money;
    }

    static synchronized void repay(int money) {
        BankStatic.money += money;
    }

    static class Client extends Thread{
        @Override
        public void run() {
            while(true) {
                take(1000);
                repay(1000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Client().start();
        new Client().start();
        new Client().start();
        while(true) {
            System.out.println(BankStatic.money);
            Thread.sleep(1000);
        }
    }
}