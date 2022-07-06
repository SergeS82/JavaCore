package lambda;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise1429 {
    public static void main(String[] args) {
        Integer i = 0;
        System.out.println(i.doubleValue());
        Function<Integer, Double> f1 = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer.doubleValue();
            }
        };
        Function<Integer, Double> f2 = (integer) -> integer.doubleValue();
        Function<Integer, Double> f3 = Integer::doubleValue;
        System.out.println(f3.apply(2));
    }


}
