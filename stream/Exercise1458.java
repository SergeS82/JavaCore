package stream;

import java.util.*;

public class Exercise1458 {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        v2(ls);
    }
    public static void v1(List<String> ls){
        List<Integer> li = new ArrayList<>();
        Integer res = 1;
        for (String str : ls){
            li.add(str.length());
        }
        Collections.sort(li);
        for (Integer i : li){
            res = res*i;
        }
        System.out.println(res);
    }
    public static void v2(List<String> ls){
        Integer i = 1;
        System.out.println(ls.stream()
                .map(n -> n.length())
                .sorted()
                .reduce(1,(a,b)->a*b));
    }
}
