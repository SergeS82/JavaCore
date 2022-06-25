package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InterfaceDeque {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("str0");
        Deque<String> deque = new LinkedList<>(queue); // создать коллекцию проинициализировав элементами другой колеекции
        deque.addAll(queue);   // добавить элементы в конец очереди
        deque.push("str1"); // добавить элемент в начало очереди
        deque.add("str1");        // добавить, если не удалось Exception
        deque.offer("str2");   // добавить, без Exception
        deque.offer("str3");
        deque.element();     // взять элемент сначала очереди, если пусто NoSuchElementException
        System.out.println(deque.getFirst()); // взять элемент сначала очереди, если пусто NoSuchElementException
        System.out.println(deque.getLast()); // взять элемент сконца очереди, если пусто NoSuchElementException
        deque.peekFirst(); // взять элемент сначала очереди, без Exception
        deque.peekLast();  // взять элемент сконца очереди, без Exception
        deque.pollFirst(); // взять элемент сначала очереди и удалить, без Exception
        deque.pollLast();  // взять элемент сконца очереди и удалить, без Exception
        deque.remove();      // взять и удалить элемент сначала очереди или NoSuchElementException
        deque.removeFirst(); // тоже самое, для совместимости
        deque.removeLast();  // удалить элемент в конце очереди или NoSuchElementException
        System.out.println(deque.peek());
    }
}
