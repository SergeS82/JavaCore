package stream.primitive;

import java.util.stream.IntStream;

public class Exercise14511 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 100)
                .skip(50)
                .filter(i -> i % 2 == 0 || i % 5 == 0)
                .sum()
        );
    }
}
