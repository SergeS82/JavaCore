package stream;

import java.util.stream.Stream;

public class Example06 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        String word = stringStream.reduce("", (b, c) -> b + c);
        System.out.println(word); // wolf
    }
}
