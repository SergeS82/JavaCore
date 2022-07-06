package stream;

import java.util.stream.Stream;

public class Example12 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("duck", "duck", "duck", "goose");
        stream
                .distinct() // оставляем уникальные элементы
                .forEach(System.out::println); // duckgoose
    }
}
