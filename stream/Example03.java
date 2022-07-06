package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Example03 {
    public static void main(String[] args) {
        Stream<String> st = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = st.min((o1, o2) -> o1.length()-o2.length());
        // минимум по длине
        min.ifPresent(System.out::println); // ape
    }
}
