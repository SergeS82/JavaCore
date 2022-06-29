package threads.exircise1364;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Math.min(1,2));
        BlockingQueue<String> queue = new LinkedBlockingQueue();
        String str;
        while ((str = queue.poll(100, TimeUnit.SECONDS)) != null) {
            System.out.println(str);
        }
    }

}
