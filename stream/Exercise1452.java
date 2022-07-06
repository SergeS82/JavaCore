package stream;

import java.util.stream.Stream;

public class Exercise1452 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(1d, 2.94d, 2.33d);
        System.out.println(stream.min((d1, d2) -> (int) (d1 - d2)).orElse(0d));
    }
}
