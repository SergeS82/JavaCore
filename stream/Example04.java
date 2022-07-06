package stream;

import java.util.stream.Stream;

public class Example04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> inf = Stream.generate(() -> "chimp");
        stream.findAny().ifPresent(System.out::println); // monkey
        inf.findAny().ifPresent(System.out::println); // chimp
    }
}
