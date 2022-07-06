package DateTimeAPI.new_api;

import java.time.LocalTime;

public class Example1411 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 30); // строка 1
        time.withHour(14).plusMinutes(15);
        System.out.println(time);
        time = time.withHour(14);
        time = time.withMinute(15);
        System.out.println(time);
        time = LocalTime.of(14,14);
        System.out.println(time);
    }
}
