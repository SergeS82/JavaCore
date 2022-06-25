package threads.blocking;

public class BankInteger {

    private Integer money = 10000;

    int getMoney() {
        return money;
    }

    void take(int money) {
        synchronized (this.money) {
            this.money -= money;
        }
    }

    void repay(int money) {
        synchronized (this.money) {
            this.money += money;
        }
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

    public BankInteger() {
        new BankInteger.Client().start();
        new BankInteger.Client().start();
        new BankInteger.Client().start();
    }
    public static void main(String[] args) throws InterruptedException {
        BankInteger bank = new BankInteger();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
