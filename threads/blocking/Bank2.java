package threads.blocking;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank2 {

    private AtomicInteger money = new AtomicInteger(10000);

    int getMoney() {
        return money.get();
    }

    void take(int money) {
        if (getMoney() > 1000)  this.money.addAndGet(-money);
    }

    void repay(int money) {
        this.money.addAndGet(money);
    }

    class Client extends Thread{
        @Override
        public void run() {
            while(true) {
                take(1000);
                repay(1000);
            }
        }
    }

    public Bank2() {
        new Client().start();
        new Client().start();
        new Client().start();
    }
    public static void main(String[] args) throws InterruptedException {
        Bank2 bank = new Bank2();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}

