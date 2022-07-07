package stream.collectors;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// объединение дублирующих
public class Example04_01 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length, // ключ - длина массива
                k -> k, // значение - сами строки
                (s1, s2) -> s1 + "," + s2, // таким образом объединяем строки по одинаковому ключу
                TreeMap::new // указали Java дать конкретную требуемую имплементацию
        )); // {5 = lions,bears, 6 = tigers}
        System.out.println(map.getClass()); // class java.util.TreeMap
    }
}
