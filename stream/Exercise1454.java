package stream;

import java.util.stream.Stream;

public class Exercise1454 {
    public static void main(String[] args) {
        Stream<Long> stream = Stream.iterate(0L, l -> l + 100);
        boolean match = stream.allMatch(elem -> elem % 100 == 0);
        System.out.println(match);
    }
}
