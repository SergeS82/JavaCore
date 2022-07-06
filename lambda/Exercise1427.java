package lambda;

import java.util.function.*;

public class Exercise1427 {
    public static void main(String[] args) {
        //BiConsumer<Integer, Double> biConsumer = (a, b) -> 22.5d;
        Predicate<String> predicate = (String str) -> str.contains("abc");
        //Supplier<Long> supplier = () -> {};
        Function<String, Integer> function = (String s) -> s.length();
        //BinaryOperator<String> binaryOperator = s1, s2 -> s1.concat(s2);
        //UnaryOperator<Integer> unaryOperator = (String i) -> i;

    }
}
