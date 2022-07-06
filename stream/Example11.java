package stream;

import java.util.stream.Stream;

// почему s нельзя использовать повторно если filter возвращает новый tream
public class Example11 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s
                .filter(x -> x.startsWith("m")) // оставляем лишь элементы начинающиеся с m
                .forEach(System.out::println); // monkey
    }
}
