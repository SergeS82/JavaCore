package stream;

import java.util.*;

// Без использования Stream
public class Example21 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) {
                filtered.add(name);
            }
        }

        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
