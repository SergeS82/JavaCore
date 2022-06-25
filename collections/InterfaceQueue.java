package collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class InterfaceQueue {

    public static void main(String[] args) {
        //new ArrayBlockingQueue<>(10); - реализация с указанием capacity
        Queue<String> queue = new LinkedList<>();
        //
        queue.add("str1");        // добавить, если не удалось Exception
        queue.offer("str2");   // добавить, без Exception
        queue.offer("str3");
        queue.poll();       // вернуть текущий и удалить из очереди, без Exception
        queue.remove();     // вернуть текущий и удалить из очереди, если пусто - исключение NoSuchElementException
        queue.peek();       // вернуть текущий элемент, без Exception
        queue.element();    // вернуть текущий, если пусто - исключение NoSuchElementException
        queue.size();       // размер массива
        queue.contains("str4"); // boolean содержит или нет элемент
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
