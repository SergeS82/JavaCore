package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example15 {
    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("bonobo");
        List<String> two = Arrays.asList("mama gorilla", "baby gorilla");

        Stream<List<String>> animals = Stream.of(zero, one, two);
        Stream<String> stringStream = animals.flatMap(list -> list.stream());
        stringStream.forEach(System.out::print); // bonobomama gorillababy gorilla
    }
}
