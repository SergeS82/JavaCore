package module15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MemoryLeakExampleThreadLocal {
    static class Job implements Runnable {
        private static final ThreadLocal<List<Object>> LOCAL_DATA =
                ThreadLocal.withInitial(ArrayList::new);
        @Override
        public void run() {
            try{
                List<Object> objects = LOCAL_DATA.get();
                objects.add(new byte[1024 * 1024]);
            }finally{
                LOCAL_DATA.remove();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("ожидание 1");
        System.in.read();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 110; i++) {
            executor.execute(new Job());
        }
        System.out.println("ожидание 2");
        System.in.read();
        executor.shutdown();
        System.out.println("ожидание 3");
        System.in.read();

        // ...
    }
}
