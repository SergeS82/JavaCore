package lambda;

import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Exercise1428 {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = String::indexOf;
        BiPredicate<String, String> biPredicate = String::contains;
        //Supplier<String> supplier = Object::new;
        Function<String, Integer> function = Integer::valueOf;
        Consumer<List<Double>> consumer = Collections::sort;
    }
}
