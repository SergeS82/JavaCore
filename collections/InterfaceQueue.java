package collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class InterfaceQueue {

    public static void main(String[] args) {
        //new ArrayBlockingQueue<>(10); - ���������� � ��������� capacity
        Queue<String> queue = new LinkedList<>();
        //
        queue.add("str1");        // ��������, ���� �� ������� Exception
        queue.offer("str2");   // ��������, ��� Exception
        queue.offer("str3");
        queue.poll();       // ������� ������� � ������� �� �������, ��� Exception
        queue.remove();     // ������� ������� � ������� �� �������, ���� ����� - ���������� NoSuchElementException
        queue.peek();       // ������� ������� �������, ��� Exception
        queue.element();    // ������� �������, ���� ����� - ���������� NoSuchElementException
        queue.size();       // ������ �������
        queue.contains("str4"); // boolean �������� ��� ��� �������
        System.out.println("---- 1");
        for (String str : queue){
            System.out.println(str);
        }
        System.out.println("---- 2");
        String str;
        while((str = queue.poll())!=null){
            System.out.println(str);
        }
        System.out.println("---- 3 ");
        queue.add("str4");
        while (queue.peek()!=null){
            System.out.println(queue.poll());
        }

    }

}
