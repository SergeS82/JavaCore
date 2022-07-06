package stream;

import java.util.stream.Stream;

public class Example07 {
    public static void main(String[] args) {
        Stream<String> collectStream = Stream.of("w", "o", "l", "f");
        StringBuilder wolfBuilder = collectStream.collect(StringBuilder::new,(sb,s)->sb.append(s), StringBuilder::append);
        String wolf = wolfBuilder.toString();
        System.out.println(wolf); // wolf
    }
}
