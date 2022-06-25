package threads.blocking;

import java.util.ArrayList;
import java.util.List;

public class WorkerFix {

    private List<String> list1 = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();

    void addToListOne() {
        synchronized (list1) {
            for (int i = 0; i < 100000; i++)
                list1.add("One"); // ��������� � ������ ���� ��������
        }
    }

    void addToListTwo() {
        synchronized (list2) {
            for (int i = 0; i < 100000; i++)
                list2.add("Two"); // ��������� �� ������ ���� ��������
        }
    }

    class Process extends Thread {
        public void run() {
            for (int i = 0; i < 300; i++) { // 300 ��� �������� ��� ������
                addToListOne();
                addToListTwo();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WorkerFix workerFix = new WorkerFix(); // ������ 1 - ���� ������
        Thread t1 = workerFix.new Process(); // ��� ������
        Thread t2 = workerFix.new Process();


        long start = System.currentTimeMillis();

        t1.start();
        Thread.sleep(1);
        t2.start();

        t1.join();
        t2.join();

        long finish = System.currentTimeMillis();

        System.out.println("list 1 size is: " + workerFix.list1.size());
        System.out.println("list 2 size is: " + workerFix.list2.size());
        // �������� ����� ����������
        System.out.println("Time taken: " + (finish - start) + " ms");	}

}

