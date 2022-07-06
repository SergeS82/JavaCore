package stream;

import java.util.stream.Stream;

public class Example05 {
    public static void main(String[] args) {
        Stream<String> printable = Stream.of("Monkey", "Gorilla", "Bonobo");
        printable.forEach(System.out::print); // MonkeyGorillaBonobo
    }
}
