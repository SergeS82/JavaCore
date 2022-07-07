package stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example02 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length)); // 5.33333333333333333
    }
}
