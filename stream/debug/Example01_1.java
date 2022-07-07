package stream.debug;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//если в peek изменить коллекцию то результат будет неверный
//в peek для целей отладки следует реализовывать метод не меняющий данные
//вообще peek молжно использовать например для того чтобы выставить все авто на продажу
public class Example01_1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        Stream<List<Integer>> stream = Stream.of(list1, list2);
        stream.peek(list-> list.remove(0)).map(List::size).forEach(System.out::println);
    }
}
