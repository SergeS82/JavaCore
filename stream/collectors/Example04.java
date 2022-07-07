package stream.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example04 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(Collectors.toMap(
                s -> s, String::length
        )); // {lions = 5, bears = 5, tigers = 6}
    }
}
