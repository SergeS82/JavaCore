package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        Stream<String> stream1 = Stream.of("monkey", "gorilla", "bonobo");
        stream1
                .map(String::length) // трансформируем строки в их длины, получаем Stream<Integer>
                .forEach(n -> li.add(n)); // 676
        System.out.println(li);
    }
}
