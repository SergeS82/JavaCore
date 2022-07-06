package stream;

import java.util.stream.Stream;

public class Exercise1456 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("One", "Two");
        stream.limit(3).skip(2).forEach(System.out::println);
    }
}
