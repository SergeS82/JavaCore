package stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example01 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", ")); // lions, tigers, bears
        System.out.println(result);
    }
}
