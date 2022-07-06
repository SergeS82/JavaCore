package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Example1 {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty(); // строка 1
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length); // строка 2
    }
    public static void main(String[] args) {
        Optional<Double> op = average();
        System.out.println(op.orElseGet(()->null));
        System.out.println(op.orElse(Double.NaN));
        op.ifPresent(System.out::println);
        op.ifPresent((Double d) -> System.out.println(d));
        op.ifPresent((d) -> System.out.println(d));
        op.ifPresent(d -> System.out.println(d));
        op.ifPresent(d -> {System.out.println(d);});
        System.out.println(op.orElseGet(Math::random));
        average(90, 100).ifPresent(System.out::println);
        op.orElseThrow(IllegalStateException::new);
        op.orElseThrow(()->new IllegalStateException());
    }
}
