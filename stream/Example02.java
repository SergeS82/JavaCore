package stream;

import java.util.stream.Stream;

public class Example02 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
    }
}
