package threads.speed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeThreads {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        // 1 часть
        Thread thr1 =  new Thread(() -> {
            List < Integer > numbers = new ArrayList<>();
            for (int i = 1; i <= 10000000; i++) {
                numbers.add(i);
            }
            int  max = Collections.max(numbers);
            System.out.println("Max found: " + max);
        });
        thr1.start();

        // 2 часть
        Thread thr2 = new Thread(() -> {
            List<Integer> unsorted = new ArrayList<>();
            for (int i = 10000000; i >= 1; i--) {
                unsorted.add(i);
            }
            Collections.sort(unsorted);
            System.out.println("List is sorted now");
        });
        thr2.start();

        // 3 часть
        Thread thr3 = new Thread(() -> {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 10000000; i++) {
                list.add(i);
            }
            while (list.size() != 0) {
                list.remove(list.size() - 1);
            }
            System.out.println("List cleared");
        });
        thr3.start();

        // Итог
        thr1.join();
        thr2.join();
        thr3.join();


        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }

}
