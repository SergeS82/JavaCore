package stream;

import java.util.stream.Stream;

// ������ s ������ ������������ �������� ���� filter ���������� ����� tream
public class Example11 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s
                .filter(x -> x.startsWith("m")) // ��������� ���� �������� ������������ � m
                .forEach(System.out::println); // monkey
    }
}
