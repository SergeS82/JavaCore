package stream;

import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {
        Stream<Integer> str = Stream.iterate(1, n -> n + 1);
        str
                .skip(5) // пропускаем первые 5 элементов
                .limit(2) // ограничиваем данные 2 элементами
                .forEach(System.out::println); // 67
    }
}
