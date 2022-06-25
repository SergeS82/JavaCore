package threads.blocking;

public class Bank1 {

    private volatile int money = 10000;
    static private final Object lock = new Object();

    int getMoney() {
        return money;
    }

    synchronized void take(int money) {
        if (getMoney() >= 1000)
            this.money -= money;
    }

    synchronized void repay(int money) {
        this.money += money;
    }

    class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                take(1000);
                if (money < 0) System.out.println(money);
                repay(1000);
            }
        }
    }

    public Bank1() {
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();

    }

    public static void main(String[] args) throws InterruptedException {
        Bank1 bank = new Bank1();
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}

