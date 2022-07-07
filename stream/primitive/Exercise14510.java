package stream.primitive;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise14510 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
        Set<Double> doubles = new TreeSet<>(Comparator.reverseOrder());
        doubles.addAll(list);
        doubles.addAll(list2.stream().map(Double::valueOf).collect(Collectors.toCollection(TreeSet::new)));
        doubles.stream().forEach(System.out::println);
        // вариант2
        Stream.concat(list.stream(),list2.stream().map(Double::valueOf))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
/*        for (String s : list2) {
            doubles.add(Double.valueOf(s));
        }
        Set<Double> sortedDoubles = new TreeSet<>(Comparator.reverseOrder());
        sortedDoubles.addAll(list);
        sortedDoubles.addAll(doubles);
        for (double d : sortedDoubles) {
            System.out.println(d);
        }*/
    }

}
