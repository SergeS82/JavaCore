package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example16 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown bear-", "grizzly-");
        s.sorted().forEach(System.out::print); // bear-brown-
        System.out.println("");
        Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
        s1.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear-
    }

}
