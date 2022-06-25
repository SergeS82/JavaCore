package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InterfaceDeque {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("str0");
        Deque<String> deque = new LinkedList<>(queue); // ������� ��������� ������������������ ���������� ������ ���������
        deque.addAll(queue);   // �������� �������� � ����� �������
        deque.push("str1"); // �������� ������� � ������ �������
        deque.add("str1");        // ��������, ���� �� ������� Exception
        deque.offer("str2");   // ��������, ��� Exception
        deque.offer("str3");
        deque.element();     // ����� ������� ������� �������, ���� ����� NoSuchElementException
        System.out.println(deque.getFirst()); // ����� ������� ������� �������, ���� ����� NoSuchElementException
        System.out.println(deque.getLast()); // ����� ������� ������ �������, ���� ����� NoSuchElementException
        deque.peekFirst(); // ����� ������� ������� �������, ��� Exception
        deque.peekLast();  // ����� ������� ������ �������, ��� Exception
        deque.pollFirst(); // ����� ������� ������� ������� � �������, ��� Exception
        deque.pollLast();  // ����� ������� ������ ������� � �������, ��� Exception
        deque.remove();      // ����� � ������� ������� ������� ������� ��� NoSuchElementException
        deque.removeFirst(); // ���� �����, ��� �������������
        deque.removeLast();  // ������� ������� � ����� ������� ��� NoSuchElementException
        System.out.println(deque.peek());
    }
}
