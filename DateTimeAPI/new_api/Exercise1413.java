package DateTimeAPI.new_api;

import java.time.Duration;
import java.time.LocalTime;

public class Exercise1413 {
    public static boolean methodV1(LocalTime lt, Duration dr){
        return lt.plus(dr).compareTo(LocalTime.now()) > 0;
    }
    public static boolean methodV2(LocalTime lt, Duration dr){
        return lt.plus(dr).isAfter(LocalTime.now());
    }
    public static void main(String[] args) {
        System.out.println(methodV1(LocalTime.now(),Duration.ofHours(-1)));
        System.out.println(methodV2(LocalTime.now(),Duration.ofHours(-1)));
    }
}
