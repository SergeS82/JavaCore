package stream.debug;

import java.util.stream.IntStream;

public class Example01 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,4);
        System.out.println(intStream.peek(System.out::println).sum());
    }
}
