package stream.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Exercise1459 {
    public static void main(String[] args) {
        IntStream stream = IntStream.generate(() -> 15);
        OptionalDouble average = stream.mapToLong(integer -> integer)
                .average();
        System.out.println(average.orElseThrow(() -> new RuntimeException()));
    }
}
