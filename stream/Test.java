package stream;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.forEach(System.out::println);
    }
}
