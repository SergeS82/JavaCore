package DateTimeAPI.new_api;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(1);
        new Thread(() ->{
            num.getAndIncrement();}).start();
    }
}
