package threads.exircise1364;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Processor implements Runnable {

    private int elem;

    public Processor(int elem) {
        this.elem = elem;
    }

    @Override
    public void run() {
        Tets2.set.put("Key" + elem, 12);
    }
}

class AnotherProcessor implements Runnable {

    private int elem;

    public AnotherProcessor(int elem) {
        this.elem = elem;
    }

    @Override
    public void run() {
        Tets2.set.remove("Key" + elem);
    }
}

public class Tets2 {

    static Map<String, Integer> set = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            new Thread(new Processor(i)).start();
            new Thread(new AnotherProcessor(i)).start();
        }

        Thread.sleep(1000); // хватит для готового результата

        System.out.println(set);
    }

}
