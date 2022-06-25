package threads.blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Deadlock4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(() -> System.out.println("Executing"));
        //service.shutdown();
    }
}
