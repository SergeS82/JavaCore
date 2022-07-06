package DateTimeAPI.new_api;

import java.time.*;

public class Exercise1411 {
    public static void main(String[] args) {
        ZonedDateTime zd =  ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Moscow"));
        ZonedDateTime zd2 =  ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(zd);
        System.out.println(zd2);
    }
}
