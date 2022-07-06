package stream;

import java.util.stream.Stream;

public class Exercise1453 {
    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(2, x -> x * 2);
        System.out.println(infinite.anyMatch(test -> test / 8 == 0));
    }
}
