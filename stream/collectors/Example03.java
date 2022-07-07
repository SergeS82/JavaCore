package stream.collectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example03 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result = ohMy
                .filter(s -> s.contains("i"))
                .collect(Collectors.toCollection(TreeSet::new)); // [lions, tigers]
        System.out.println(result);
    }
}
