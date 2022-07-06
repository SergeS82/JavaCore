package stream;

import java.util.stream.Stream;

public class Exercise1455 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        int result = stream
                .filter(integer -> integer <= 2)
                .findFirst()
                .orElse(4);
        System.out.println(result);
    }
}
