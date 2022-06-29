package threads.exircise1364;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Pizzeria {
    private BlockingQueue<String> queue = new LinkedBlockingQueue();
    private PizzaTrack tr1 = new PizzaTrack("Track1");
    private PizzaTrack tr2 = new PizzaTrack("Track2");
    private final long DAY_START = System.currentTimeMillis();
    static private final long WORK_DAY = 5000l;
    static private final long DELIVERY_TIME = 500l;
    static private final long MAX_DELIVERY_TIME = 750l;

    public Pizzeria() {
        new Thread(tr1).start();
        new Thread(tr2).start();
    }

    //
    class PizzaTrack implements Runnable {
        private final String name;
        private final long DELIVERY_TIME = 500l;
        private long startTime = System.currentTimeMillis()*2;
        private String pizzaName;
        //

        public PizzaTrack(String name) {
            this.name = name;
        }
        //
        @Override
        public void run() {
            while (!currentThread().isInterrupted()) {
                try {
                    pizzaName = queue.poll(10, TimeUnit.MILLISECONDS);
                    if (pizzaName != null) {
                        startTime = System.currentTimeMillis();
                        sleep(500);
                        System.out.println("%s is delivered".formatted(pizzaName));
                        pizzaName = null;
                        startTime = System.currentTimeMillis()*2;
                    }
                    if (System.currentTimeMillis()-DAY_START >= WORK_DAY ){
                        return;
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }

    //
    void order(String pizzaName) {
        // принимаем заказ только если рабочий день не закончился
        System.out.println(pizzaName);
        long lastTime = Math.min(tr1.startTime, tr2.startTime);
        if (WORK_DAY - DELIVERY_TIME - (System.currentTimeMillis() - DAY_START) >= 0) {
            System.out.println(DELIVERY_TIME+(System.currentTimeMillis() - lastTime));
            if (DELIVERY_TIME + (System.currentTimeMillis() - lastTime) > MAX_DELIVERY_TIME) {
                System.out.println("%s is NOT delivered".formatted(pizzaName));
            } else {
                queue.offer(pizzaName);
            }
        }
    }
}
// 500ms - доставка и готовка
// .. PizzaName is delivered - по окончанию доставки
// клиент ожидает не более 750 ms
// .. System.currentTimeMilllis()
// .. PizzaName is NOT delivered
