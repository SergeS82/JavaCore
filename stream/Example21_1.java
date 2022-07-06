package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// С использованием Stream
public class Example21_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list
                .stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
