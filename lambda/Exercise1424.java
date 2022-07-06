package lambda;

import java.util.function.Consumer;

public class Exercise1424 {
    public static void main(String[] args) {
        task(12, val -> System.out.println("qwerty"));
    }
    private static void task(int value, Consumer<Integer> param) {
        System.out.println(value);
    };  // вставьте тип
}
